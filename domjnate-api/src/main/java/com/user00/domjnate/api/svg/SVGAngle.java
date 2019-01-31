package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGAngle")
public interface SVGAngle
{
@JsProperty(name="unitType")
double getUnitType();
@JsProperty(name="value")
double getValue();
@JsProperty(name="value")
void setValue(double val);
@JsProperty(name="valueAsString")
String getValueAsString();
@JsProperty(name="valueAsString")
void setValueAsString(String val);
@JsProperty(name="valueInSpecifiedUnits")
double getValueInSpecifiedUnits();
@JsProperty(name="valueInSpecifiedUnits")
void setValueInSpecifiedUnits(double val);
@JsProperty(name="SVG_ANGLETYPE_DEG")
double SVG_ANGLETYPE_DEG();
@JsProperty(name="SVG_ANGLETYPE_GRAD")
double SVG_ANGLETYPE_GRAD();
@JsProperty(name="SVG_ANGLETYPE_RAD")
double SVG_ANGLETYPE_RAD();
@JsProperty(name="SVG_ANGLETYPE_UNKNOWN")
double SVG_ANGLETYPE_UNKNOWN();
@JsProperty(name="SVG_ANGLETYPE_UNSPECIFIED")
double SVG_ANGLETYPE_UNSPECIFIED();
@JsMethod(name="convertToSpecifiedUnits")
void convertToSpecifiedUnits(double unitType);
@JsMethod(name="newValueSpecifiedUnits")
void newValueSpecifiedUnits(double unitType, double valueInSpecifiedUnits);
@JsOverlay
public static SVGAngle getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGAngle.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGAngle val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_ANGLETYPE_DEG(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ANGLETYPE_DEG", double.class);
}
@JsOverlay
public static double SVG_ANGLETYPE_GRAD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ANGLETYPE_GRAD", double.class);
}
@JsOverlay
public static double SVG_ANGLETYPE_RAD(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ANGLETYPE_RAD", double.class);
}
@JsOverlay
public static double SVG_ANGLETYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ANGLETYPE_UNKNOWN", double.class);
}
@JsOverlay
public static double SVG_ANGLETYPE_UNSPECIFIED(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGAngle", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_ANGLETYPE_UNSPECIFIED", double.class);
}
@JsOverlay
public static SVGAngle _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGAngle");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGAngle.class);
}
}
