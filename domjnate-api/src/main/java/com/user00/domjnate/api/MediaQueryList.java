package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaQueryList")
public interface MediaQueryList extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="matches")
boolean getMatches();
@JsProperty(name="media")
String getMedia();
@JsProperty(name="onchange")
OnchangeCallback getOnchange();
@JsProperty(name="onchange")
void setOnchange(OnchangeCallback val);
@JsMethod(name="addListener")
void addListener(AddListenerCallback listener);
@JsMethod(name="removeListener")
void removeListener(RemoveListenerCallback listener);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface AddListenerCallback
{
java.lang.Object apply(MediaQueryListEvent ev);
}
@JsFunction public static interface OnchangeCallback
{
java.lang.Object apply(MediaQueryListEvent ev);
}
@JsFunction public static interface RemoveListenerCallback
{
java.lang.Object apply(MediaQueryListEvent ev);
}
@JsOverlay
public static MediaQueryList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaQueryList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaQueryList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaQueryList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaQueryList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaQueryList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaQueryList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaQueryList.class);
}
}
