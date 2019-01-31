package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EcKeyImportParams")
public interface EcKeyImportParams extends Algorithm
{
@JsProperty(name="namedCurve")
String getNamedCurve();
@JsProperty(name="namedCurve")
void setNamedCurve(String val);
}
