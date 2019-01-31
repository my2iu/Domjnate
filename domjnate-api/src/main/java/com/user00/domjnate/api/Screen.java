package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Screen")
public interface Screen
{
@JsProperty(name="availHeight")
double getAvailHeight();
@JsProperty(name="availWidth")
double getAvailWidth();
@JsProperty(name="colorDepth")
double getColorDepth();
@JsProperty(name="height")
double getHeight();
@JsProperty(name="orientation")
ScreenOrientation getOrientation();
@JsProperty(name="pixelDepth")
double getPixelDepth();
@JsProperty(name="width")
double getWidth();
@JsOverlay
public static Screen getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Screen", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Screen.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Screen val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Screen", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Screen _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Screen");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Screen.class);
}
}
