package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ResolvedCollatorOptions")
public interface ResolvedCollatorOptions
{
@JsProperty(name="locale")
String getLocale();
@JsProperty(name="locale")
void setLocale(String val);
@JsProperty(name="usage")
String getUsage();
@JsProperty(name="usage")
void setUsage(String val);
@JsProperty(name="sensitivity")
String getSensitivity();
@JsProperty(name="sensitivity")
void setSensitivity(String val);
@JsProperty(name="ignorePunctuation")
boolean getIgnorePunctuation();
@JsProperty(name="ignorePunctuation")
void setIgnorePunctuation(boolean val);
@JsProperty(name="collation")
String getCollation();
@JsProperty(name="collation")
void setCollation(String val);
@JsProperty(name="caseFirst")
String getCaseFirst();
@JsProperty(name="caseFirst")
void setCaseFirst(String val);
@JsProperty(name="numeric")
boolean getNumeric();
@JsProperty(name="numeric")
void setNumeric(boolean val);
}
