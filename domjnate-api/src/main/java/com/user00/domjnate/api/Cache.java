package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Cache")
public interface Cache
{
@JsMethod(name="add")
Promise<Void> add(String request);
@JsMethod(name="add")
Promise<Void> add(Request request);
@JsMethod(name="addAll")
Promise<Void> addAll(Array<String> requests);
@JsMethod(name="delete")
Promise<Boolean> delete(String request);
@JsMethod(name="delete")
Promise<Boolean> delete(Request request);
@JsMethod(name="delete")
Promise<Boolean> delete(String request, CacheQueryOptions options);
@JsMethod(name="delete")
Promise<Boolean> delete(Request request, CacheQueryOptions options);
@JsMethod(name="keys")
Promise<ReadonlyArray<Request>> keys();
@JsMethod(name="keys")
Promise<ReadonlyArray<Request>> keys(String request);
@JsMethod(name="keys")
Promise<ReadonlyArray<Request>> keys(Request request);
@JsMethod(name="keys")
Promise<ReadonlyArray<Request>> keys(String request, CacheQueryOptions options);
@JsMethod(name="keys")
Promise<ReadonlyArray<Request>> keys(Request request, CacheQueryOptions options);
@JsMethod(name="match")
Promise<java.lang.Object> match(String request);
@JsMethod(name="match")
Promise<java.lang.Object> match(Request request);
@JsMethod(name="match")
Promise<java.lang.Object> match(String request, CacheQueryOptions options);
@JsMethod(name="match")
Promise<java.lang.Object> match(Request request, CacheQueryOptions options);
@JsMethod(name="matchAll")
Promise<ReadonlyArray<Response>> matchAll();
@JsMethod(name="matchAll")
Promise<ReadonlyArray<Response>> matchAll(String request);
@JsMethod(name="matchAll")
Promise<ReadonlyArray<Response>> matchAll(Request request);
@JsMethod(name="matchAll")
Promise<ReadonlyArray<Response>> matchAll(String request, CacheQueryOptions options);
@JsMethod(name="matchAll")
Promise<ReadonlyArray<Response>> matchAll(Request request, CacheQueryOptions options);
@JsMethod(name="put")
Promise<Void> put(String request, Response response);
@JsMethod(name="put")
Promise<Void> put(Request request, Response response);
@JsOverlay
public static Cache getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Cache", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Cache.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Cache val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Cache", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Cache _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Cache");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Cache.class);
}
}
