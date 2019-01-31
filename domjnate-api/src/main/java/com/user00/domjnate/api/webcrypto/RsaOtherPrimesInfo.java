package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RsaOtherPrimesInfo")
public interface RsaOtherPrimesInfo
{
@JsProperty(name="d")
String getD();
@JsProperty(name="d")
void setD(String val);
@JsProperty(name="r")
String getR();
@JsProperty(name="r")
void setR(String val);
@JsProperty(name="t")
String getT();
@JsProperty(name="t")
void setT(String val);
}
