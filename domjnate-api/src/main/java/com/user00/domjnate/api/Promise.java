package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Promise")
public interface Promise<T> 
{
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then();
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then(Void onfulfilled);
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then(java.lang.Object onfulfilled);
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then(Void onfulfilled, Void onrejected);
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then(java.lang.Object onfulfilled, Void onrejected);
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then(Void onfulfilled, java.lang.Object onrejected);
@JsMethod(name="then")
<TResult1,TResult2> Promise<java.lang.Object> then(java.lang.Object onfulfilled, java.lang.Object onrejected);
@JsMethod(name="catch")
<TResult> Promise<java.lang.Object> _catch();
@JsMethod(name="catch")
<TResult> Promise<java.lang.Object> _catch(Void onrejected);
@JsMethod(name="catch")
<TResult> Promise<java.lang.Object> _catch(java.lang.Object onrejected);
@JsFunction public static interface PromiseCallback<T> 
{
void apply(java.lang.Object resolve, java.lang.Object reject);
}
@JsOverlay
public static Promise<java.lang.Object> getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Promise", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Promise.class);
}
@JsOverlay
public static <T> Promise<Array<T>> all(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<PromiseLike<T>> values) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "all", Promise.class, values);
}
@JsOverlay
public static <T> Promise<T> race(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<PromiseLike<T>> values) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "race", Promise.class, values);
}
@JsOverlay
public static <T> Promise<T> reject(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "reject", Promise.class);
}
@JsOverlay
public static <T> Promise<T> reject(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object reason) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "reject", Promise.class, reason);
}
@JsOverlay
public static <T> Promise<T> resolve(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PromiseLike<T> value) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "resolve", Promise.class, value);
}
@JsOverlay
public static <T> Promise<T> resolve(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, T value) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "resolve", Promise.class, value);
}
@JsOverlay
public static Promise<Void> resolve(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Promise", "resolve", Promise.class);
}
@JsOverlay
public static <T> Promise<T> _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PromiseCallback<T> executor) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Promise");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Promise.class, executor);
}
}
