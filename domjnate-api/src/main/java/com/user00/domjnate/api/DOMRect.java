package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMRect")
public interface DOMRect extends DOMRectReadOnly
{
@JsProperty(name="height")
double getHeight();
@JsProperty(name="height")
void setHeight(double val);
@JsProperty(name="width")
double getWidth();
@JsProperty(name="width")
void setWidth(double val);
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsOverlay
public static DOMRect getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMRect", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMRect.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMRect val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMRect", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMRect fromRect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMRect", "fromRect", DOMRect.class);
}
@JsOverlay
public static DOMRect fromRect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMRectInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMRect", "fromRect", DOMRect.class, other);
}
@JsOverlay
public static DOMRect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRect.class);
}
@JsOverlay
public static DOMRect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRect.class, x);
}
@JsOverlay
public static DOMRect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRect.class, x, y);
}
@JsOverlay
public static DOMRect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double width) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRect.class, x, y, width);
}
@JsOverlay
public static DOMRect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double width, double height) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRect.class, x, y, width, height);
}
}
