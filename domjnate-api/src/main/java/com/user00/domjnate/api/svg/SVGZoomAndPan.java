package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGZoomAndPan")
public interface SVGZoomAndPan
{
@JsProperty(name="zoomAndPan")
double getZoomAndPan();
@JsOverlay
public static double SVG_ZOOMANDPAN_DISABLE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGZoomAndPan", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ZOOMANDPAN_DISABLE", double.class);
}
@JsOverlay
public static double SVG_ZOOMANDPAN_MAGNIFY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGZoomAndPan", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ZOOMANDPAN_MAGNIFY", double.class);
}
@JsOverlay
public static double SVG_ZOOMANDPAN_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGZoomAndPan", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ZOOMANDPAN_UNKNOWN", double.class);
}
}
