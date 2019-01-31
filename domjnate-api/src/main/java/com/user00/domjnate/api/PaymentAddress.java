package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentAddress")
public interface PaymentAddress
{
@JsProperty(name="addressLine")
Array<String> getAddressLine();
@JsProperty(name="city")
String getCity();
@JsProperty(name="country")
String getCountry();
@JsProperty(name="dependentLocality")
String getDependentLocality();
@JsProperty(name="languageCode")
String getLanguageCode();
@JsProperty(name="organization")
String getOrganization();
@JsProperty(name="phone")
String getPhone();
@JsProperty(name="postalCode")
String getPostalCode();
@JsProperty(name="recipient")
String getRecipient();
@JsProperty(name="region")
String getRegion();
@JsProperty(name="sortingCode")
String getSortingCode();
@JsMethod(name="toJSON")
java.lang.Object toJSON();
@JsOverlay
public static PaymentAddress getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentAddress", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", PaymentAddress.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, PaymentAddress val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "PaymentAddress", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static PaymentAddress _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "PaymentAddress");
  return com.user00.domjnate.util.Js.construct(_win, constructor, PaymentAddress.class);
}
}
