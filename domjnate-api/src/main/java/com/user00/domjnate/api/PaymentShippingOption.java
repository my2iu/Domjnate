package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentShippingOption")
public interface PaymentShippingOption
{
@JsProperty(name="amount")
PaymentCurrencyAmount getAmount();
@JsProperty(name="amount")
void setAmount(PaymentCurrencyAmount val);
@JsProperty(name="id")
String getId();
@JsProperty(name="id")
void setId(String val);
@JsProperty(name="label")
String getLabel();
@JsProperty(name="label")
void setLabel(String val);
@JsProperty(name="selected")
Boolean getSelected();
@JsProperty(name="selected")
void setSelected(Boolean val);
}
