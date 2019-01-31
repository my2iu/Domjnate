package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CacheStorage")
public interface CacheStorage
{
@JsMethod(name="delete")
Promise<Boolean> delete(String cacheName);
@JsMethod(name="has")
Promise<Boolean> has(String cacheName);
@JsMethod(name="keys")
Promise<Array<String>> keys();
@JsMethod(name="match")
Promise<java.lang.Object> match(String request);
@JsMethod(name="match")
Promise<java.lang.Object> match(Request request);
@JsMethod(name="match")
Promise<java.lang.Object> match(String request, CacheQueryOptions options);
@JsMethod(name="match")
Promise<java.lang.Object> match(Request request, CacheQueryOptions options);
@JsMethod(name="open")
Promise<Cache> open(String cacheName);
@JsOverlay
public static CacheStorage getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CacheStorage", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CacheStorage.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CacheStorage val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CacheStorage", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CacheStorage _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CacheStorage");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CacheStorage.class);
}
}
