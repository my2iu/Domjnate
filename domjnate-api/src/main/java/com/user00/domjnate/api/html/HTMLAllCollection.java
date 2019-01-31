package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLAllCollection")
public interface HTMLAllCollection
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
java.lang.Object item();
@JsMethod(name="item")
java.lang.Object item(String nameOrIndex);
@JsMethod(name="namedItem")
java.lang.Object namedItem(String name);
@JsOverlay
public default com.user00.domjnate.api.dom.Element get(double index) {
  return (com.user00.domjnate.api.dom.Element)com.user00.domjnate.util.Js.getIndex(this, index, com.user00.domjnate.api.dom.Element.class);
}
@JsOverlay
public default void set(double index, com.user00.domjnate.api.dom.Element val) {
  com.user00.domjnate.util.Js.setIndex(this, index, val);
}
@JsOverlay
public static HTMLAllCollection getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLAllCollection", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLAllCollection.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLAllCollection val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLAllCollection", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static HTMLAllCollection _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLAllCollection");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLAllCollection.class);
}
}
