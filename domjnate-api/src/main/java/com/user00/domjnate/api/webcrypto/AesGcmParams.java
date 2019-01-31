package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AesGcmParams")
public interface AesGcmParams extends Algorithm
{
@JsProperty(name="additionalData")
java.lang.Object getAdditionalData();
@JsProperty(name="additionalData")
void setAdditionalData(java.lang.Object val);
@JsProperty(name="iv")
java.lang.Object getIv();
@JsProperty(name="iv")
void setIv(java.lang.Object val);
@JsProperty(name="tagLength")
Double getTagLength();
@JsProperty(name="tagLength")
void setTagLength(Double val);
}
