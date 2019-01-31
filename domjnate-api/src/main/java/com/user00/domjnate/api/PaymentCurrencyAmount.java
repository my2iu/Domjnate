package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentCurrencyAmount")
public interface PaymentCurrencyAmount
{
@JsProperty(name="currency")
String getCurrency();
@JsProperty(name="currency")
void setCurrency(String val);
@JsProperty(name="currencySystem")
String getCurrencySystem();
@JsProperty(name="currencySystem")
void setCurrencySystem(String val);
@JsProperty(name="value")
String getValue();
@JsProperty(name="value")
void setValue(String val);
}
