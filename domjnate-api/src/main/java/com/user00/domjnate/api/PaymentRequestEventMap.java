package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PaymentRequestEventMap")
public interface PaymentRequestEventMap
{
@JsProperty(name="shippingaddresschange")
com.user00.domjnate.api.dom.Event getShippingaddresschange();
@JsProperty(name="shippingaddresschange")
void setShippingaddresschange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="shippingoptionchange")
com.user00.domjnate.api.dom.Event getShippingoptionchange();
@JsProperty(name="shippingoptionchange")
void setShippingoptionchange(com.user00.domjnate.api.dom.Event val);
}
