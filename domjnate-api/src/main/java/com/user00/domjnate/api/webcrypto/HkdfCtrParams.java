package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HkdfCtrParams")
public interface HkdfCtrParams extends Algorithm
{
@JsProperty(name="context")
java.lang.Object getContext();
@JsProperty(name="context")
void setContext(java.lang.Object val);
@JsProperty(name="hash")
java.lang.Object getHash();
@JsProperty(name="hash")
void setHash(java.lang.Object val);
@JsProperty(name="label")
java.lang.Object getLabel();
@JsProperty(name="label")
void setLabel(java.lang.Object val);
}
