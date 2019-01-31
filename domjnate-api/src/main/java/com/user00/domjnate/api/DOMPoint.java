package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMPoint")
public interface DOMPoint extends DOMPointReadOnly
{
@JsProperty(name="w")
double getW();
@JsProperty(name="w")
void setW(double val);
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsProperty(name="z")
double getZ();
@JsProperty(name="z")
void setZ(double val);
@JsOverlay
public static DOMPoint getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMPoint", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMPoint.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPoint val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMPoint", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMPoint fromPoint(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMPoint", "fromPoint", DOMPoint.class);
}
@JsOverlay
public static DOMPoint fromPoint(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMPointInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMPoint", "fromPoint", DOMPoint.class, other);
}
@JsOverlay
public static DOMPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPoint.class);
}
@JsOverlay
public static DOMPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPoint.class, x);
}
@JsOverlay
public static DOMPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPoint.class, x, y);
}
@JsOverlay
public static DOMPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double z) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPoint.class, x, y, z);
}
@JsOverlay
public static DOMPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y, double z, double w) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMPoint.class, x, y, z, w);
}
}
