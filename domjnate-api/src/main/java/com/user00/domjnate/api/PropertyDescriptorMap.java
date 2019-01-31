package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PropertyDescriptorMap")
public interface PropertyDescriptorMap
{
@JsOverlay
public default PropertyDescriptor get(String s) {
  return (PropertyDescriptor)com.user00.domjnate.util.Js.getMember(this, s, PropertyDescriptor.class);
}
@JsOverlay
public default void set(String s, PropertyDescriptor val) {
  com.user00.domjnate.util.Js.setMember(this, s, val);
}
}
