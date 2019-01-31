package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StyleMedia")
public interface StyleMedia
{
@JsProperty(name="type")
String getType();
@JsMethod(name="matchMedium")
boolean matchMedium(String mediaquery);
@JsOverlay
public static StyleMedia getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StyleMedia", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", StyleMedia.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, StyleMedia val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StyleMedia", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static StyleMedia _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StyleMedia");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StyleMedia.class);
}
}
