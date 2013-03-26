package de.protos.FlowOfWork.core.fow.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.Decision;
import de.protos.FlowOfWork.core.fow.foW.DecisionTransition;
import de.protos.FlowOfWork.core.fow.foW.FinalTransition;
import de.protos.FlowOfWork.core.fow.foW.InitialTransition;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.foW.Node;
import de.protos.FlowOfWork.core.fow.foW.NonInitialTransition;
import de.protos.FlowOfWork.core.fow.foW.Step;
import de.protos.FlowOfWork.core.fow.foW.Transition;
import de.protos.FlowOfWork.core.fow.generator.PathInfo;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@Singleton
@SuppressWarnings("all")
public class DotGenerator {
  @Inject
  private PathInfo pathInfo;
  
  public void generateDot(final Model model, final IFileSystemAccess fsa) {
    this.generateActivityDiagramsForAllActivities(model, fsa);
    this.generateDotMakefile(fsa);
  }
  
  private void generateActivityDiagramsForAllActivities(final Model model, final IFileSystemAccess fsa) {
    EList<Activity> _activities = model.getActivities();
    for (final Activity activity : _activities) {
      {
        String _dotGenPath = this.pathInfo.getDotGenPath(activity);
        CharSequence _generateDeepActivityDiagramForOneActivity = this.generateDeepActivityDiagramForOneActivity(activity);
        fsa.generateFile(_dotGenPath, _generateDeepActivityDiagramForOneActivity);
        boolean _hasBehavior = this.hasBehavior(activity);
        if (_hasBehavior) {
          String _dotActivityBehaviorPath = this.pathInfo.getDotActivityBehaviorPath(activity);
          CharSequence _generateActivityBehavior = this.generateActivityBehavior(activity);
          fsa.generateFile(_dotActivityBehaviorPath, _generateActivityBehavior);
        }
      }
    }
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
  
  private CharSequence generateActivityBehavior(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph ");
    String _name = activity.getName();
    _builder.append(_name, "");
    _builder.append("_Behavior{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("rankdir=TD;");
    _builder.newLine();
    _builder.append("\t");
    EList<Step> _steps = activity.getSteps();
    CharSequence _generateAllSteps = this.generateAllSteps(_steps);
    _builder.append(_generateAllSteps, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Decision> _decisions = activity.getDecisions();
    CharSequence _generateAllDecisions = this.generateAllDecisions(_decisions);
    _builder.append(_generateAllDecisions, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Transition> _transitions = activity.getTransitions();
    CharSequence _generateAllTransitions = this.generateAllTransitions(_transitions);
    _builder.append(_generateAllTransitions, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public boolean hasBehavior(final Activity activity) {
    EList<Step> _steps = activity.getSteps();
    return this.emptyList(_steps);
  }
  
  public boolean emptyList(final EList list) {
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      return false;
    } else {
      boolean _isEmpty = list.isEmpty();
      if (_isEmpty) {
        return false;
      } else {
        return true;
      }
    }
  }
  
  private CharSequence generateAllSteps(final EList<Step> steps) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Step step : steps) {
        String _name = step.getName();
        _builder.append(_name, "");
        _builder.append(" [shape=ellipse]");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence generateAllDecisions(final EList<Decision> decisions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Decision decision : decisions) {
        String _name = decision.getName();
        _builder.append(_name, "");
        _builder.append(" [shape=diamond]");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence generateAllTransitions(final EList<Transition> transitions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Transition transition : transitions) {
        CharSequence _generateTransition = this.generateTransition(transition);
        _builder.append(_generateTransition, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence _generateTransition(final InitialTransition transition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("i [shape = circle, color=black, style=filled] ");
    _builder.newLine();
    _builder.append("i -> ");
    Node _to = transition.getTo();
    String _name = _to.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence _generateTransition(final FinalTransition transition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("f [shape = doublecircle, color=black, style=filled] ");
    _builder.newLine();
    Node _from = transition.getFrom();
    String _name = _from.getName();
    _builder.append(_name, "");
    _builder.append(" -> f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence _generateTransition(final NonInitialTransition transition) {
    StringConcatenation _builder = new StringConcatenation();
    Node _from = transition.getFrom();
    String _name = _from.getName();
    _builder.append(_name, "");
    _builder.append(" -> ");
    Node _to = transition.getTo();
    String _name_1 = _to.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence _generateTransition(final DecisionTransition transition) {
    StringConcatenation _builder = new StringConcatenation();
    Decision _from = transition.getFrom();
    String _name = _from.getName();
    _builder.append(_name, "");
    _builder.append(" -> ");
    Node _to = transition.getTo();
    String _name_1 = _to.getName();
    _builder.append(_name_1, "");
    _builder.append(" [label=\"[");
    String _guard = transition.getGuard();
    _builder.append(_guard, "");
    _builder.append("]\"]");
    _builder.newLineIfNotEmpty();
    return _builder;
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
  
  private CharSequence generateTransition(final Transition transition) {
    if (transition instanceof DecisionTransition) {
      return _generateTransition((DecisionTransition)transition);
    } else if (transition instanceof FinalTransition) {
      return _generateTransition((FinalTransition)transition);
    } else if (transition instanceof InitialTransition) {
      return _generateTransition((InitialTransition)transition);
    } else if (transition instanceof NonInitialTransition) {
      return _generateTransition((NonInitialTransition)transition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(transition).toString());
    }
  }
}
