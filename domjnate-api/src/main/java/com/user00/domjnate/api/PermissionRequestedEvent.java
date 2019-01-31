package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PermissionRequestedEvent")
public interface PermissionRequestedEvent extends com.user00.domjnate.api.dom.Event
{
@JsProperty(name="permissionRequest")
PermissionRequest getPermissionRequest();
@JsOverlay
public static PermissionRequestedEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PermissionRequestedEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PermissionRequestedEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PermissionRequestedEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PermissionRequestedEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PermissionRequestedEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PermissionRequestedEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PermissionRequestedEvent.class);
}
}
