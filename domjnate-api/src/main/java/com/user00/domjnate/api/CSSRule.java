package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSRule")
public interface CSSRule
{
@JsProperty(name="cssText")
String getCssText();
@JsProperty(name="cssText")
void setCssText(String val);
@JsProperty(name="parentRule")
CSSRule getParentRule();
@JsProperty(name="parentStyleSheet")
CSSStyleSheet getParentStyleSheet();
@JsProperty(name="type")
double getType();
@JsProperty(name="CHARSET_RULE")
double CHARSET_RULE();
@JsProperty(name="FONT_FACE_RULE")
double FONT_FACE_RULE();
@JsProperty(name="IMPORT_RULE")
double IMPORT_RULE();
@JsProperty(name="KEYFRAMES_RULE")
double KEYFRAMES_RULE();
@JsProperty(name="KEYFRAME_RULE")
double KEYFRAME_RULE();
@JsProperty(name="MEDIA_RULE")
double MEDIA_RULE();
@JsProperty(name="NAMESPACE_RULE")
double NAMESPACE_RULE();
@JsProperty(name="PAGE_RULE")
double PAGE_RULE();
@JsProperty(name="STYLE_RULE")
double STYLE_RULE();
@JsProperty(name="SUPPORTS_RULE")
double SUPPORTS_RULE();
@JsProperty(name="UNKNOWN_RULE")
double UNKNOWN_RULE();
@JsProperty(name="VIEWPORT_RULE")
double VIEWPORT_RULE();
@JsOverlay
public static CSSRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double CHARSET_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "CHARSET_RULE", double.class);
}
@JsOverlay
public static double FONT_FACE_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "FONT_FACE_RULE", double.class);
}
@JsOverlay
public static double IMPORT_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "IMPORT_RULE", double.class);
}
@JsOverlay
public static double KEYFRAMES_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "KEYFRAMES_RULE", double.class);
}
@JsOverlay
public static double KEYFRAME_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "KEYFRAME_RULE", double.class);
}
@JsOverlay
public static double MEDIA_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MEDIA_RULE", double.class);
}
@JsOverlay
public static double NAMESPACE_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NAMESPACE_RULE", double.class);
}
@JsOverlay
public static double PAGE_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "PAGE_RULE", double.class);
}
@JsOverlay
public static double STYLE_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "STYLE_RULE", double.class);
}
@JsOverlay
public static double SUPPORTS_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "SUPPORTS_RULE", double.class);
}
@JsOverlay
public static double UNKNOWN_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "UNKNOWN_RULE", double.class);
}
@JsOverlay
public static double VIEWPORT_RULE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "VIEWPORT_RULE", double.class);
}
@JsOverlay
public static CSSRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSRule.class);
}
}
