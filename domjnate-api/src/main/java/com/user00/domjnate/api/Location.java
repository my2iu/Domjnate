package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Location")
public interface Location
{
@JsProperty(name="ancestorOrigins")
com.user00.domjnate.api.dom.DOMStringList getAncestorOrigins();
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
@JsMethod(name="assign")
void assign(String url);
@JsMethod(name="reload")
void reload();
@JsMethod(name="reload")
void reload(boolean forcedReload);
@JsMethod(name="replace")
void replace(String url);
@JsOverlay
public static Location getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Location", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Location.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Location val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Location", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Location _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Location");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Location.class);
}
}
