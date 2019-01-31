package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSSImportRule")
public interface CSSImportRule extends CSSRule
{
@JsProperty(name="href")
String getHref();
@JsProperty(name="media")
MediaList getMedia();
@JsProperty(name="styleSheet")
CSSStyleSheet getStyleSheet();
@JsOverlay
public static CSSImportRule getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSImportRule", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", CSSImportRule.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, CSSImportRule val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "CSSImportRule", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static CSSImportRule _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "CSSImportRule");
  return com.user00.domjnate.util.Js.construct(_win, constructor, CSSImportRule.class);
}
}
