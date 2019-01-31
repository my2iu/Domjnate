package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CanvasRenderingContext2D")
public interface CanvasRenderingContext2D extends CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath
{
@JsProperty(name="canvas")
com.user00.domjnate.api.html.HTMLCanvasElement getCanvas();
@JsOverlay
public static CanvasRenderingContext2D getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CanvasRenderingContext2D", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CanvasRenderingContext2D.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CanvasRenderingContext2D val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CanvasRenderingContext2D", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CanvasRenderingContext2D _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CanvasRenderingContext2D");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CanvasRenderingContext2D.class);
}
}
