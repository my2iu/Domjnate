package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaList")
public interface MediaList
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="mediaText")
String getMediaText();
@JsProperty(name="mediaText")
void setMediaText(String val);
@JsMethod(name="appendMedium")
void appendMedium(String medium);
@JsMethod(name="deleteMedium")
void deleteMedium(String medium);
@JsMethod(name="item")
String item(double index);
@JsOverlay
public default String get(double index) {
  return (String)com.user00.domjnate.util.Js.getIndex(this, index, String.class);
}
@JsOverlay
public default void set(double index, String val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static MediaList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaList.class);
}
}
