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
import com.google.inject.Singleton;
import de.protos.FlowOfWork.core.fow.foW.NamedElement;
import de.protos.FlowOfWork.core.fow.foW.Textfield;

@Singleton
@SuppressWarnings("all")
public class TextInfo {
  public String getLabel(final NamedElement element) {
    Textfield _textfield = element.getTextfield();
    String _label = _textfield.getLabel();
    boolean _equals = Objects.equal(_label, null);
    if (_equals) {
      return element.getName();
    } else {
      Textfield _textfield_1 = element.getTextfield();
      return _textfield_1.getLabel();
    }
  }
}
