package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RegExp")
public interface RegExp
{
@JsProperty(name="source")
String getSource();
@JsProperty(name="global")
boolean getGlobal();
@JsProperty(name="ignoreCase")
boolean getIgnoreCase();
@JsProperty(name="multiline")
boolean getMultiline();
@JsProperty(name="lastIndex")
double getLastIndex();
@JsProperty(name="lastIndex")
void setLastIndex(double val);
@JsMethod(name="exec")
RegExpExecArray exec(String string);
@JsMethod(name="test")
boolean test(String string);
@JsMethod(name="compile")
RegExp compile();
@JsOverlay
public static RegExp getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RegExp.class);
}
@JsOverlay
public static String get$1(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$1", String.class);
}
@JsOverlay
public static void set$1(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$1", val);
}
@JsOverlay
public static String get$2(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$2", String.class);
}
@JsOverlay
public static void set$2(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$2", val);
}
@JsOverlay
public static String get$3(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$3", String.class);
}
@JsOverlay
public static void set$3(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$3", val);
}
@JsOverlay
public static String get$4(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$4", String.class);
}
@JsOverlay
public static void set$4(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$4", val);
}
@JsOverlay
public static String get$5(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$5", String.class);
}
@JsOverlay
public static void set$5(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$5", val);
}
@JsOverlay
public static String get$6(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$6", String.class);
}
@JsOverlay
public static void set$6(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$6", val);
}
@JsOverlay
public static String get$7(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$7", String.class);
}
@JsOverlay
public static void set$7(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$7", val);
}
@JsOverlay
public static String get$8(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$8", String.class);
}
@JsOverlay
public static void set$8(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$8", val);
}
@JsOverlay
public static String get$9(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "$9", String.class);
}
@JsOverlay
public static void set$9(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "$9", val);
}
@JsOverlay
public static String getLastMatch(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "lastMatch", String.class);
}
@JsOverlay
public static void setLastMatch(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RegExp", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "lastMatch", val);
}
@JsOverlay
public static RegExp call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String pattern) {
  return com.user00.domjnate.util.Js.callMethod(_win, "RegExp", RegExp.class, pattern);
}
@JsOverlay
public static RegExp call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RegExp pattern) {
  return com.user00.domjnate.util.Js.callMethod(_win, "RegExp", RegExp.class, pattern);
}
@JsOverlay
public static RegExp call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String pattern, String flags) {
  return com.user00.domjnate.util.Js.callMethod(_win, "RegExp", RegExp.class, pattern, flags);
}
@JsOverlay
public static RegExp _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String pattern) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RegExp");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RegExp.class, pattern);
}
@JsOverlay
public static RegExp _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RegExp pattern) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RegExp");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RegExp.class, pattern);
}
@JsOverlay
public static RegExp _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String pattern, String flags) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RegExp");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RegExp.class, pattern, flags);
}
}
