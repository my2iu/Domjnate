package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CaretPosition")
public interface CaretPosition
{
@JsProperty(name="offset")
double getOffset();
@JsProperty(name="offsetNode")
com.user00.domjnate.api.dom.Node getOffsetNode();
@JsMethod(name="getClientRect")
DOMRect getClientRect();
@JsOverlay
public static CaretPosition getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CaretPosition", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CaretPosition.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CaretPosition val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CaretPosition", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CaretPosition _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CaretPosition");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CaretPosition.class);
}
}
