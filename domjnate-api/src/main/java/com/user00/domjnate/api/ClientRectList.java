package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ClientRectList")
public interface ClientRectList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
ClientRect item(double index);
@JsOverlay
public default ClientRect get(double index) {
  return (ClientRect)com.user00.domjnate.util.Js.getIndex(this, index, ClientRect.class);
}
@JsOverlay
public default void set(double index, ClientRect val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static ClientRectList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ClientRectList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ClientRectList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ClientRectList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ClientRectList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ClientRectList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ClientRectList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ClientRectList.class);
}
}
