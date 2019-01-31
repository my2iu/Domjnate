package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TextMetrics")
public interface TextMetrics
{
@JsProperty(name="actualBoundingBoxAscent")
double getActualBoundingBoxAscent();
@JsProperty(name="actualBoundingBoxDescent")
double getActualBoundingBoxDescent();
@JsProperty(name="actualBoundingBoxLeft")
double getActualBoundingBoxLeft();
@JsProperty(name="actualBoundingBoxRight")
double getActualBoundingBoxRight();
@JsProperty(name="alphabeticBaseline")
double getAlphabeticBaseline();
@JsProperty(name="emHeightAscent")
double getEmHeightAscent();
@JsProperty(name="emHeightDescent")
double getEmHeightDescent();
@JsProperty(name="fontBoundingBoxAscent")
double getFontBoundingBoxAscent();
@JsProperty(name="fontBoundingBoxDescent")
double getFontBoundingBoxDescent();
@JsProperty(name="hangingBaseline")
double getHangingBaseline();
@JsProperty(name="ideographicBaseline")
double getIdeographicBaseline();
@JsProperty(name="width")
double getWidth();
@JsOverlay
public static TextMetrics getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextMetrics", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TextMetrics.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TextMetrics val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TextMetrics", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TextMetrics _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TextMetrics");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TextMetrics.class);
}
}
