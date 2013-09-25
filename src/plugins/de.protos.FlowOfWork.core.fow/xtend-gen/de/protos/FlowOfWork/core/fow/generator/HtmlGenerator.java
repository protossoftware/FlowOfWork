/**
 * Copyright (c) 2013 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * CONTRIBUTORS:
 * 		Thomas Schuetz (initial contribution)
 */
package de.protos.FlowOfWork.core.fow.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.ActivityRef;
import de.protos.FlowOfWork.core.fow.foW.Guidance;
import de.protos.FlowOfWork.core.fow.foW.GuidanceType;
import de.protos.FlowOfWork.core.fow.foW.Model;
import de.protos.FlowOfWork.core.fow.foW.NamedElement;
import de.protos.FlowOfWork.core.fow.foW.Port;
import de.protos.FlowOfWork.core.fow.foW.Role;
import de.protos.FlowOfWork.core.fow.foW.State;
import de.protos.FlowOfWork.core.fow.foW.Textfield;
import de.protos.FlowOfWork.core.fow.foW.WorkProduct;
import de.protos.FlowOfWork.core.fow.foW.WorkProductType;
import de.protos.FlowOfWork.core.fow.generator.MetamodelHelpers;
import de.protos.FlowOfWork.core.fow.generator.PathInfo;
import de.protos.FlowOfWork.core.fow.generator.TextInfo;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class HtmlGenerator {
  @Inject
  private PathInfo pathInfo;
  
  @Inject
  private TextInfo textInfo;
  
  public void generateHTML(final Model model, final IFileSystemAccess fsa) {
    this.generateHTMLIndexPageFile(model, fsa);
    this.generateHTMLTypeIndexFiles(model, fsa);
    this.generateHTMLForAllActivities(model, fsa);
    this.generateHTMLForAllRoles(model, fsa);
    this.generateHTMLForAllWorkProducts(model, fsa);
    this.generateHTMLForAllGuidances(model, fsa);
  }
  
  public void generateHTMLIndexPageFile(final Model model, final IFileSystemAccess fsa) {
    String _htmlGenPath = this.pathInfo.getHtmlGenPath();
    String _plus = (_htmlGenPath + "Index.html");
    CharSequence _generateHTMLIndexPageContent = this.generateHTMLIndexPageContent(model);
    fsa.generateFile(_plus, _generateHTMLIndexPageContent);
  }
  
  public CharSequence generateHTMLIndexPageContent(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Index Pages<h1>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2><a href=\"IndexActivities.html\">All Activities</a><h2>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2><a href=\"IndexRoles.html\">All Roles</a><h2>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2><a href=\"IndexWorkProducts.html\">All WorkProducts</a><h2>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2><a href=\"IndexWorkProductTypes.html\">All WorkProductTypes</a><h2>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2><a href=\"IndexGuidances.html\">All Guidances</a><h2>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2><a href=\"IndexGuidanceTypes.html\">All GuidanceTypes</a><h2>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public void generateHTMLTypeIndexFiles(final Model model, final IFileSystemAccess fsa) {
    String _htmlGenPath = this.pathInfo.getHtmlGenPath();
    String _plus = (_htmlGenPath + "IndexActivities.html");
    EList<Activity> _activities = model.getActivities();
    BasicEList<NamedElement> _basicEList = new BasicEList<NamedElement>(_activities);
    CharSequence _generateHTMLElementIndexContent = this.generateHTMLElementIndexContent(_basicEList, "Activities");
    fsa.generateFile(_plus, _generateHTMLElementIndexContent);
    String _htmlGenPath_1 = this.pathInfo.getHtmlGenPath();
    String _plus_1 = (_htmlGenPath_1 + "IndexRoles.html");
    EList<Role> _roles = model.getRoles();
    BasicEList<NamedElement> _basicEList_1 = new BasicEList<NamedElement>(_roles);
    CharSequence _generateHTMLElementIndexContent_1 = this.generateHTMLElementIndexContent(_basicEList_1, "Roles");
    fsa.generateFile(_plus_1, _generateHTMLElementIndexContent_1);
    String _htmlGenPath_2 = this.pathInfo.getHtmlGenPath();
    String _plus_2 = (_htmlGenPath_2 + "IndexWorkProducts.html");
    EList<WorkProduct> _workProducts = model.getWorkProducts();
    BasicEList<NamedElement> _basicEList_2 = new BasicEList<NamedElement>(_workProducts);
    CharSequence _generateHTMLElementIndexContent_2 = this.generateHTMLElementIndexContent(_basicEList_2, "WorkProducts");
    fsa.generateFile(_plus_2, _generateHTMLElementIndexContent_2);
    String _htmlGenPath_3 = this.pathInfo.getHtmlGenPath();
    String _plus_3 = (_htmlGenPath_3 + "IndexGuidances.html");
    EList<Guidance> _guidances = model.getGuidances();
    BasicEList<NamedElement> _basicEList_3 = new BasicEList<NamedElement>(_guidances);
    CharSequence _generateHTMLElementIndexContent_3 = this.generateHTMLElementIndexContent(_basicEList_3, "Guidances");
    fsa.generateFile(_plus_3, _generateHTMLElementIndexContent_3);
    String _htmlGenPath_4 = this.pathInfo.getHtmlGenPath();
    String _plus_4 = (_htmlGenPath_4 + "IndexWorkProductTypes.html");
    EList<WorkProductType> _workProductTypes = model.getWorkProductTypes();
    BasicEList<NamedElement> _basicEList_4 = new BasicEList<NamedElement>(_workProductTypes);
    CharSequence _generateHTMLElementTypeList = this.generateHTMLElementTypeList(_basicEList_4, "WorkProductTypes");
    fsa.generateFile(_plus_4, _generateHTMLElementTypeList);
    String _htmlGenPath_5 = this.pathInfo.getHtmlGenPath();
    String _plus_5 = (_htmlGenPath_5 + "IndexGuidanceTypes.html");
    EList<GuidanceType> _guidanceTypes = model.getGuidanceTypes();
    BasicEList<NamedElement> _basicEList_5 = new BasicEList<NamedElement>(_guidanceTypes);
    CharSequence _generateHTMLElementTypeList_1 = this.generateHTMLElementTypeList(_basicEList_5, "GuidanceTypes");
    fsa.generateFile(_plus_5, _generateHTMLElementTypeList_1);
  }
  
  public CharSequence generateHTMLElementIndexContent(final EList<NamedElement> elements, final String elementType) {
    CharSequence _xblockexpression = null;
    {
      final Function1<NamedElement,String> _function = new Function1<NamedElement,String>() {
          public String apply(final NamedElement e) {
            String _name = e.getName();
            return _name;
          }
        };
      List<NamedElement> sortedElements = IterableExtensions.<NamedElement, String>sortBy(elements, _function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<h1>Index ");
      _builder.append(elementType, "");
      _builder.append("<h1>");
      _builder.newLineIfNotEmpty();
      _builder.append("<ul>");
      _builder.newLine();
      {
        for(final NamedElement element : sortedElements) {
          _builder.append("\t");
          _builder.append("<li>");
          CharSequence _generateHTML_HRef = this.generateHTML_HRef(element);
          _builder.append(_generateHTML_HRef, "	");
          _builder.append("</li>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("<ul>");
      _builder.newLine();
      _builder.append("<html>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateHTMLElementTypeList(final EList<NamedElement> elements, final String elementType) {
    CharSequence _xblockexpression = null;
    {
      final Function1<NamedElement,String> _function = new Function1<NamedElement,String>() {
          public String apply(final NamedElement e) {
            String _name = e.getName();
            return _name;
          }
        };
      List<NamedElement> sortedElements = IterableExtensions.<NamedElement, String>sortBy(elements, _function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<h1>Index ");
      _builder.append(elementType, "");
      _builder.append("<h1>");
      _builder.newLineIfNotEmpty();
      _builder.append("<table border=\"1\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<thead>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tr>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<th>Name</th>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<th>Summary</th>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<th>Description</th>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</tr>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</thead>");
      _builder.newLine();
      {
        for(final NamedElement element : sortedElements) {
          _builder.append("\t");
          _builder.append("<tbody>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<tr>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<td>");
          String _label = this.textInfo.getLabel(element);
          _builder.append(_label, "			");
          _builder.append("</td>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<td>");
          Textfield _textfield = element.getTextfield();
          String _summary = _textfield.getSummary();
          _builder.append(_summary, "			");
          _builder.append("</td>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<td>");
          Textfield _textfield_1 = element.getTextfield();
          String _description = _textfield_1.getDescription();
          _builder.append(_description, "			");
          _builder.append(" </td>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</tr>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</tbody>");
          _builder.newLine();
        }
      }
      _builder.append("</table>");
      _builder.newLine();
      _builder.append("<html>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  private void generateHTMLForAllActivities(final Model model, final IFileSystemAccess fsa) {
    EList<Activity> _activities = model.getActivities();
    for (final Activity activity : _activities) {
      String _htmlGenPath = this.pathInfo.getHtmlGenPath(activity);
      CharSequence _generateHTMLForOneActivity = this.generateHTMLForOneActivity(activity);
      fsa.generateFile(_htmlGenPath, _generateHTMLForOneActivity);
    }
  }
  
  private CharSequence generateHTMLForOneActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Activity: ");
    String _label = this.textInfo.getLabel(activity);
    _builder.append(_label, "	");
    _builder.append("</h1> ");
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
    _builder.append("<col width=\"17%\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"33%\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"17%\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<col width=\"33%\">");
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
    _builder.append("<td colspan=\"3\">");
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
    _builder.append("<b>Inputs:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"1\">");
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
            CharSequence _generateHTMLForPort = this.generateHTMLForPort(inPort);
            _builder.append(_generateHTMLForPort, "				");
            _builder.append("</li>");
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
    _builder.append("<td colspan=\"1\">");
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
            CharSequence _generateHTMLForPort_1 = this.generateHTMLForPort(outPort);
            _builder.append(_generateHTMLForPort_1, "				");
            _builder.append("</a> </li>");
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
    _builder.append("<b>Responsible:</b>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td colspan=\"3\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    Role _role = activity.getRole();
    CharSequence _generateHTML_HRef = this.generateHTML_HRef(_role);
    _builder.append(_generateHTML_HRef, "				");
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
    _builder.append("<td colspan=\"3\">");
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
    _builder.append("<h2>Activities and Responsibilities (Sub Activities)</h2>");
    _builder.newLine();
    {
      EList<ActivityRef> _subActivities = activity.getSubActivities();
      boolean _emptyList = MetamodelHelpers.emptyList(_subActivities);
      if (_emptyList) {
        _builder.append("<p><em>no sub activities</em></p>");
        _builder.newLine();
      } else {
        _builder.append("<table border=\"1\" width=\"100%\">");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<b>Activity</b>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<b>Role</b>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
        {
          EList<ActivityRef> _subActivities_1 = activity.getSubActivities();
          for(final ActivityRef subActivity : _subActivities_1) {
            _builder.append("\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            Activity _type = subActivity.getType();
            CharSequence _generateHTML_HRef_1 = this.generateHTML_HRef(_type);
            _builder.append(_generateHTML_HRef_1, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</td>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            Activity _type_1 = subActivity.getType();
            Role _role_1 = _type_1.getRole();
            CharSequence _generateHTML_HRef_2 = this.generateHTML_HRef(_role_1);
            _builder.append(_generateHTML_HRef_2, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</td>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</tr>");
            _builder.newLine();
          }
        }
        _builder.append("</table>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("<h2>Structure Diagram</h2>");
    _builder.newLine();
    _builder.append("<img src=\"../dot/");
    String _name = activity.getName();
    _builder.append(_name, "");
    _builder.append(".jpg\" alt=\"Activity Diagram: ");
    String _name_1 = activity.getName();
    _builder.append(_name_1, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("<h2>Behavior Diagram</h2>");
    _builder.newLine();
    {
      boolean _hasBehavior = MetamodelHelpers.hasBehavior(activity);
      if (_hasBehavior) {
        _builder.append("<img src=\"../dot/");
        String _name_2 = activity.getName();
        _builder.append(_name_2, "");
        _builder.append("_Behavior.jpg\" alt=\"Behavior Diagram: ");
        String _name_3 = activity.getName();
        _builder.append(_name_3, "");
        _builder.append("_Behavior\"> ");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<p><em>no behavior</em></p>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("<h2>Guidances</h2>");
    _builder.newLine();
    {
      EList<Guidance> _guidances = activity.getGuidances();
      boolean _emptyList_1 = MetamodelHelpers.emptyList(_guidances);
      if (_emptyList_1) {
        _builder.append("<p><em>no guidances</em></p>");
        _builder.newLine();
      } else {
        EList<Guidance> _guidances_1 = activity.getGuidances();
        CharSequence _generateHTMLForGuidanceList = this.generateHTMLForGuidanceList(_guidances_1);
        _builder.append(_generateHTMLForGuidanceList, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateHTMLForPort(final Port p) {
    StringConcatenation _builder = new StringConcatenation();
    WorkProduct _type = p.getType();
    CharSequence _generateHTML_HRef = this.generateHTML_HRef(_type);
    _builder.append(_generateHTML_HRef, "");
    {
      State _state = p.getState();
      boolean _notEquals = (!Objects.equal(_state, null));
      if (_notEquals) {
        _builder.append(" (");
        State _state_1 = p.getState();
        String _name = _state_1.getName();
        _builder.append(_name, "");
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private void generateHTMLForAllRoles(final Model model, final IFileSystemAccess fsa) {
    EList<Role> _roles = model.getRoles();
    for (final Role role : _roles) {
      String _htmlGenPath = this.pathInfo.getHtmlGenPath(role);
      CharSequence _generateHTMLForOneRole = this.generateHTMLForOneRole(role);
      fsa.generateFile(_htmlGenPath, _generateHTMLForOneRole);
    }
  }
  
  private CharSequence generateHTML_HRef(final NamedElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(".html\">");
    String _label = this.textInfo.getLabel(element);
    _builder.append(_label, "");
    _builder.append("</a>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence generateHTMLForOneRole(final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Role: ");
    String _label = this.textInfo.getLabel(role);
    _builder.append(_label, "	");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>Summary</h2>");
    _builder.newLine();
    _builder.append("\t");
    Textfield _textfield = role.getTextfield();
    String _summary = _textfield.getSummary();
    _builder.append(_summary, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>Description</h2>");
    _builder.newLine();
    _builder.append("\t");
    Textfield _textfield_1 = role.getTextfield();
    String _description = _textfield_1.getDescription();
    _builder.append(_description, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  private void generateHTMLForAllWorkProducts(final Model model, final IFileSystemAccess fsa) {
    EList<WorkProduct> _workProducts = model.getWorkProducts();
    for (final WorkProduct workProduct : _workProducts) {
      String _htmlGenPath = this.pathInfo.getHtmlGenPath(workProduct);
      CharSequence _generateHTMLForOneWorkProduct = this.generateHTMLForOneWorkProduct(workProduct);
      fsa.generateFile(_htmlGenPath, _generateHTMLForOneWorkProduct);
    }
  }
  
  private CharSequence generateHTMLForOneWorkProduct(final WorkProduct workProduct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>WorkProduct: ");
    String _label = this.textInfo.getLabel(workProduct);
    _builder.append(_label, "	");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>WorkProductType</h2>");
    _builder.newLine();
    _builder.append("\t");
    WorkProductType _type = workProduct.getType();
    String _name = _type.getName();
    _builder.append(_name, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>Summary</h2>");
    _builder.newLine();
    _builder.append("\t");
    Textfield _textfield = workProduct.getTextfield();
    String _summary = _textfield.getSummary();
    _builder.append(_summary, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>Description</h2>");
    _builder.newLine();
    _builder.append("\t");
    Textfield _textfield_1 = workProduct.getTextfield();
    String _description = _textfield_1.getDescription();
    _builder.append(_description, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  private void generateHTMLForAllGuidances(final Model model, final IFileSystemAccess fsa) {
    EList<Guidance> _guidances = model.getGuidances();
    for (final Guidance guidance : _guidances) {
      String _htmlGenPath = this.pathInfo.getHtmlGenPath(guidance);
      CharSequence _generateHTMLForOneGuidance = this.generateHTMLForOneGuidance(guidance);
      fsa.generateFile(_htmlGenPath, _generateHTMLForOneGuidance);
    }
  }
  
  private CharSequence generateHTMLForOneGuidance(final Guidance guidance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Guidance: ");
    String _label = this.textInfo.getLabel(guidance);
    _builder.append(_label, "	");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>GuidanceType</h2>");
    _builder.newLine();
    _builder.append("\t");
    GuidanceType _type = guidance.getType();
    String _name = _type.getName();
    _builder.append(_name, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>Summary</h2>");
    _builder.newLine();
    _builder.append("\t");
    Textfield _textfield = guidance.getTextfield();
    String _summary = _textfield.getSummary();
    _builder.append(_summary, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>Description</h2>");
    _builder.newLine();
    _builder.append("\t");
    Textfield _textfield_1 = guidance.getTextfield();
    String _description = _textfield_1.getDescription();
    _builder.append(_description, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateHTMLForGuidanceList(final EList<Guidance> guidances) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table border=\"1\" width=\"100%\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<colgroup>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<col width=\"50%\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<col width=\"50%\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</colgroup>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Guidance");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Guidance Type");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</th>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</tr>");
    _builder.newLine();
    {
      for(final Guidance guidance : guidances) {
        _builder.append("\t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        CharSequence _generateHTML_HRef = this.generateHTML_HRef(guidance);
        _builder.append(_generateHTML_HRef, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        GuidanceType _type = guidance.getType();
        String _name = _type.getName();
        _builder.append(_name, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</td>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
}
