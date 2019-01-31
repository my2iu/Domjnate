package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Attr")
public interface Attr extends Node
{
@JsProperty(name="localName")
String getLocalName();
@JsProperty(name="name")
String getName();
@JsProperty(name="namespaceURI")
String getNamespaceURI();
@JsProperty(name="ownerElement")
Element getOwnerElement();
@JsProperty(name="prefix")
String getPrefix();
@JsProperty(name="specified")
boolean getSpecified();
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
@JsOverlay
public static Attr getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Attr", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Attr.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Attr val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Attr", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Attr _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Attr");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Attr.class);
}
}
