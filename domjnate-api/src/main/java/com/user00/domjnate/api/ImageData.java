package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ImageData")
public interface ImageData
{
@JsProperty(name="data")
Uint8ClampedArray getData();
@JsProperty(name="height")
double getHeight();
@JsProperty(name="width")
double getWidth();
@JsOverlay
public static ImageData getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ImageData", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ImageData.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ImageData val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ImageData", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ImageData _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double width, double height) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ImageData");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ImageData.class, width, height);
}
@JsOverlay
public static ImageData _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Uint8ClampedArray array, double width, double height) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ImageData");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ImageData.class, array, width, height);
}
}
