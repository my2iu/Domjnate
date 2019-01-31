package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ServiceWorkerContainer")
public interface ServiceWorkerContainer extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="controller")
ServiceWorker getController();
@JsProperty(name="oncontrollerchange")
OncontrollerchangeCallback getOncontrollerchange();
@JsProperty(name="oncontrollerchange")
void setOncontrollerchange(OncontrollerchangeCallback val);
@JsProperty(name="onmessage")
OnmessageCallback getOnmessage();
@JsProperty(name="onmessage")
void setOnmessage(OnmessageCallback val);
@JsProperty(name="onmessageerror")
OnmessageerrorCallback getOnmessageerror();
@JsProperty(name="onmessageerror")
void setOnmessageerror(OnmessageerrorCallback val);
@JsProperty(name="ready")
Promise<ServiceWorkerRegistration> getReady();
@JsMethod(name="getRegistration")
Promise<java.lang.Object> getRegistration();
@JsMethod(name="getRegistration")
Promise<java.lang.Object> getRegistration(String clientURL);
@JsMethod(name="getRegistrations")
Promise<ReadonlyArray<ServiceWorkerRegistration>> getRegistrations();
@JsMethod(name="register")
Promise<ServiceWorkerRegistration> register(String scriptURL);
@JsMethod(name="register")
Promise<ServiceWorkerRegistration> register(String scriptURL, RegistrationOptions options);
@JsMethod(name="startMessages")
void startMessages();
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
@JsFunction public static interface OncontrollerchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmessageCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsFunction public static interface OnmessageerrorCallback
{
java.lang.Object apply(MessageEvent ev);
}
@JsOverlay
public static ServiceWorkerContainer getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ServiceWorkerContainer", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", ServiceWorkerContainer.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, ServiceWorkerContainer val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "ServiceWorkerContainer", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static ServiceWorkerContainer _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "ServiceWorkerContainer");
  return com.user00.domjnate.util.Js.construct(_win, constructor, ServiceWorkerContainer.class);
}
}
