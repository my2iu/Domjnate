package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ClientRect")
public interface ClientRect
{
@JsProperty(name="bottom")
double getBottom();
@JsProperty(name="bottom")
void setBottom(double val);
@JsProperty(name="height")
double getHeight();
@JsProperty(name="left")
double getLeft();
@JsProperty(name="left")
void setLeft(double val);
@JsProperty(name="right")
double getRight();
@JsProperty(name="right")
void setRight(double val);
@JsProperty(name="top")
double getTop();
@JsProperty(name="top")
void setTop(double val);
@JsProperty(name="width")
double getWidth();
@JsOverlay
public static ClientRect getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ClientRect", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ClientRect.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ClientRect val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ClientRect", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ClientRect _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ClientRect");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ClientRect.class);
}
}
