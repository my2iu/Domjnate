package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CSS")
public interface CSS
{
@JsOverlay
public static String escape(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String value) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "CSS", "escape", String.class, value);
}
@JsOverlay
public static boolean supports(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String property) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "CSS", "supports", boolean.class, property);
}
@JsOverlay
public static boolean supports(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String property, String value) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "CSS", "supports", boolean.class, property, value);
}
}
