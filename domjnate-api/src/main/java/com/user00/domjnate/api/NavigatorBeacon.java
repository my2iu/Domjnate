package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorBeacon")
public interface NavigatorBeacon
{
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, String data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, FormData data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, ArrayBuffer data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, DataView data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Float64Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Float32Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Uint8ClampedArray data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Uint32Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Uint16Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Uint8Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Int32Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Int16Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Int8Array data);
@JsMethod(name="sendBeacon")
boolean sendBeacon(String url, Blob data);
}
