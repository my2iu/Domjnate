package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Pbkdf2Params")
public interface Pbkdf2Params extends Algorithm
{
@JsProperty(name="hash")
java.lang.Object getHash();
@JsProperty(name="hash")
void setHash(java.lang.Object val);
@JsProperty(name="iterations")
double getIterations();
@JsProperty(name="iterations")
void setIterations(double val);
@JsProperty(name="salt")
java.lang.Object getSalt();
@JsProperty(name="salt")
void setSalt(java.lang.Object val);
}
