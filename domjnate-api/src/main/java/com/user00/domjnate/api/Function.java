package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Function")
public interface Function
{
@JsProperty(name="prototype")
java.lang.Object getPrototype();
@JsProperty(name="prototype")
void setPrototype(java.lang.Object val);
@JsProperty(name="length")
double getLength();
@JsProperty(name="arguments")
java.lang.Object getArguments();
@JsProperty(name="arguments")
void setArguments(java.lang.Object val);
@JsProperty(name="caller")
Function getCaller();
@JsProperty(name="caller")
void setCaller(Function val);
@JsMethod(name="apply")
java.lang.Object apply(Function _this, java.lang.Object thisArg);
@JsMethod(name="apply")
java.lang.Object apply(Function _this, java.lang.Object thisArg, java.lang.Object argArray);
@JsMethod(name="call")
java.lang.Object call(Function _this, java.lang.Object thisArg, java.lang.Object... argArray);
@JsMethod(name="bind")
java.lang.Object bind(Function _this, java.lang.Object thisArg, java.lang.Object... argArray);
@JsMethod(name="toString")
String toString();
@JsOverlay
public static Function getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Function", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Function.class);
}
@JsOverlay
public static Function call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String... args) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Function", Function.class, args);
}
@JsOverlay
public static Function _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String... args) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Function");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Function.class, args);
}
}
