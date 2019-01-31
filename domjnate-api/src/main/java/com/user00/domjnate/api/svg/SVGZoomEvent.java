package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGZoomEvent")
public interface SVGZoomEvent extends com.user00.domjnate.api.UIEvent
{
@JsProperty(name="newScale")
double getNewScale();
@JsProperty(name="newTranslate")
com.user00.domjnate.api.DOMPoint getNewTranslate();
@JsProperty(name="previousScale")
double getPreviousScale();
@JsProperty(name="previousTranslate")
com.user00.domjnate.api.DOMPoint getPreviousTranslate();
@JsProperty(name="zoomRectScreen")
com.user00.domjnate.api.DOMRect getZoomRectScreen();
@JsOverlay
public static SVGZoomEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGZoomEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGZoomEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGZoomEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGZoomEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGZoomEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGZoomEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGZoomEvent.class);
}
}
