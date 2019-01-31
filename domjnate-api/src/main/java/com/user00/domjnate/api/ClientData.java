package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ClientData")
public interface ClientData
{
@JsProperty(name="challenge")
String getChallenge();
@JsProperty(name="challenge")
void setChallenge(String val);
@JsProperty(name="extensions")
WebAuthnExtensions getExtensions();
@JsProperty(name="extensions")
void setExtensions(WebAuthnExtensions val);
@JsProperty(name="hashAlg")
java.lang.Object getHashAlg();
@JsProperty(name="hashAlg")
void setHashAlg(java.lang.Object val);
@JsProperty(name="origin")
String getOrigin();
@JsProperty(name="origin")
void setOrigin(String val);
@JsProperty(name="rpId")
String getRpId();
@JsProperty(name="rpId")
void setRpId(String val);
@JsProperty(name="tokenBinding")
String getTokenBinding();
@JsProperty(name="tokenBinding")
void setTokenBinding(String val);
}
