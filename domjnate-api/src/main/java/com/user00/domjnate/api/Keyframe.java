package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Keyframe")
public interface Keyframe
{
@JsProperty(name="composite")
String getComposite();
@JsProperty(name="composite")
void setComposite(String val);
@JsProperty(name="easing")
String getEasing();
@JsProperty(name="easing")
void setEasing(String val);
@JsProperty(name="offset")
Double getOffset();
@JsProperty(name="offset")
void setOffset(Double val);
@JsOverlay
public default java.lang.Object get(String property) {
  return (java.lang.Object)com.user00.domjnate.util.Js.getMember(this, property, java.lang.Object.class);
}
@JsOverlay
public default void set(String property, java.lang.Object val) {
  com.user00.domjnate.util.Js.setMember(this, property, val);
}
}
