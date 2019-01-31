package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCSrtpKeyParam")
public interface RTCSrtpKeyParam
{
@JsProperty(name="keyMethod")
String getKeyMethod();
@JsProperty(name="keyMethod")
void setKeyMethod(String val);
@JsProperty(name="keySalt")
String getKeySalt();
@JsProperty(name="keySalt")
void setKeySalt(String val);
@JsProperty(name="lifetime")
String getLifetime();
@JsProperty(name="lifetime")
void setLifetime(String val);
@JsProperty(name="mkiLength")
Double getMkiLength();
@JsProperty(name="mkiLength")
void setMkiLength(Double val);
@JsProperty(name="mkiValue")
Double getMkiValue();
@JsProperty(name="mkiValue")
void setMkiValue(Double val);
}
