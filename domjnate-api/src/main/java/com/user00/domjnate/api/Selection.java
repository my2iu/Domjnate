package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Selection")
public interface Selection
{
@JsProperty(name="anchorNode")
com.user00.domjnate.api.dom.Node getAnchorNode();
@JsProperty(name="anchorOffset")
double getAnchorOffset();
@JsProperty(name="baseNode")
com.user00.domjnate.api.dom.Node getBaseNode();
@JsProperty(name="baseOffset")
double getBaseOffset();
@JsProperty(name="extentNode")
com.user00.domjnate.api.dom.Node getExtentNode();
@JsProperty(name="extentOffset")
double getExtentOffset();
@JsProperty(name="focusNode")
com.user00.domjnate.api.dom.Node getFocusNode();
@JsProperty(name="focusOffset")
double getFocusOffset();
@JsProperty(name="isCollapsed")
boolean getIsCollapsed();
@JsProperty(name="rangeCount")
double getRangeCount();
@JsProperty(name="type")
String getType();
@JsMethod(name="addRange")
void addRange(com.user00.domjnate.api.dom.Range range);
@JsMethod(name="collapse")
void collapse(com.user00.domjnate.api.dom.Node parentNode, double offset);
@JsMethod(name="collapseToEnd")
void collapseToEnd();
@JsMethod(name="collapseToStart")
void collapseToStart();
@JsMethod(name="containsNode")
boolean containsNode(com.user00.domjnate.api.dom.Node node, boolean partlyContained);
@JsMethod(name="deleteFromDocument")
void deleteFromDocument();
@JsMethod(name="empty")
void empty();
@JsMethod(name="extend")
void extend(com.user00.domjnate.api.dom.Node newNode, double offset);
@JsMethod(name="getRangeAt")
com.user00.domjnate.api.dom.Range getRangeAt(double index);
@JsMethod(name="removeAllRanges")
void removeAllRanges();
@JsMethod(name="removeRange")
void removeRange(com.user00.domjnate.api.dom.Range range);
@JsMethod(name="selectAllChildren")
void selectAllChildren(com.user00.domjnate.api.dom.Node parentNode);
@JsMethod(name="setBaseAndExtent")
void setBaseAndExtent(com.user00.domjnate.api.dom.Node baseNode, double baseOffset, com.user00.domjnate.api.dom.Node extentNode, double extentOffset);
@JsMethod(name="setPosition")
void setPosition(com.user00.domjnate.api.dom.Node parentNode, double offset);
@JsMethod(name="toString")
String toString();
@JsOverlay
public static Selection getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Selection", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Selection.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Selection val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Selection", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Selection _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Selection");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Selection.class);
}
}
