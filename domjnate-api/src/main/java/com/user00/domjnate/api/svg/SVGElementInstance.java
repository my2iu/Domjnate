package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGElementInstance")
public interface SVGElementInstance extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="correspondingElement")
SVGElement getCorrespondingElement();
@JsProperty(name="correspondingUseElement")
SVGUseElement getCorrespondingUseElement();
@JsOverlay
public static SVGElementInstance getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGElementInstance", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGElementInstance.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGElementInstance val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGElementInstance", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGElementInstance _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGElementInstance");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGElementInstance.class);
}
}
