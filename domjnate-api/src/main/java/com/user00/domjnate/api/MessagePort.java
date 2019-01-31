package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MessagePort")
public interface MessagePort extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="onmessage")
OnmessageCallback getOnmessage();
@JsProperty(name="onmessage")
void setOnmessage(OnmessageCallback val);
@JsProperty(name="onmessageerror")
OnmessageerrorCallback getOnmessageerror();
@JsProperty(name="onmessageerror")
void setOnmessageerror(OnmessageerrorCallback val);
@JsMethod(name="close")
void close();
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message);
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message, Array<ImageBitmap> transfer);
@JsMethod(name="start")
void start();
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
@JsFunction public static interface OnmessageerrorCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsOverlay
public static MessagePort getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MessagePort", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MessagePort.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MessagePort val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MessagePort", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MessagePort _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MessagePort");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MessagePort.class);
}
}
