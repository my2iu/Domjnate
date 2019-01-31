package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentType")
public interface DocumentType extends Node, ChildNode
{
@JsProperty(name="name")
String getName();
@JsProperty(name="publicId")
String getPublicId();
@JsProperty(name="systemId")
String getSystemId();
@JsOverlay
public static DocumentType getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DocumentType", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DocumentType.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DocumentType val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DocumentType", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DocumentType _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DocumentType");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DocumentType.class);
}
}
