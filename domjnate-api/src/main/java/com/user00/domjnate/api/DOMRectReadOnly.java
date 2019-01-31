package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMRectReadOnly")
public interface DOMRectReadOnly
{
@JsProperty(name="bottom")
double getBottom();
@JsProperty(name="height")
double getHeight();
@JsProperty(name="left")
double getLeft();
@JsProperty(name="right")
double getRight();
@JsProperty(name="top")
double getTop();
@JsProperty(name="width")
double getWidth();
@JsProperty(name="x")
double getX();
@JsProperty(name="y")
double getY();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static DOMRectReadOnly getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMRectReadOnly", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMRectReadOnly.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMRectReadOnly val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMRectReadOnly", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMRectReadOnly fromRect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMRectReadOnly", "fromRect", DOMRectReadOnly.class);
}
@JsOverlay
public static DOMRectReadOnly fromRect(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMRectInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMRectReadOnly", "fromRect", DOMRectReadOnly.class, other);
}
@JsOverlay
public static DOMRectReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRectReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRectReadOnly.class);
}
@JsOverlay
public static DOMRectReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRectReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRectReadOnly.class, x);
}
@JsOverlay
public static DOMRectReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRectReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRectReadOnly.class, x, y);
}
@JsOverlay
public static DOMRectReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double width) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRectReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRectReadOnly.class, x, y, width);
}
@JsOverlay
public static DOMRectReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double width, double height) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMRectReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMRectReadOnly.class, x, y, width, height);
}
}
