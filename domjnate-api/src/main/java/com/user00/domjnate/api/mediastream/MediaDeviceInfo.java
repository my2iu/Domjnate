package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaDeviceInfo")
public interface MediaDeviceInfo
{
@JsProperty(name="deviceId")
String getDeviceId();
@JsProperty(name="groupId")
String getGroupId();
@JsProperty(name="kind")
String getKind();
@JsProperty(name="label")
String getLabel();
@JsOverlay
public static MediaDeviceInfo getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaDeviceInfo", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MediaDeviceInfo.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MediaDeviceInfo val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MediaDeviceInfo", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MediaDeviceInfo _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MediaDeviceInfo");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MediaDeviceInfo.class);
}
}
