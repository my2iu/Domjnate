package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGLength")
public interface SVGLength
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
@JsProperty(name="SVG_LENGTHTYPE_CM")
double SVG_LENGTHTYPE_CM();
@JsProperty(name="SVG_LENGTHTYPE_EMS")
double SVG_LENGTHTYPE_EMS();
@JsProperty(name="SVG_LENGTHTYPE_EXS")
double SVG_LENGTHTYPE_EXS();
@JsProperty(name="SVG_LENGTHTYPE_IN")
double SVG_LENGTHTYPE_IN();
@JsProperty(name="SVG_LENGTHTYPE_MM")
double SVG_LENGTHTYPE_MM();
@JsProperty(name="SVG_LENGTHTYPE_NUMBER")
double SVG_LENGTHTYPE_NUMBER();
@JsProperty(name="SVG_LENGTHTYPE_PC")
double SVG_LENGTHTYPE_PC();
@JsProperty(name="SVG_LENGTHTYPE_PERCENTAGE")
double SVG_LENGTHTYPE_PERCENTAGE();
@JsProperty(name="SVG_LENGTHTYPE_PT")
double SVG_LENGTHTYPE_PT();
@JsProperty(name="SVG_LENGTHTYPE_PX")
double SVG_LENGTHTYPE_PX();
@JsProperty(name="SVG_LENGTHTYPE_UNKNOWN")
double SVG_LENGTHTYPE_UNKNOWN();
@JsMethod(name="convertToSpecifiedUnits")
void convertToSpecifiedUnits(double unitType);
@JsMethod(name="newValueSpecifiedUnits")
void newValueSpecifiedUnits(double unitType, double valueInSpecifiedUnits);
@JsOverlay
public static SVGLength getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SVGLength.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SVGLength val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double SVG_LENGTHTYPE_CM(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_CM", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_EMS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_EMS", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_EXS(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_EXS", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_IN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_IN", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_MM(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_MM", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_NUMBER(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_NUMBER", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_PC(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_PC", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_PERCENTAGE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_PERCENTAGE", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_PT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_PT", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_PX(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_PX", double.class);
}
@JsOverlay
public static double SVG_LENGTHTYPE_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SVGLength", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SVG_LENGTHTYPE_UNKNOWN", double.class);
}
@JsOverlay
public static SVGLength _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SVGLength");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SVGLength.class);
}
}
