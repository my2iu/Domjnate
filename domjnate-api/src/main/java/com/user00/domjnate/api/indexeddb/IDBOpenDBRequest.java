package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBOpenDBRequest")
public interface IDBOpenDBRequest extends IDBRequest<IDBDatabase>
{
@JsProperty(name="onblocked")
OnblockedCallback getOnblocked();
@JsProperty(name="onblocked")
void setOnblocked(OnblockedCallback val);
@JsProperty(name="onupgradeneeded")
OnupgradeneededCallback getOnupgradeneeded();
@JsProperty(name="onupgradeneeded")
void setOnupgradeneeded(OnupgradeneededCallback val);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OnupgradeneededCallback
{
java.lang.Object apply(IDBVersionChangeEvent ev);
}
@JsFunction public static interface OnblockedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static IDBOpenDBRequest getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBOpenDBRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBOpenDBRequest.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBOpenDBRequest val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBOpenDBRequest", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBOpenDBRequest _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBOpenDBRequest");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBOpenDBRequest.class);
}
}
