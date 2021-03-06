package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XMLSerializer")
public interface XMLSerializer
{
@JsMethod(name="serializeToString")
String serializeToString(com.user00.domjnate.api.dom.Node root);
@JsOverlay
public static XMLSerializer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLSerializer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XMLSerializer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XMLSerializer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XMLSerializer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static XMLSerializer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XMLSerializer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XMLSerializer.class);
}
}
