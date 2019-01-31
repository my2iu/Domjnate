package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSGesture")
public interface MSGesture
{
@JsProperty(name="target")
com.user00.domjnate.api.dom.Element getTarget();
@JsProperty(name="target")
void setTarget(com.user00.domjnate.api.dom.Element val);
@JsMethod(name="addPointer")
void addPointer(double pointerId);
@JsMethod(name="stop")
void stop();
@JsOverlay
public static MSGesture getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGesture", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSGesture.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSGesture val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGesture", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSGesture _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSGesture");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSGesture.class);
}
}
