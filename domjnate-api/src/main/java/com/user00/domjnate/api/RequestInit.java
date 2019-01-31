package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RequestInit")
public interface RequestInit
{
@JsProperty(name="body")
java.lang.Object getBody();
@JsProperty(name="body")
void setBody(java.lang.Object val);
@JsProperty(name="cache")
String getCache();
@JsProperty(name="cache")
void setCache(String val);
@JsProperty(name="credentials")
String getCredentials();
@JsProperty(name="credentials")
void setCredentials(String val);
@JsProperty(name="headers")
java.lang.Object getHeaders();
@JsProperty(name="headers")
void setHeaders(java.lang.Object val);
@JsProperty(name="integrity")
String getIntegrity();
@JsProperty(name="integrity")
void setIntegrity(String val);
@JsProperty(name="keepalive")
Boolean getKeepalive();
@JsProperty(name="keepalive")
void setKeepalive(Boolean val);
@JsProperty(name="method")
String getMethod();
@JsProperty(name="method")
void setMethod(String val);
@JsProperty(name="mode")
String getMode();
@JsProperty(name="mode")
void setMode(String val);
@JsProperty(name="redirect")
String getRedirect();
@JsProperty(name="redirect")
void setRedirect(String val);
@JsProperty(name="referrer")
String getReferrer();
@JsProperty(name="referrer")
void setReferrer(String val);
@JsProperty(name="referrerPolicy")
String getReferrerPolicy();
@JsProperty(name="referrerPolicy")
void setReferrerPolicy(String val);
@JsProperty(name="signal")
AbortSignal getSignal();
@JsProperty(name="signal")
void setSignal(AbortSignal val);
@JsProperty(name="window")
java.lang.Object getWindow();
@JsProperty(name="window")
void setWindow(java.lang.Object val);
}
