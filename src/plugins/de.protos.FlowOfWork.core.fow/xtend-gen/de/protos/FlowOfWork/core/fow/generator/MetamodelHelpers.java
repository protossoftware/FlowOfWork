package de.protos.FlowOfWork.core.fow.generator;

import com.google.common.base.Objects;
import de.protos.FlowOfWork.core.fow.foW.Activity;
import de.protos.FlowOfWork.core.fow.foW.Step;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MetamodelHelpers {
  public static boolean hasBehavior(final Activity activity) {
    EList<Step> _steps = activity.getSteps();
    boolean _emptyList = MetamodelHelpers.emptyList(_steps);
    return (!_emptyList);
  }
  
  public static boolean emptyList(final EList list) {
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      return true;
    } else {
      boolean _isEmpty = list.isEmpty();
      if (_isEmpty) {
        return true;
      } else {
        return false;
      }
    }
  }
}
