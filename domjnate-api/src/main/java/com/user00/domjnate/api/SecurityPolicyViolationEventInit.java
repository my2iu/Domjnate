package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SecurityPolicyViolationEventInit")
public interface SecurityPolicyViolationEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="blockedURI")
String getBlockedURI();
@JsProperty(name="blockedURI")
void setBlockedURI(String val);
@JsProperty(name="columnNumber")
Double getColumnNumber();
@JsProperty(name="columnNumber")
void setColumnNumber(Double val);
@JsProperty(name="documentURI")
String getDocumentURI();
@JsProperty(name="documentURI")
void setDocumentURI(String val);
@JsProperty(name="effectiveDirective")
String getEffectiveDirective();
@JsProperty(name="effectiveDirective")
void setEffectiveDirective(String val);
@JsProperty(name="lineNumber")
Double getLineNumber();
@JsProperty(name="lineNumber")
void setLineNumber(Double val);
@JsProperty(name="originalPolicy")
String getOriginalPolicy();
@JsProperty(name="originalPolicy")
void setOriginalPolicy(String val);
@JsProperty(name="referrer")
String getReferrer();
@JsProperty(name="referrer")
void setReferrer(String val);
@JsProperty(name="sourceFile")
String getSourceFile();
@JsProperty(name="sourceFile")
void setSourceFile(String val);
@JsProperty(name="statusCode")
Double getStatusCode();
@JsProperty(name="statusCode")
void setStatusCode(Double val);
@JsProperty(name="violatedDirective")
String getViolatedDirective();
@JsProperty(name="violatedDirective")
void setViolatedDirective(String val);
}
