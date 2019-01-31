package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PropertyIndexedKeyframes")
public interface PropertyIndexedKeyframes
{
@JsProperty(name="composite")
java.lang.Object getComposite();
@JsProperty(name="composite")
void setComposite(java.lang.Object val);
@JsProperty(name="easing")
java.lang.Object getEasing();
@JsProperty(name="easing")
void setEasing(java.lang.Object val);
@JsProperty(name="offset")
java.lang.Object getOffset();
@JsProperty(name="offset")
void setOffset(java.lang.Object val);
@JsOverlay
public default java.lang.Object get(String property) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getMember(this, property, java.lang.Object.class);
}
@JsOverlay
public default void set(String property, java.lang.Object val) {
  com.user00.domjnate.util.Js.setMember(this, property, val);
}
}
