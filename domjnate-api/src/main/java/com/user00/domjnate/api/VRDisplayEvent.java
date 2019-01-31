package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRDisplayEvent")
public interface VRDisplayEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="display")
VRDisplay getDisplay();
@JsProperty(name="reason")
String getReason();
@JsOverlay
public static VRDisplayEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRDisplayEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", VRDisplayEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, VRDisplayEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "VRDisplayEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static VRDisplayEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, VRDisplayEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "VRDisplayEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, VRDisplayEvent.class, type, eventInitDict);
}
}
