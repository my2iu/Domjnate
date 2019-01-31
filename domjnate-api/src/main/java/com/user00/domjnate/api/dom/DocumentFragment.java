package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentFragment")
public interface DocumentFragment extends Node, com.user00.domjnate.api.NonElementParentNode, ParentNode
{
@JsMethod(name="getElementById")
com.user00.domjnate.api.html.HTMLElement getElementById(String elementId);
@JsOverlay
public static DocumentFragment getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DocumentFragment", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DocumentFragment.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DocumentFragment val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DocumentFragment", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DocumentFragment _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DocumentFragment");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DocumentFragment.class);
}
}
