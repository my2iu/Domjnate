package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGElementInstanceList")
public interface SVGElementInstanceList
{
@JsProperty(name="length")
double getLength();
@JsMethod(name="item")
SVGElementInstance item(double index);
@JsOverlay
public static SVGElementInstanceList getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGElementInstanceList", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGElementInstanceList.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGElementInstanceList val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGElementInstanceList", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGElementInstanceList _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGElementInstanceList");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGElementInstanceList.class);
}
}
