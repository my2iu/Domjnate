package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DeferredPermissionRequest")
public interface DeferredPermissionRequest
{
@JsProperty(name="id")
double getId();
@JsProperty(name="type")
String getType();
@JsProperty(name="uri")
String getUri();
@JsMethod(name="allow")
void allow();
@JsMethod(name="deny")
void deny();
@JsOverlay
public static DeferredPermissionRequest getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeferredPermissionRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DeferredPermissionRequest.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DeferredPermissionRequest val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DeferredPermissionRequest", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DeferredPermissionRequest _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DeferredPermissionRequest");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DeferredPermissionRequest.class);
}
}
