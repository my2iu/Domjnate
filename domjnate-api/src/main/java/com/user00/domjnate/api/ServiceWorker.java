package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ServiceWorker")
public interface ServiceWorker extends com.user00.domjnate.api.dom.EventTarget, AbstractWorker
{
@JsProperty(name="onstatechange")
OnstatechangeCallback getOnstatechange();
@JsProperty(name="onstatechange")
void setOnstatechange(OnstatechangeCallback val);
@JsProperty(name="scriptURL")
String getScriptURL();
@JsProperty(name="state")
String getState();
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message);
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message, Array<ImageBitmap> transfer);
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
@JsFunction public static interface OnstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static ServiceWorker getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ServiceWorker", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ServiceWorker.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ServiceWorker val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ServiceWorker", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ServiceWorker _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ServiceWorker");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ServiceWorker.class);
}
}
