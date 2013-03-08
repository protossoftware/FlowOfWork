package de.protos.FlowOfWork.core.fow.generator;

import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.Role;
import de.protos.FlowOfWork.core.fow.foW.Textfield;
import de.protos.FlowOfWork.core.fow.foW.WorkProduct;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FoWGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    this.generateHTMLDoc(((Model) _head), fsa);
  }
  
  public void generateHTMLDoc(final Model model, final IFileSystemAccess fsa) {
    this.generateHTMLDocAllActivities(model, fsa);
  }
  
  public void generateHTMLDocAllActivities(final Model model, final IFileSystemAccess fsa) {
    EList<Activity> _activities = model.getActivities();
    for (final Activity activity : _activities) {
      String _name = activity.getName();
      String _plus = ("../doc-gen/html/" + _name);
      String _plus_1 = (_plus + ".html");
      CharSequence _generateHTMLDocOneActivity = this.generateHTMLDocOneActivity(activity);
      fsa.generateFile(_plus_1, _generateHTMLDocOneActivity);
    }
  }
  
  public CharSequence generateHTMLDocOneActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Activity: ");
    String _name = activity.getName();
    _builder.append(_name, "	");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table border=\"1\" width=\"100%\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<colgroup>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"1*\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"2*\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"1*\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"2*\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</colgroup>");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Purpose:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"5\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    Textfield _textfield = activity.getTextfield();
    String _summary = _textfield.getSummary();
    _builder.append(_summary, "				");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Scope:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"5\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<em>Where does the scope come from?</em>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Inputs:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"2\">");
    _builder.newLine();
    {
      EList<Port> _inPorts = activity.getInPorts();
      int _size = _inPorts.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t\t\t\t");
        _builder.append("<ul>");
        _builder.newLine();
        {
          EList<Port> _inPorts_1 = activity.getInPorts();
          for(final Port inPort : _inPorts_1) {
            _builder.append("\t\t\t\t");
            _builder.append("<li>");
            String _name_1 = inPort.getName();
            _builder.append(_name_1, "				");
            _builder.append(" : ");
            WorkProduct _type = inPort.getType();
            String _name_2 = _type.getName();
            _builder.append(_name_2, "				");
            _builder.append(" </li>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t\t");
        _builder.append("</ul>");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t\t");
        _builder.append("<em>no inputs</em>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Outputs:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"2\">");
    _builder.newLine();
    {
      EList<Port> _outPorts = activity.getOutPorts();
      int _size_1 = _outPorts.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("\t\t\t\t");
        _builder.append("<ul>");
        _builder.newLine();
        {
          EList<Port> _outPorts_1 = activity.getOutPorts();
          for(final Port outPort : _outPorts_1) {
            _builder.append("\t\t\t\t");
            _builder.append("<li>");
            String _name_3 = outPort.getName();
            _builder.append(_name_3, "				");
            _builder.append(" : ");
            WorkProduct _type_1 = outPort.getType();
            String _name_4 = _type_1.getName();
            _builder.append(_name_4, "				");
            _builder.append(" </li>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t\t");
        _builder.append("</ul>");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t\t");
        _builder.append("<em>no outputs</em>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Entry Criteria:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"2\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<em>really needed???</em>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Exit Criteria:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"2\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<em>really needed???</em>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Responsible:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"5\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    Role _role = activity.getRole();
    String _name_5 = _role.getName();
    _builder.append(_name_5, "				");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<b>Description:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"5\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    Textfield _textfield_1 = activity.getTextfield();
    String _description = _textfield_1.getDescription();
    _builder.append(_description, "				");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<h2>Activities and Responsibilities</h2>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<ActivityRef> _subActivities = activity.getSubActivities();
      for(final ActivityRef subActivity : _subActivities) {
        _builder.append("\t");
        _builder.append("<li>Activity Reference: ");
        String _name_6 = subActivity.getName();
        _builder.append(_name_6, "	");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<ul>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<li>Activity Type: ");
        Activity _type_2 = subActivity.getType();
        String _name_7 = _type_2.getName();
        _builder.append(_name_7, "			");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<li>Role: ");
        Activity _type_3 = subActivity.getType();
        Role _role_1 = _type_3.getRole();
        String _name_8 = _role_1.getName();
        _builder.append(_name_8, "			");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</ul> ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</li>");
        _builder.newLine();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("<h2>Guidelines</h2>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
