package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentRequestUpdateEvent")
public interface PaymentRequestUpdateEvent extends com.user00.domjnate.api.dom.Event
{
@JsMethod(name="updateWith")
void updateWith(Promise<PaymentDetailsUpdate> detailsPromise);
@JsOverlay
public static PaymentRequestUpdateEvent getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentRequestUpdateEvent", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PaymentRequestUpdateEvent.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PaymentRequestUpdateEvent val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentRequestUpdateEvent", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PaymentRequestUpdateEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PaymentRequestUpdateEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PaymentRequestUpdateEvent.class, type);
}
@JsOverlay
public static PaymentRequestUpdateEvent _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String type, PaymentRequestUpdateEventInit eventInitDict) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PaymentRequestUpdateEvent");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PaymentRequestUpdateEvent.class, type, eventInitDict);
}
}
