package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="CollatorOptions")
public interface CollatorOptions
{
@JsProperty(name="usage")
String getUsage();
@JsProperty(name="usage")
void setUsage(String val);
@JsProperty(name="localeMatcher")
String getLocaleMatcher();
@JsProperty(name="localeMatcher")
void setLocaleMatcher(String val);
@JsProperty(name="numeric")
Boolean getNumeric();
@JsProperty(name="numeric")
void setNumeric(Boolean val);
@JsProperty(name="caseFirst")
String getCaseFirst();
@JsProperty(name="caseFirst")
void setCaseFirst(String val);
@JsProperty(name="sensitivity")
String getSensitivity();
@JsProperty(name="sensitivity")
void setSensitivity(String val);
@JsProperty(name="ignorePunctuation")
Boolean getIgnorePunctuation();
@JsProperty(name="ignorePunctuation")
void setIgnorePunctuation(Boolean val);
}
