package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebKitPoint")
public interface WebKitPoint
{
@JsProperty(name="x")
double getX();
@JsProperty(name="x")
void setX(double val);
@JsProperty(name="y")
double getY();
@JsProperty(name="y")
void setY(double val);
@JsOverlay
public static WebKitPoint getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebKitPoint", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebKitPoint.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebKitPoint val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebKitPoint", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebKitPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebKitPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebKitPoint.class);
}
@JsOverlay
public static WebKitPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebKitPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebKitPoint.class, x);
}
@JsOverlay
public static WebKitPoint _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, double x, double y) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebKitPoint");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebKitPoint.class, x, y);
}
}
