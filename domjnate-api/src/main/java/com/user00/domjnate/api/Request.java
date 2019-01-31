package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Request")
public interface Request extends Body
{
@JsProperty(name="cache")
String getCache();
@JsProperty(name="credentials")
String getCredentials();
@JsProperty(name="destination")
String getDestination();
@JsProperty(name="headers")
Headers getHeaders();
@JsProperty(name="integrity")
String getIntegrity();
@JsProperty(name="isHistoryNavigation")
boolean getIsHistoryNavigation();
@JsProperty(name="isReloadNavigation")
boolean getIsReloadNavigation();
@JsProperty(name="keepalive")
boolean getKeepalive();
@JsProperty(name="method")
String getMethod();
@JsProperty(name="mode")
String getMode();
@JsProperty(name="redirect")
String getRedirect();
@JsProperty(name="referrer")
String getReferrer();
@JsProperty(name="referrerPolicy")
String getReferrerPolicy();
@JsProperty(name="signal")
AbortSignal getSignal();
@JsProperty(name="url")
String getUrl();
@JsMethod(name="clone")
Request clone();
@JsOverlay
public static Request getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Request", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Request.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Request val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Request", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Request _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String input) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Request");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Request.class, input);
}
@JsOverlay
public static Request _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Request input) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Request");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Request.class, input);
}
@JsOverlay
public static Request _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String input, RequestInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Request");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Request.class, input, init);
}
@JsOverlay
public static Request _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Request input, RequestInit init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Request");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Request.class, input, init);
}
}
