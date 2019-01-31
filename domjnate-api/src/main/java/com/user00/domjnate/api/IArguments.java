package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="IArguments")
public interface IArguments
{
@JsProperty(name="length")
double getLength();
@JsProperty(name="length")
void setLength(double val);
@JsProperty(name="callee")
Function getCallee();
@JsProperty(name="callee")
void setCallee(Function val);
@JsOverlay
public default java.lang.Object get(double index) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getIndex(this, index, java.lang.Object.class);
}
@JsOverlay
public default void set(double index, java.lang.Object val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
}
