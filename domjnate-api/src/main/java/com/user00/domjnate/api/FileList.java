package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FileList")
public interface FileList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
File item(double index);
@JsOverlay
public default File get(double index) {
  return (File)com.user00.domjnate.util.Js.getIndex(this, index, File.class);
}
@JsOverlay
public default void set(double index, File val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static FileList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", FileList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, FileList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "FileList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static FileList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "FileList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, FileList.class);
}
}
