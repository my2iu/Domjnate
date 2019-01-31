package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MimeType")
public interface MimeType
{
@JsProperty(name="description")
String getDescription();
@JsProperty(name="enabledPlugin")
Plugin getEnabledPlugin();
@JsProperty(name="suffixes")
String getSuffixes();
@JsProperty(name="type")
String getType();
@JsOverlay
public static MimeType getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MimeType", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MimeType.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MimeType val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MimeType", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MimeType _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MimeType");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MimeType.class);
}
}
