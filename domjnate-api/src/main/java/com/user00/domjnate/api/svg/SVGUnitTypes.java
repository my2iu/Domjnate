package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGUnitTypes")
public interface SVGUnitTypes
{
@JsProperty(name="SVG_UNIT_TYPE_OBJECTBOUNDINGBOX")
double SVG_UNIT_TYPE_OBJECTBOUNDINGBOX();
@JsProperty(name="SVG_UNIT_TYPE_UNKNOWN")
double SVG_UNIT_TYPE_UNKNOWN();
@JsProperty(name="SVG_UNIT_TYPE_USERSPACEONUSE")
double SVG_UNIT_TYPE_USERSPACEONUSE();
@JsOverlay
public static SVGUnitTypes getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGUnitTypes", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGUnitTypes.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGUnitTypes val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGUnitTypes", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_UNIT_TYPE_OBJECTBOUNDINGBOX(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGUnitTypes", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_UNIT_TYPE_OBJECTBOUNDINGBOX", double.class);
}
@JsOverlay
public static double SVG_UNIT_TYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGUnitTypes", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_UNIT_TYPE_UNKNOWN", double.class);
}
@JsOverlay
public static double SVG_UNIT_TYPE_USERSPACEONUSE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGUnitTypes", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_UNIT_TYPE_USERSPACEONUSE", double.class);
}
@JsOverlay
public static SVGUnitTypes _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGUnitTypes");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGUnitTypes.class);
}
}
