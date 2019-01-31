package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StyleSheet")
public interface StyleSheet
{
@JsProperty(name="disabled")
boolean getDisabled();
@JsProperty(name="disabled")
void setDisabled(boolean val);
@JsProperty(name="href")
String getHref();
@JsProperty(name="media")
MediaList getMedia();
@JsProperty(name="ownerNode")
com.user00.domjnate.api.dom.Node getOwnerNode();
@JsProperty(name="parentStyleSheet")
StyleSheet getParentStyleSheet();
@JsProperty(name="title")
String getTitle();
@JsProperty(name="type")
String getType();
@JsOverlay
public static StyleSheet getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StyleSheet", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", StyleSheet.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, StyleSheet val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "StyleSheet", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static StyleSheet _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "StyleSheet");
  return com.user00.domjnate.util.Js.construct(_win, constructor, StyleSheet.class);
}
}
