package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Slotable")
public interface Slotable
{
@JsProperty(name="assignedSlot")
com.user00.domjnate.api.html.HTMLSlotElement getAssignedSlot();
}
