package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSNamespaceRule")
public interface CSSNamespaceRule extends CSSRule
{
@JsProperty(name="namespaceURI")
String getNamespaceURI();
@JsProperty(name="prefix")
String getPrefix();
@JsOverlay
public static CSSNamespaceRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSNamespaceRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSNamespaceRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSNamespaceRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSNamespaceRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSNamespaceRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSNamespaceRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSNamespaceRule.class);
}
}
