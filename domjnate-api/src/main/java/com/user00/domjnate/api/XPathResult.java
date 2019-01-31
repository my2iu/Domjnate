package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="XPathResult")
public interface XPathResult
{
@JsProperty(name="booleanValue")
boolean getBooleanValue();
@JsProperty(name="invalidIteratorState")
boolean getInvalidIteratorState();
@JsProperty(name="numberValue")
double getNumberValue();
@JsProperty(name="resultType")
double getResultType();
@JsProperty(name="singleNodeValue")
com.user00.domjnate.api.dom.Node getSingleNodeValue();
@JsProperty(name="snapshotLength")
double getSnapshotLength();
@JsProperty(name="stringValue")
String getStringValue();
@JsProperty(name="ANY_TYPE")
double ANY_TYPE();
@JsProperty(name="ANY_UNORDERED_NODE_TYPE")
double ANY_UNORDERED_NODE_TYPE();
@JsProperty(name="BOOLEAN_TYPE")
double BOOLEAN_TYPE();
@JsProperty(name="FIRST_ORDERED_NODE_TYPE")
double FIRST_ORDERED_NODE_TYPE();
@JsProperty(name="NUMBER_TYPE")
double NUMBER_TYPE();
@JsProperty(name="ORDERED_NODE_ITERATOR_TYPE")
double ORDERED_NODE_ITERATOR_TYPE();
@JsProperty(name="ORDERED_NODE_SNAPSHOT_TYPE")
double ORDERED_NODE_SNAPSHOT_TYPE();
@JsProperty(name="STRING_TYPE")
double STRING_TYPE();
@JsProperty(name="UNORDERED_NODE_ITERATOR_TYPE")
double UNORDERED_NODE_ITERATOR_TYPE();
@JsProperty(name="UNORDERED_NODE_SNAPSHOT_TYPE")
double UNORDERED_NODE_SNAPSHOT_TYPE();
@JsMethod(name="iterateNext")
com.user00.domjnate.api.dom.Node iterateNext();
@JsMethod(name="snapshotItem")
com.user00.domjnate.api.dom.Node snapshotItem(double index);
@JsOverlay
public static XPathResult getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", XPathResult.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, XPathResult val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double ANY_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ANY_TYPE", double.class);
}
@JsOverlay
public static double ANY_UNORDERED_NODE_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ANY_UNORDERED_NODE_TYPE", double.class);
}
@JsOverlay
public static double BOOLEAN_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "BOOLEAN_TYPE", double.class);
}
@JsOverlay
public static double FIRST_ORDERED_NODE_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "FIRST_ORDERED_NODE_TYPE", double.class);
}
@JsOverlay
public static double NUMBER_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NUMBER_TYPE", double.class);
}
@JsOverlay
public static double ORDERED_NODE_ITERATOR_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ORDERED_NODE_ITERATOR_TYPE", double.class);
}
@JsOverlay
public static double ORDERED_NODE_SNAPSHOT_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "ORDERED_NODE_SNAPSHOT_TYPE", double.class);
}
@JsOverlay
public static double STRING_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "STRING_TYPE", double.class);
}
@JsOverlay
public static double UNORDERED_NODE_ITERATOR_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "UNORDERED_NODE_ITERATOR_TYPE", double.class);
}
@JsOverlay
public static double UNORDERED_NODE_SNAPSHOT_TYPE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "XPathResult", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "UNORDERED_NODE_SNAPSHOT_TYPE", double.class);
}
@JsOverlay
public static XPathResult _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "XPathResult");
  return com.user00.domjnate.util.Js.construct(_win, constructor, XPathResult.class);
}
}
