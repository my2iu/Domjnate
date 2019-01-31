package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAnimatedBoolean")
public interface SVGAnimatedBoolean
{
@JsProperty(name="animVal")
boolean getAnimVal();
@JsProperty(name="baseVal")
boolean getBaseVal();
@JsProperty(name="baseVal")
void setBaseVal(boolean val);
@JsOverlay
public static SVGAnimatedBoolean getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedBoolean", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAnimatedBoolean.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAnimatedBoolean val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAnimatedBoolean", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SVGAnimatedBoolean _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAnimatedBoolean");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAnimatedBoolean.class);
}
}
