package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCSrtpSdesParameters")
public interface RTCSrtpSdesParameters
{
@JsProperty(name="cryptoSuite")
String getCryptoSuite();
@JsProperty(name="cryptoSuite")
void setCryptoSuite(String val);
@JsProperty(name="keyParams")
com.user00.domjnate.api.Array<RTCSrtpKeyParam> getKeyParams();
@JsProperty(name="keyParams")
void setKeyParams(com.user00.domjnate.api.Array<RTCSrtpKeyParam> val);
@JsProperty(name="sessionParams")
com.user00.domjnate.api.Array<String> getSessionParams();
@JsProperty(name="sessionParams")
void setSessionParams(com.user00.domjnate.api.Array<String> val);
@JsProperty(name="tag")
Double getTag();
@JsProperty(name="tag")
void setTag(Double val);
}
