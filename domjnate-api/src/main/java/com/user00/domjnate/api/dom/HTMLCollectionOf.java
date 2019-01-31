package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLCollectionOf")
public interface HTMLCollectionOf<T extends Element> 
{
@JsMethod(name="item")
T item(double index);
@JsMethod(name="namedItem")
T namedItem(String name);
@JsOverlay
public default T get(double index, Class<T> _type) {
  return (T)com.user00.domjnate.util.Js.getIndex(this, index, _type);
}
@JsOverlay
public default void set(double index, T val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
}
