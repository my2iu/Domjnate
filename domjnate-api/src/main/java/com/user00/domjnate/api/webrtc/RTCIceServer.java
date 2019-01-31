package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCIceServer")
public interface RTCIceServer
{
@JsProperty(name="credential")
java.lang.Object getCredential();
@JsProperty(name="credential")
void setCredential(java.lang.Object val);
@JsProperty(name="credentialType")
String getCredentialType();
@JsProperty(name="credentialType")
void setCredentialType(String val);
@JsProperty(name="urls")
java.lang.Object getUrls();
@JsProperty(name="urls")
void setUrls(java.lang.Object val);
@JsProperty(name="username")
String getUsername();
@JsProperty(name="username")
void setUsername(String val);
}
