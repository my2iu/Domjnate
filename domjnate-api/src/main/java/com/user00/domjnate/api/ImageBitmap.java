package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ImageBitmap")
public interface ImageBitmap
{
@JsProperty(name="height")
double getHeight();
@JsProperty(name="width")
double getWidth();
@JsMethod(name="close")
void close();
@JsOverlay
public static ImageBitmap getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ImageBitmap", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ImageBitmap.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ImageBitmap val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ImageBitmap", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ImageBitmap _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ImageBitmap");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ImageBitmap.class);
}
}
