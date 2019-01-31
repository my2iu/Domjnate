package com.user00.domjnate.api.indexeddb;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IDBFactory")
public interface IDBFactory
{
@JsMethod(name="cmp")
double cmp(java.lang.Object first, java.lang.Object second);
@JsMethod(name="deleteDatabase")
IDBOpenDBRequest deleteDatabase(String name);
@JsMethod(name="open")
IDBOpenDBRequest open(String name);
@JsMethod(name="open")
IDBOpenDBRequest open(String name, double version);
@JsOverlay
public static IDBFactory getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBFactory", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", IDBFactory.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, IDBFactory val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "IDBFactory", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static IDBFactory _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "IDBFactory");
  return com.user00.domjnate.util.Js.construct(_win, constructor, IDBFactory.class);
}
}
