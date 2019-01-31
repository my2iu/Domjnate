package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentDetailsBase")
public interface PaymentDetailsBase
{
@JsProperty(name="displayItems")
Array<PaymentItem> getDisplayItems();
@JsProperty(name="displayItems")
void setDisplayItems(Array<PaymentItem> val);
@JsProperty(name="modifiers")
Array<PaymentDetailsModifier> getModifiers();
@JsProperty(name="modifiers")
void setModifiers(Array<PaymentDetailsModifier> val);
@JsProperty(name="shippingOptions")
Array<PaymentShippingOption> getShippingOptions();
@JsProperty(name="shippingOptions")
void setShippingOptions(Array<PaymentShippingOption> val);
}
