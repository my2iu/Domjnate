package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentResponse")
public interface PaymentResponse
{
@JsProperty(name="details")
java.lang.Object getDetails();
@JsProperty(name="methodName")
String getMethodName();
@JsProperty(name="payerEmail")
String getPayerEmail();
@JsProperty(name="payerName")
String getPayerName();
@JsProperty(name="payerPhone")
String getPayerPhone();
@JsProperty(name="requestId")
String getRequestId();
@JsProperty(name="shippingAddress")
PaymentAddress getShippingAddress();
@JsProperty(name="shippingOption")
String getShippingOption();
@JsMethod(name="complete")
Promise<Void> complete();
@JsMethod(name="complete")
Promise<Void> complete(String result);
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PaymentResponse getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentResponse", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PaymentResponse.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PaymentResponse val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentResponse", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PaymentResponse _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PaymentResponse");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PaymentResponse.class);
}
}
