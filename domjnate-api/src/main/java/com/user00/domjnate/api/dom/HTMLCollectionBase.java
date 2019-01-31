package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLCollectionBase")
public interface HTMLCollectionBase
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
Element item(double index);
@JsOverlay
public default Element get(double index) {
  return (Element)com.user00.domjnate.util.Js.getIndex(this, index, Element.class);
}
@JsOverlay
public default void set(double index, Element val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
}
