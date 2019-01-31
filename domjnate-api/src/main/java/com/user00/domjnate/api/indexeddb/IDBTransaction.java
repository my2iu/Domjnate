package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBTransaction")
public interface IDBTransaction extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="db")
IDBDatabase getDb();
@JsProperty(name="error")
com.user00.domjnate.api.dom.DOMException getError();
@JsProperty(name="mode")
String getMode();
@JsProperty(name="objectStoreNames")
com.user00.domjnate.api.dom.DOMStringList getObjectStoreNames();
@JsProperty(name="onabort")
OnabortCallback getOnabort();
@JsProperty(name="onabort")
void setOnabort(OnabortCallback val);
@JsProperty(name="oncomplete")
OncompleteCallback getOncomplete();
@JsProperty(name="oncomplete")
void setOncomplete(OncompleteCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsMethod(name="abort")
void abort();
@JsMethod(name="objectStore")
IDBObjectStore objectStore(String name);
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
@JsFunction public static interface OncompleteCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnabortCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static IDBTransaction getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBTransaction", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBTransaction.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBTransaction val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBTransaction", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBTransaction _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBTransaction");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBTransaction.class);
}
}
