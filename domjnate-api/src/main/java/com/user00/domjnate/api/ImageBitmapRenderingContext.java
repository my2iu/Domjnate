package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ImageBitmapRenderingContext")
public interface ImageBitmapRenderingContext
{
@JsProperty(name="canvas")
com.user00.domjnate.api.html.HTMLCanvasElement getCanvas();
@JsMethod(name="transferFromImageBitmap")
void transferFromImageBitmap(ImageBitmap bitmap);
@JsOverlay
public static ImageBitmapRenderingContext getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ImageBitmapRenderingContext", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ImageBitmapRenderingContext.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ImageBitmapRenderingContext val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ImageBitmapRenderingContext", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ImageBitmapRenderingContext _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ImageBitmapRenderingContext");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ImageBitmapRenderingContext.class);
}
}
