package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HkdfParams")
public interface HkdfParams extends Algorithm
{
@JsProperty(name="hash")
java.lang.Object getHash();
@JsProperty(name="hash")
void setHash(java.lang.Object val);
@JsProperty(name="info")
java.lang.Object getInfo();
@JsProperty(name="info")
void setInfo(java.lang.Object val);
@JsProperty(name="salt")
java.lang.Object getSalt();
@JsProperty(name="salt")
void setSalt(java.lang.Object val);
}
