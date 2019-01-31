package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ConcatArray")
public interface ConcatArray<T> 
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="join")
String join();
@JsMethod(name="join")
String join(String separator);
@JsMethod(name="slice")
Array<T> slice();
@JsMethod(name="slice")
Array<T> slice(double start);
@JsMethod(name="slice")
Array<T> slice(double start, double end);
@JsOverlay
public default T get(double n, Class<T> _type) {
  return (T)com.user00.domjnate.util.Js.getIndex(this, n, _type);
}
}
