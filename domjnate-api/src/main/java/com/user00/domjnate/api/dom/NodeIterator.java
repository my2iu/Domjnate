package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NodeIterator")
public interface NodeIterator
{
@JsProperty(name="filter")
NodeFilter getFilter();
@JsProperty(name="pointerBeforeReferenceNode")
boolean getPointerBeforeReferenceNode();
@JsProperty(name="referenceNode")
Node getReferenceNode();
@JsProperty(name="root")
Node getRoot();
@JsProperty(name="whatToShow")
double getWhatToShow();
@JsMethod(name="detach")
void detach();
@JsMethod(name="nextNode")
Node nextNode();
@JsMethod(name="previousNode")
Node previousNode();
@JsOverlay
public static NodeIterator getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NodeIterator", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", NodeIterator.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, NodeIterator val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NodeIterator", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static NodeIterator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NodeIterator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NodeIterator.class);
}
}
