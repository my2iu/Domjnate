package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RadioNodeList")
public interface RadioNodeList extends com.user00.domjnate.api.dom.NodeList
{
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsOverlay
public static RadioNodeList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RadioNodeList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RadioNodeList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RadioNodeList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RadioNodeList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static RadioNodeList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RadioNodeList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RadioNodeList.class);
}
}
