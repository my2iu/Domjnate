package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMSettableTokenList")
public interface DOMSettableTokenList extends com.user00.domjnate.api.dom.DOMTokenList
{
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsOverlay
public static DOMSettableTokenList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMSettableTokenList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMSettableTokenList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMSettableTokenList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMSettableTokenList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMSettableTokenList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMSettableTokenList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMSettableTokenList.class);
}
}
