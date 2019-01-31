package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="TreeWalker")
public interface TreeWalker
{
@JsProperty(name="currentNode")
Node getCurrentNode();
@JsProperty(name="currentNode")
void setCurrentNode(Node val);
@JsProperty(name="filter")
NodeFilter getFilter();
@JsProperty(name="root")
Node getRoot();
@JsProperty(name="whatToShow")
double getWhatToShow();
@JsMethod(name="firstChild")
Node firstChild();
@JsMethod(name="lastChild")
Node lastChild();
@JsMethod(name="nextNode")
Node nextNode();
@JsMethod(name="nextSibling")
Node nextSibling();
@JsMethod(name="parentNode")
Node parentNode();
@JsMethod(name="previousNode")
Node previousNode();
@JsMethod(name="previousSibling")
Node previousSibling();
@JsOverlay
public static TreeWalker getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TreeWalker", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", TreeWalker.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, TreeWalker val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "TreeWalker", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static TreeWalker _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "TreeWalker");
  return com.user00.domjnate.util.Js.construct(_win, constructor, TreeWalker.class);
}
}
