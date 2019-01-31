package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="URL")
public interface URL
{
@JsProperty(name="hash")
String getHash();
@JsProperty(name="hash")
void setHash(String val);
@JsProperty(name="host")
String getHost();
@JsProperty(name="host")
void setHost(String val);
@JsProperty(name="hostname")
String getHostname();
@JsProperty(name="hostname")
void setHostname(String val);
@JsProperty(name="href")
String getHref();
@JsProperty(name="href")
void setHref(String val);
@JsProperty(name="origin")
String getOrigin();
@JsProperty(name="password")
String getPassword();
@JsProperty(name="password")
void setPassword(String val);
@JsProperty(name="pathname")
String getPathname();
@JsProperty(name="pathname")
void setPathname(String val);
@JsProperty(name="port")
String getPort();
@JsProperty(name="port")
void setPort(String val);
@JsProperty(name="protocol")
String getProtocol();
@JsProperty(name="protocol")
void setProtocol(String val);
@JsProperty(name="search")
String getSearch();
@JsProperty(name="search")
void setSearch(String val);
@JsProperty(name="searchParams")
URLSearchParams getSearchParams();
@JsProperty(name="username")
String getUsername();
@JsProperty(name="username")
void setUsername(String val);
@JsMethod(name="toJSON")
String toJSON();
@JsOverlay
public static URL getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "URL", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", URL.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, URL val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "URL", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static String createObjectURL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, java.lang.Object object) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "URL", "createObjectURL", String.class, object);
}
@JsOverlay
public static void revokeObjectURL(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url) {
  com.user00.domjnate.util.Js.callStaticMethod(_win, "URL", "revokeObjectURL", void.class, url);
}
@JsOverlay
public static URL _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "URL");
  return com.user00.domjnate.util.Js.construct(_win, constructor, URL.class, url);
}
@JsOverlay
public static URL _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url, URL base) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "URL");
  return com.user00.domjnate.util.Js.construct(_win, constructor, URL.class, url, base);
}
@JsOverlay
public static URL _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String url, String base) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "URL");
  return com.user00.domjnate.util.Js.construct(_win, constructor, URL.class, url, base);
}
}
