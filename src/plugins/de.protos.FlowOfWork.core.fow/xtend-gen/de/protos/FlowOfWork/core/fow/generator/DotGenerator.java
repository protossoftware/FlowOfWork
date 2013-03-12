package de.protos.FlowOfWork.core.fow.generator;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.generator.PathInfo;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@Singleton
@SuppressWarnings("all")
public class DotGenerator {
  @Inject
  private PathInfo pathInfo;
  
  public void generateDot(final Model model, final IFileSystemAccess fsa) {
    this.generateActivityDiagramForAllActivities(model, fsa);
  }
  
  private void generateActivityDiagramForAllActivities(final Model model, final IFileSystemAccess fsa) {
    EList<Activity> _activities = model.getActivities();
    for (final Activity activity : _activities) {
      String _dotGenPath = this.pathInfo.getDotGenPath(activity);
      CharSequence _generateDeepActivityDiagramForOneActivity = this.generateDeepActivityDiagramForOneActivity(activity);
      fsa.generateFile(_dotGenPath, _generateDeepActivityDiagramForOneActivity);
    }
    this.generateDotMakefile(fsa);
  }
  
  private CharSequence generateDeepActivityDiagramForOneActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph ");
    String _name = activity.getName();
    _builder.append(_name, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rankdir=TD;");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateRecursiveActivityDiagram = this.generateRecursiveActivityDiagram(activity);
    _builder.append(_generateRecursiveActivityDiagram, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateRecursiveActivityDiagram(final Activity activity) {
    EList<ActivityRef> _subActivities = activity.getSubActivities();
    boolean _isEmpty = _subActivities.isEmpty();
    if (_isEmpty) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = activity.getName();
      _builder.append(_name, "");
      _builder.append(" [shape=pentagon,color=orange,style=filled, orientation=-90]");
      _builder.newLineIfNotEmpty();
      return _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("subgraph cluster_");
      String _name_1 = activity.getName();
      _builder_1.append(_name_1, "");
      _builder_1.append(" {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("label = \"");
      String _name_2 = activity.getName();
      _builder_1.append(_name_2, "	");
      _builder_1.append("\"");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("color=black");
      _builder_1.newLine();
      {
        EList<ActivityRef> _subActivities_1 = activity.getSubActivities();
        for(final ActivityRef subactivity : _subActivities_1) {
          _builder_1.append("\t");
          Activity _type = subactivity.getType();
          CharSequence _generateRecursiveActivityDiagram = this.generateRecursiveActivityDiagram(_type);
          _builder_1.append(_generateRecursiveActivityDiagram, "	");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("}");
      _builder_1.newLine();
      return _builder_1;
    }
  }
  
  private void generateDotMakefile(final IFileSystemAccess fsa) {
    CharSequence _generateDotMakefileContent = this.generateDotMakefileContent();
    fsa.generateFile("../doc-gen/dot/Makefile", _generateDotMakefileContent);
  }
  
  private CharSequence generateDotMakefileContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DOTFILELIST = $(wildcard *.dot)");
    _builder.newLine();
    _builder.append("JPGFILELIST = $(patsubst %.dot, %.jpg, $(DOTFILELIST))");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# make jpg out of dot files");
    _builder.newLine();
    _builder.append("%.jpg: %.dot ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("dot -Tjpg $*.dot -o $*.jpg");
    _builder.newLine();
    _builder.newLine();
    _builder.append("dot2jpg: $(JPGFILELIST)");
    _builder.newLine();
    return _builder;
  }
}
