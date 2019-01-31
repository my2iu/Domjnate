package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentOptions")
public interface PaymentOptions
{
@JsProperty(name="requestPayerEmail")
Boolean getRequestPayerEmail();
@JsProperty(name="requestPayerEmail")
void setRequestPayerEmail(Boolean val);
@JsProperty(name="requestPayerName")
Boolean getRequestPayerName();
@JsProperty(name="requestPayerName")
void setRequestPayerName(Boolean val);
@JsProperty(name="requestPayerPhone")
Boolean getRequestPayerPhone();
@JsProperty(name="requestPayerPhone")
void setRequestPayerPhone(Boolean val);
@JsProperty(name="requestShipping")
Boolean getRequestShipping();
@JsProperty(name="requestShipping")
void setRequestShipping(Boolean val);
@JsProperty(name="shippingType")
String getShippingType();
@JsProperty(name="shippingType")
void setShippingType(String val);
}
