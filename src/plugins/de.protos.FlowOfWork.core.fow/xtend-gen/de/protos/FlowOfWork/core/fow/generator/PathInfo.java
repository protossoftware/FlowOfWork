package de.protos.FlowOfWork.core.fow.generator;

import com.google.inject.Singleton;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.NamedElement;

@Singleton
@SuppressWarnings("all")
public class PathInfo {
  public String getDocGenPath() {
    return "../doc-gen/";
  }
  
  public String getHtmlGenPath() {
    String _docGenPath = this.getDocGenPath();
    return (_docGenPath + "html/");
  }
  
  public String getHtmlGenPath(final NamedElement element) {
    String _htmlGenPath = this.getHtmlGenPath();
    String _name = element.getName();
    String _plus = (_htmlGenPath + _name);
    return (_plus + ".html");
  }
  
  public String getDotGenPath() {
    String _docGenPath = this.getDocGenPath();
    return (_docGenPath + "dot/");
  }
  
  public String getDotGenPath(final Activity activity) {
    String _dotGenPath = this.getDotGenPath();
    String _name = activity.getName();
    String _plus = (_dotGenPath + _name);
    return (_plus + ".dot");
  }
  
  public String getJpgGenPath(final Activity activity) {
    String _dotGenPath = this.getDotGenPath();
    String _name = activity.getName();
    String _plus = (_dotGenPath + _name);
    return (_plus + ".jpg");
  }
  
  public String getDotActivityBehaviorPath(final Activity activity) {
    String _dotGenPath = this.getDotGenPath();
    String _name = activity.getName();
    String _plus = (_dotGenPath + _name);
    return (_plus + "_Behavior.dot");
  }
  
  public String getJpgActivityBehaviorPath(final Activity activity) {
    String _dotGenPath = this.getDotGenPath();
    String _name = activity.getName();
    String _plus = (_dotGenPath + _name);
    return (_plus + "_Behavior.jpg");
  }
}
