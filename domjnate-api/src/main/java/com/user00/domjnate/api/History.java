package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="History")
public interface History
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="scrollRestoration")
String getScrollRestoration();
@JsProperty(name="scrollRestoration")
void setScrollRestoration(String val);
@JsProperty(name="state")
java.lang.Object getState();
@JsMethod(name="back")
void back();
@JsMethod(name="forward")
void forward();
@JsMethod(name="go")
void go();
@JsMethod(name="go")
void go(double delta);
@JsMethod(name="pushState")
void pushState(java.lang.Object data, String title);
@JsMethod(name="pushState")
void pushState(java.lang.Object data, String title, String url);
@JsMethod(name="replaceState")
void replaceState(java.lang.Object data, String title);
@JsMethod(name="replaceState")
void replaceState(java.lang.Object data, String title, String url);
@JsOverlay
public static History getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "History", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", History.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, History val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "History", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static History _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "History");
  return com.user00.domjnate.util.Js.construct(_win, constructor, History.class);
}
}
