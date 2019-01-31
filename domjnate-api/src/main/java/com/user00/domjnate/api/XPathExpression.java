package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XPathExpression")
public interface XPathExpression
{
@JsMethod(name="evaluate")
XPathResult evaluate(com.user00.domjnate.api.dom.Node contextNode, double type, XPathResult result);
@JsOverlay
public static XPathExpression getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathExpression", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XPathExpression.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XPathExpression val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathExpression", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static XPathExpression _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XPathExpression");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XPathExpression.class);
}
}
