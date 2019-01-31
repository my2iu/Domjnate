package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorID")
public interface NavigatorID
{
@JsProperty(name="appCodeName")
String getAppCodeName();
@JsProperty(name="appName")
String getAppName();
@JsProperty(name="appVersion")
String getAppVersion();
@JsProperty(name="platform")
String getPlatform();
@JsProperty(name="product")
String getProduct();
@JsProperty(name="productSub")
String getProductSub();
@JsProperty(name="userAgent")
String getUserAgent();
@JsProperty(name="vendor")
String getVendor();
@JsProperty(name="vendorSub")
String getVendorSub();
}
