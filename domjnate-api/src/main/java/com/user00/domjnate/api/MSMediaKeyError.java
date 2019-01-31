package com.user00.domjnate.api;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSMediaKeyError")
public interface MSMediaKeyError
{
@JsProperty(name="code")
double getCode();
@JsProperty(name="systemCode")
double getSystemCode();
@JsProperty(name="MS_MEDIA_KEYERR_CLIENT")
double MS_MEDIA_KEYERR_CLIENT();
@JsProperty(name="MS_MEDIA_KEYERR_DOMAIN")
double MS_MEDIA_KEYERR_DOMAIN();
@JsProperty(name="MS_MEDIA_KEYERR_HARDWARECHANGE")
double MS_MEDIA_KEYERR_HARDWARECHANGE();
@JsProperty(name="MS_MEDIA_KEYERR_OUTPUT")
double MS_MEDIA_KEYERR_OUTPUT();
@JsProperty(name="MS_MEDIA_KEYERR_SERVICE")
double MS_MEDIA_KEYERR_SERVICE();
@JsProperty(name="MS_MEDIA_KEYERR_UNKNOWN")
double MS_MEDIA_KEYERR_UNKNOWN();
@JsOverlay
public static MSMediaKeyError getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", MSMediaKeyError.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, MSMediaKeyError val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double MS_MEDIA_KEYERR_CLIENT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_KEYERR_CLIENT", double.class);
}
@JsOverlay
public static double MS_MEDIA_KEYERR_DOMAIN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_KEYERR_DOMAIN", double.class);
}
@JsOverlay
public static double MS_MEDIA_KEYERR_HARDWARECHANGE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_KEYERR_HARDWARECHANGE", double.class);
}
@JsOverlay
public static double MS_MEDIA_KEYERR_OUTPUT(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_KEYERR_OUTPUT", double.class);
}
@JsOverlay
public static double MS_MEDIA_KEYERR_SERVICE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_KEYERR_SERVICE", double.class);
}
@JsOverlay
public static double MS_MEDIA_KEYERR_UNKNOWN(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "MSMediaKeyError", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "MS_MEDIA_KEYERR_UNKNOWN", double.class);
}
@JsOverlay
public static MSMediaKeyError _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "MSMediaKeyError");
  return com.user00.domjnate.util.Js.construct(_win, constructor, MSMediaKeyError.class);
}
}
