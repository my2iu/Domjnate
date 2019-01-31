package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XPathNSResolver")
public interface XPathNSResolver
{
@JsMethod(name="lookupNamespaceURI")
String lookupNamespaceURI(String prefix);
@JsOverlay
public static XPathNSResolver getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathNSResolver", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XPathNSResolver.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XPathNSResolver val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathNSResolver", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static XPathNSResolver _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XPathNSResolver");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XPathNSResolver.class);
}
}
