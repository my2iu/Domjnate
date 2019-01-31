package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSGraphicsTrust")
public interface MSGraphicsTrust
{
@JsProperty(name="constrictionActive")
boolean getConstrictionActive();
@JsProperty(name="status")
String getStatus();
@JsOverlay
public static MSGraphicsTrust getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGraphicsTrust", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSGraphicsTrust.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSGraphicsTrust val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSGraphicsTrust", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static MSGraphicsTrust _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSGraphicsTrust");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSGraphicsTrust.class);
}
}
