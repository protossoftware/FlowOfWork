package de.protos.FlowOfWork.core.fow.generator;

import com.google.inject.Inject;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.generator.DotGenerator;
import de.protos.FlowOfWork.core.fow.generator.HtmlGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FoWGenerator implements IGenerator {
  @Inject
  private DotGenerator dotGenerator;
  
  @Inject
  private HtmlGenerator htmlGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    this.htmlGenerator.generateHTML(((Model) _head), fsa);
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    this.dotGenerator.generateDot(((Model) _head_1), fsa);
  }
}
