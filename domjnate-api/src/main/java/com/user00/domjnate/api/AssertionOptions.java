package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="AssertionOptions")
public interface AssertionOptions
{
@JsProperty(name="allowList")
Array<ScopedCredentialDescriptor> getAllowList();
@JsProperty(name="allowList")
void setAllowList(Array<ScopedCredentialDescriptor> val);
@JsProperty(name="extensions")
WebAuthnExtensions getExtensions();
@JsProperty(name="extensions")
void setExtensions(WebAuthnExtensions val);
@JsProperty(name="rpId")
String getRpId();
@JsProperty(name="rpId")
void setRpId(String val);
@JsProperty(name="timeoutSeconds")
Double getTimeoutSeconds();
@JsProperty(name="timeoutSeconds")
void setTimeoutSeconds(Double val);
}
