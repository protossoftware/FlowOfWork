package de.protos.FlowOfWork.core.fow.ui.builder;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

public class FoWAntBuilderParticipant extends BuilderParticipant implements IXtextBuilderParticipant {
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		super.build(context, monitor);
		// Get path to build script
		IFile buildFile = context.getBuiltProject().getFile("/doc-gen/dot/build.xml");
		String buildFilePath = buildFile.getLocationURI().getPath();
		// Run generated Ant script to create images using graphviz
		AntRunner runner = new AntRunner();
		runner.setBuildFileLocation(buildFilePath);
		runner.setArguments("-Dmessage=\"Generating images from DOT files\" -verbose");
		try {
			clearProblemMarkers(context.getBuiltProject());
			runner.run(monitor);
		} catch(CoreException e) {
			setProblemMarker(context.getBuiltProject(),
					"Unable to generate images. Check that the dot binary is "
					+ "on the system environment path, or the path to the dot "
					+ "binary is set via environment variable \"DOT_PATH\" or "
					+ "ANT property \"dot.binpath\"");
		}
	}
	
	protected void clearProblemMarkers(IResource res) throws CoreException {
		if(res.findMarkers("de.protos.FlowOfWork.core.fow.ui.fow.builder.problemmarker", false, IResource.DEPTH_ZERO).length > 0) {
			res.deleteMarkers("de.protos.FlowOfWork.core.fow.ui.fow.builder.problemmarker", false, IResource.DEPTH_ZERO);
		}
	}
	
	protected void setProblemMarker(IResource res, String msg) throws CoreException {
		IMarker error = res.createMarker("de.protos.FlowOfWork.core.fow.ui.fow.builder.problemmarker");
		error.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		error.setAttribute(IMarker.MESSAGE, msg);
	}
}
