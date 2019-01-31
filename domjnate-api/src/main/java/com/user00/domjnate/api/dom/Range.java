package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Range")
public interface Range extends com.user00.domjnate.api.AbstractRange
{
@JsProperty(name="commonAncestorContainer")
Node getCommonAncestorContainer();
@JsProperty(name="END_TO_END")
double END_TO_END();
@JsProperty(name="END_TO_START")
double END_TO_START();
@JsProperty(name="START_TO_END")
double START_TO_END();
@JsProperty(name="START_TO_START")
double START_TO_START();
@JsMethod(name="cloneContents")
DocumentFragment cloneContents();
@JsMethod(name="cloneRange")
Range cloneRange();
@JsMethod(name="collapse")
void collapse();
@JsMethod(name="collapse")
void collapse(boolean toStart);
@JsMethod(name="compareBoundaryPoints")
double compareBoundaryPoints(double how, Range sourceRange);
@JsMethod(name="comparePoint")
double comparePoint(Node node, double offset);
@JsMethod(name="createContextualFragment")
DocumentFragment createContextualFragment(String fragment);
@JsMethod(name="deleteContents")
void deleteContents();
@JsMethod(name="detach")
void detach();
@JsMethod(name="extractContents")
DocumentFragment extractContents();
@JsMethod(name="getBoundingClientRect")
java.lang.Object getBoundingClientRect();
@JsMethod(name="getClientRects")
java.lang.Object getClientRects();
@JsMethod(name="insertNode")
void insertNode(Node node);
@JsMethod(name="intersectsNode")
boolean intersectsNode(Node node);
@JsMethod(name="isPointInRange")
boolean isPointInRange(Node node, double offset);
@JsMethod(name="selectNode")
void selectNode(Node node);
@JsMethod(name="selectNodeContents")
void selectNodeContents(Node node);
@JsMethod(name="setEnd")
void setEnd(Node node, double offset);
@JsMethod(name="setEndAfter")
void setEndAfter(Node node);
@JsMethod(name="setEndBefore")
void setEndBefore(Node node);
@JsMethod(name="setStart")
void setStart(Node node, double offset);
@JsMethod(name="setStartAfter")
void setStartAfter(Node node);
@JsMethod(name="setStartBefore")
void setStartBefore(Node node);
@JsMethod(name="surroundContents")
void surroundContents(Node newParent);
@JsOverlay
public static Range getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Range", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Range.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Range val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Range", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double END_TO_END(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Range", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "END_TO_END", double.class);
}
@JsOverlay
public static double END_TO_START(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Range", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "END_TO_START", double.class);
}
@JsOverlay
public static double START_TO_END(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Range", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "START_TO_END", double.class);
}
@JsOverlay
public static double START_TO_START(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Range", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "START_TO_START", double.class);
}
@JsOverlay
public static Range _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Range");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Range.class);
}
}
