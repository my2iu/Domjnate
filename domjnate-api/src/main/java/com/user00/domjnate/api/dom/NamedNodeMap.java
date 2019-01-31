package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NamedNodeMap")
public interface NamedNodeMap
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="getNamedItem")
Attr getNamedItem(String qualifiedName);
@JsMethod(name="getNamedItemNS")
Attr getNamedItemNS(String namespace, String localName);
@JsMethod(name="item")
Attr item(double index);
@JsMethod(name="removeNamedItem")
Attr removeNamedItem(String qualifiedName);
@JsMethod(name="removeNamedItemNS")
Attr removeNamedItemNS(String namespace, String localName);
@JsMethod(name="setNamedItem")
Attr setNamedItem(Attr attr);
@JsMethod(name="setNamedItemNS")
Attr setNamedItemNS(Attr attr);
@JsOverlay
public default Attr get(double index) {
  return (Attr)com.user00.domjnate.util.Js.getIndex(this, index, Attr.class);
}
@JsOverlay
public default void set(double index, Attr val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static NamedNodeMap getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NamedNodeMap", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", NamedNodeMap.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, NamedNodeMap val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "NamedNodeMap", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static NamedNodeMap _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "NamedNodeMap");
  return com.user00.domjnate.util.Js.construct(_win, constructor, NamedNodeMap.class);
}
}
