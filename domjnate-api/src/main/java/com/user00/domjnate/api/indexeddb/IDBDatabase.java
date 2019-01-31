package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBDatabase")
public interface IDBDatabase extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="name")
String getName();
@JsProperty(name="objectStoreNames")
com.user00.domjnate.api.dom.DOMStringList getObjectStoreNames();
@JsProperty(name="onabort")
OnabortCallback getOnabort();
@JsProperty(name="onabort")
void setOnabort(OnabortCallback val);
@JsProperty(name="onclose")
OncloseCallback getOnclose();
@JsProperty(name="onclose")
void setOnclose(OncloseCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onversionchange")
OnversionchangeCallback getOnversionchange();
@JsProperty(name="onversionchange")
void setOnversionchange(OnversionchangeCallback val);
@JsProperty(name="version")
double getVersion();
@JsMethod(name="close")
void close();
@JsMethod(name="createObjectStore")
IDBObjectStore createObjectStore(String name);
@JsMethod(name="createObjectStore")
IDBObjectStore createObjectStore(String name, IDBObjectStoreParameters optionalParameters);
@JsMethod(name="deleteObjectStore")
void deleteObjectStore(String name);
@JsMethod(name="transaction")
IDBTransaction transaction(com.user00.domjnate.api.Array<String> storeNames);
@JsMethod(name="transaction")
IDBTransaction transaction(String storeNames);
@JsMethod(name="transaction")
IDBTransaction transaction(com.user00.domjnate.api.Array<String> storeNames, String mode);
@JsMethod(name="transaction")
IDBTransaction transaction(String storeNames, String mode);
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
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncloseCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnabortCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnversionchangeCallback
{
java.lang.Object apply(IDBVersionChangeEvent ev);
}
@JsOverlay
public static IDBDatabase getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBDatabase", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBDatabase.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBDatabase val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBDatabase", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBDatabase _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBDatabase");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBDatabase.class);
}
}
