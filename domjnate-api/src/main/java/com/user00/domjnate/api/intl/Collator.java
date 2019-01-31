package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Collator")
public interface Collator
{
@JsMethod(name="compare")
double compare(String x, String y);
@JsMethod(name="resolvedOptions")
ResolvedCollatorOptions resolvedOptions();
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Collator", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Collator", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, CollatorOptions options) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Collator", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales, options);
}
@JsOverlay
public static com.user00.domjnate.api.Array<String> supportedLocalesOf(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, CollatorOptions options) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Collator", "supportedLocalesOf", com.user00.domjnate.api.Array.class, locales, options);
}
@JsOverlay
public static Collator call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Collator", Collator.class);
}
@JsOverlay
public static Collator call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Collator", Collator.class, locales);
}
@JsOverlay
public static Collator call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Collator", Collator.class, locales);
}
@JsOverlay
public static Collator call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, CollatorOptions options) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Collator", Collator.class, locales, options);
}
@JsOverlay
public static Collator call(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, CollatorOptions options) {
  return com.user00.domjnate.util.Js.callMethod(_win, "Collator", Collator.class, locales, options);
}
@JsOverlay
public static Collator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Collator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Collator.class);
}
@JsOverlay
public static Collator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Collator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Collator.class, locales);
}
@JsOverlay
public static Collator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Collator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Collator.class, locales);
}
@JsOverlay
public static Collator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.Array<String> locales, CollatorOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Collator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Collator.class, locales, options);
}
@JsOverlay
public static Collator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String locales, CollatorOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Collator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Collator.class, locales, options);
}
}
