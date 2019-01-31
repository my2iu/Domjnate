package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XSLTProcessor")
public interface XSLTProcessor
{
@JsMethod(name="clearParameters")
void clearParameters();
@JsMethod(name="getParameter")
java.lang.Object getParameter(String namespaceURI, String localName);
@JsMethod(name="importStylesheet")
void importStylesheet(com.user00.domjnate.api.dom.Node style);
@JsMethod(name="removeParameter")
void removeParameter(String namespaceURI, String localName);
@JsMethod(name="reset")
void reset();
@JsMethod(name="setParameter")
void setParameter(String namespaceURI, String localName, java.lang.Object value);
@JsMethod(name="transformToDocument")
com.user00.domjnate.api.dom.Document transformToDocument(com.user00.domjnate.api.dom.Node source);
@JsMethod(name="transformToFragment")
com.user00.domjnate.api.dom.DocumentFragment transformToFragment(com.user00.domjnate.api.dom.Node source, com.user00.domjnate.api.dom.Document document);
@JsOverlay
public static XSLTProcessor getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XSLTProcessor", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XSLTProcessor.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XSLTProcessor val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XSLTProcessor", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static XSLTProcessor _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XSLTProcessor");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XSLTProcessor.class);
}
}
