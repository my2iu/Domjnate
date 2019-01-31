package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentRequest")
public interface PaymentRequest extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="id")
String getId();
@JsProperty(name="onshippingaddresschange")
OnshippingaddresschangeCallback getOnshippingaddresschange();
@JsProperty(name="onshippingaddresschange")
void setOnshippingaddresschange(OnshippingaddresschangeCallback val);
@JsProperty(name="onshippingoptionchange")
OnshippingoptionchangeCallback getOnshippingoptionchange();
@JsProperty(name="onshippingoptionchange")
void setOnshippingoptionchange(OnshippingoptionchangeCallback val);
@JsProperty(name="shippingAddress")
PaymentAddress getShippingAddress();
@JsProperty(name="shippingOption")
String getShippingOption();
@JsProperty(name="shippingType")
String getShippingType();
@JsMethod(name="abort")
Promise<Void> abort();
@JsMethod(name="canMakePayment")
Promise<Boolean> canMakePayment();
@JsMethod(name="show")
Promise<PaymentResponse> show();
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
@JsFunction public static interface OnshippingaddresschangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnshippingoptionchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static PaymentRequest getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentRequest", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PaymentRequest.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PaymentRequest val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentRequest", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PaymentRequest _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<PaymentMethodData> methodData, PaymentDetailsInit details) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PaymentRequest");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PaymentRequest.class, methodData, details);
}
@JsOverlay
public static PaymentRequest _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<PaymentMethodData> methodData, PaymentDetailsInit details, PaymentOptions options) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PaymentRequest");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PaymentRequest.class, methodData, details, options);
}
}
