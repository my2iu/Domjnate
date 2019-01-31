package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ArrayLike")
public interface ArrayLike<T> 
{
@JsProperty(name="length")
double getLength();
@JsOverlay
public default T get(double n, Class<T> _type) {
  return (T)com.user00.domjnate.util.Js.getIndex(this, n, _type);
}
}
