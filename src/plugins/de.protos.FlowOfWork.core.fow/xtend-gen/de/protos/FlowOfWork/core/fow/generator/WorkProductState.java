package de.protos.FlowOfWork.core.fow.generator;

import com.google.common.base.Objects;
import de.protos.FlowOfWork.core.fow.foW.State;
import de.protos.FlowOfWork.core.fow.foW.WorkProduct;
import de.protos.FlowOfWork.core.fow.foW.WorkProductType;

@SuppressWarnings("all")
public class WorkProductState {
  public WorkProduct prod;
  
  public State state;
  
  public WorkProductState(final WorkProduct prod, final State state) {
    this.prod = prod;
    this.state = state;
  }
  
  public boolean equals(final Object o) {
    boolean _not = (!(o instanceof WorkProductState));
    if (_not) {
      return false;
    }
    final WorkProductState wps = ((WorkProductState) o);
    boolean _and = false;
    boolean _equals = this.prod.equals(wps.prod);
    if (!_equals) {
      _and = false;
    } else {
      boolean _or = false;
      boolean _equals_1 = Objects.equal(this.state, wps.state);
      if (_equals_1) {
        _or = true;
      } else {
        boolean _equals_2 = this.state.equals(wps.state);
        _or = (_equals_1 || _equals_2);
      }
      _and = (_equals && _or);
    }
    return _and;
  }
  
  public int hashCode() {
    String stateName = "";
    String prodName = "";
    String typeName = "";
    boolean _notEquals = (!Objects.equal(this.state, null));
    if (_notEquals) {
      String _name = this.state.getName();
      stateName = _name;
    }
    boolean _notEquals_1 = (!Objects.equal(this.prod, null));
    if (_notEquals_1) {
      String _name_1 = this.prod.getName();
      typeName = _name_1;
      WorkProductType _type = this.prod.getType();
      boolean _notEquals_2 = (!Objects.equal(_type, null));
      if (_notEquals_2) {
        WorkProductType _type_1 = this.prod.getType();
        String _name_2 = _type_1.getName();
        typeName = _name_2;
      }
    }
    String _plus = ("wp:" + prodName);
    String _plus_1 = (_plus + ":wpt:");
    String _plus_2 = (_plus_1 + typeName);
    String _plus_3 = (_plus_2 + ":s:");
    String _plus_4 = (_plus_3 + stateName);
    return _plus_4.hashCode();
  }
}
