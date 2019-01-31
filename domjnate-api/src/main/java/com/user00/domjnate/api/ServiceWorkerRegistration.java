package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ServiceWorkerRegistration")
public interface ServiceWorkerRegistration extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="active")
ServiceWorker getActive();
@JsProperty(name="installing")
ServiceWorker getInstalling();
@JsProperty(name="navigationPreload")
NavigationPreloadManager getNavigationPreload();
@JsProperty(name="onupdatefound")
OnupdatefoundCallback getOnupdatefound();
@JsProperty(name="onupdatefound")
void setOnupdatefound(OnupdatefoundCallback val);
@JsProperty(name="pushManager")
PushManager getPushManager();
@JsProperty(name="scope")
String getScope();
@JsProperty(name="sync")
SyncManager getSync();
@JsProperty(name="updateViaCache")
String getUpdateViaCache();
@JsProperty(name="waiting")
ServiceWorker getWaiting();
@JsMethod(name="getNotifications")
Promise<Array<Notification>> getNotifications();
@JsMethod(name="getNotifications")
Promise<Array<Notification>> getNotifications(GetNotificationOptions filter);
@JsMethod(name="showNotification")
Promise<Void> showNotification(String title);
@JsMethod(name="showNotification")
Promise<Void> showNotification(String title, NotificationOptions options);
@JsMethod(name="unregister")
Promise<Boolean> unregister();
@JsMethod(name="update")
Promise<Void> update();
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
@JsFunction public static interface OnupdatefoundCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static ServiceWorkerRegistration getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ServiceWorkerRegistration", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ServiceWorkerRegistration.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ServiceWorkerRegistration val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ServiceWorkerRegistration", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ServiceWorkerRegistration _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ServiceWorkerRegistration");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ServiceWorkerRegistration.class);
}
}
