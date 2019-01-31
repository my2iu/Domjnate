package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Worker")
public interface Worker extends com.user00.domjnate.api.dom.EventTarget, AbstractWorker
{
@JsProperty(name="onmessage")
OnmessageCallback getOnmessage();
@JsProperty(name="onmessage")
void setOnmessage(OnmessageCallback val);
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message);
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message, Array<ImageBitmap> transfer);
@JsMethod(name="terminate")
void terminate();
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
@JsFunction public static interface OnmessageCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsOverlay
public static Worker getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Worker", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Worker.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Worker val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Worker", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Worker _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String stringUrl) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Worker");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Worker.class, stringUrl);
}
@JsOverlay
public static Worker _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String stringUrl, WorkerOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Worker");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Worker.class, stringUrl, options);
}
}
