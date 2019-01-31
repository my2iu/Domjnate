package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Notification")
public interface Notification extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="actions")
ReadonlyArray<NotificationAction> getActions();
@JsProperty(name="badge")
String getBadge();
@JsProperty(name="body")
String getBody();
@JsProperty(name="data")
java.lang.Object getData();
@JsProperty(name="dir")
String getDir();
@JsProperty(name="icon")
String getIcon();
@JsProperty(name="image")
String getImage();
@JsProperty(name="lang")
String getLang();
@JsProperty(name="onclick")
OnclickCallback getOnclick();
@JsProperty(name="onclick")
void setOnclick(OnclickCallback val);
@JsProperty(name="onclose")
OncloseCallback getOnclose();
@JsProperty(name="onclose")
void setOnclose(OncloseCallback val);
@JsProperty(name="onerror")
OnerrorCallback getOnerror();
@JsProperty(name="onerror")
void setOnerror(OnerrorCallback val);
@JsProperty(name="onshow")
OnshowCallback getOnshow();
@JsProperty(name="onshow")
void setOnshow(OnshowCallback val);
@JsProperty(name="renotify")
boolean getRenotify();
@JsProperty(name="requireInteraction")
boolean getRequireInteraction();
@JsProperty(name="silent")
boolean getSilent();
@JsProperty(name="tag")
String getTag();
@JsProperty(name="timestamp")
double getTimestamp();
@JsProperty(name="title")
String getTitle();
@JsProperty(name="vibrate")
ReadonlyArray<Double> getVibrate();
@JsMethod(name="close")
void close();
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface OnerrorCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncloseCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnshowCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnclickCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static Notification getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Notification", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Notification.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Notification val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Notification", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double getMaxActions(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Notification", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "maxActions", double.class);
}
@JsOverlay
public static String getPermission(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Notification", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "permission", String.class);
}
@JsOverlay
public static Promise<String> requestPermission(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Notification", "requestPermission", Promise.class);
}
@JsOverlay
public static Promise<String> requestPermission(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, NotificationPermissionCallback deprecatedCallback) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "Notification", "requestPermission", Promise.class, deprecatedCallback);
}
@JsOverlay
public static Notification _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String title) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Notification");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Notification.class, title);
}
@JsOverlay
public static Notification _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String title, NotificationOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Notification");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Notification.class, title, options);
}
}
