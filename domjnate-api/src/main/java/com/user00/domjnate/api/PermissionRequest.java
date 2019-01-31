package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PermissionRequest")
public interface PermissionRequest extends DeferredPermissionRequest
{
@JsProperty(name="state")
String getState();
@JsMethod(name="defer")
void defer();
@JsOverlay
public static PermissionRequest getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PermissionRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PermissionRequest.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PermissionRequest val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PermissionRequest", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PermissionRequest _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PermissionRequest");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PermissionRequest.class);
}
}
