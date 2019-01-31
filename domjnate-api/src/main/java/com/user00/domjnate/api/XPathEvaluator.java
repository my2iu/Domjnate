package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XPathEvaluator")
public interface XPathEvaluator
{
@JsMethod(name="createExpression")
XPathExpression createExpression(String expression, XPathNSResolver resolver);
@JsMethod(name="createNSResolver")
XPathNSResolver createNSResolver();
@JsMethod(name="createNSResolver")
XPathNSResolver createNSResolver(com.user00.domjnate.api.dom.Node nodeResolver);
@JsMethod(name="evaluate")
XPathResult evaluate(String expression, com.user00.domjnate.api.dom.Node contextNode, java.lang.Object resolver, double type, XPathResult result);
@JsMethod(name="evaluate")
XPathResult evaluate(String expression, com.user00.domjnate.api.dom.Node contextNode, XPathNSResolver resolver, double type, XPathResult result);
@JsOverlay
public static XPathEvaluator getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathEvaluator", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XPathEvaluator.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XPathEvaluator val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathEvaluator", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static XPathEvaluator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XPathEvaluator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XPathEvaluator.class);
}
}
