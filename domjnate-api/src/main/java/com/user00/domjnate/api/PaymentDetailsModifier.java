package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentDetailsModifier")
public interface PaymentDetailsModifier
{
@JsProperty(name="additionalDisplayItems")
Array<PaymentItem> getAdditionalDisplayItems();
@JsProperty(name="additionalDisplayItems")
void setAdditionalDisplayItems(Array<PaymentItem> val);
@JsProperty(name="data")
java.lang.Object getData();
@JsProperty(name="data")
void setData(java.lang.Object val);
@JsProperty(name="supportedMethods")
java.lang.Object getSupportedMethods();
@JsProperty(name="supportedMethods")
void setSupportedMethods(java.lang.Object val);
@JsProperty(name="total")
PaymentItem getTotal();
@JsProperty(name="total")
void setTotal(PaymentItem val);
}
