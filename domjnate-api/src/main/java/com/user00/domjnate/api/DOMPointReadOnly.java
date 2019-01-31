package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMPointReadOnly")
public interface DOMPointReadOnly
{
@JsProperty(name="w")
double getW();
@JsProperty(name="x")
double getX();
@JsProperty(name="y")
double getY();
@JsProperty(name="z")
double getZ();
@JsMethod(name="matrixTransform")
DOMPoint matrixTransform();
@JsMethod(name="matrixTransform")
DOMPoint matrixTransform(DOMMatrixInit matrix);
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static DOMPointReadOnly getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMPointReadOnly", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMPointReadOnly.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointReadOnly val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMPointReadOnly", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMPointReadOnly fromPoint(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMPointReadOnly", "fromPoint", DOMPointReadOnly.class);
}
@JsOverlay
public static DOMPointReadOnly fromPoint(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMPointReadOnly", "fromPoint", DOMPointReadOnly.class, other);
}
@JsOverlay
public static DOMPointReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPointReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPointReadOnly.class);
}
@JsOverlay
public static DOMPointReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPointReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPointReadOnly.class, x);
}
@JsOverlay
public static DOMPointReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPointReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPointReadOnly.class, x, y);
}
@JsOverlay
public static DOMPointReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double z) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPointReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPointReadOnly.class, x, y, z);
}
@JsOverlay
public static DOMPointReadOnly _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double z, double w) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPointReadOnly");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPointReadOnly.class, x, y, z, w);
}
}
