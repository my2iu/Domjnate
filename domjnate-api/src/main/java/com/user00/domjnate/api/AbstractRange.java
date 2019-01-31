package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AbstractRange")
public interface AbstractRange
{
@JsProperty(name="collapsed")
boolean getCollapsed();
@JsProperty(name="endContainer")
com.user00.domjnate.api.dom.Node getEndContainer();
@JsProperty(name="endOffset")
double getEndOffset();
@JsProperty(name="startContainer")
com.user00.domjnate.api.dom.Node getStartContainer();
@JsProperty(name="startOffset")
double getStartOffset();
@JsOverlay
public static AbstractRange getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AbstractRange", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", AbstractRange.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, AbstractRange val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "AbstractRange", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static AbstractRange _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "AbstractRange");
  return com.user00.domjnate.util.Js.construct(_win, constructor, AbstractRange.class);
}
}
