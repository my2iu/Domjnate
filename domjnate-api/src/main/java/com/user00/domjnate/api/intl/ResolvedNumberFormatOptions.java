package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ResolvedNumberFormatOptions")
public interface ResolvedNumberFormatOptions
{
@JsProperty(name="locale")
String getLocale();
@JsProperty(name="locale")
void setLocale(String val);
@JsProperty(name="numberingSystem")
String getNumberingSystem();
@JsProperty(name="numberingSystem")
void setNumberingSystem(String val);
@JsProperty(name="style")
String getStyle();
@JsProperty(name="style")
void setStyle(String val);
@JsProperty(name="currency")
String getCurrency();
@JsProperty(name="currency")
void setCurrency(String val);
@JsProperty(name="currencyDisplay")
String getCurrencyDisplay();
@JsProperty(name="currencyDisplay")
void setCurrencyDisplay(String val);
@JsProperty(name="minimumIntegerDigits")
double getMinimumIntegerDigits();
@JsProperty(name="minimumIntegerDigits")
void setMinimumIntegerDigits(double val);
@JsProperty(name="minimumFractionDigits")
double getMinimumFractionDigits();
@JsProperty(name="minimumFractionDigits")
void setMinimumFractionDigits(double val);
@JsProperty(name="maximumFractionDigits")
double getMaximumFractionDigits();
@JsProperty(name="maximumFractionDigits")
void setMaximumFractionDigits(double val);
@JsProperty(name="minimumSignificantDigits")
Double getMinimumSignificantDigits();
@JsProperty(name="minimumSignificantDigits")
void setMinimumSignificantDigits(Double val);
@JsProperty(name="maximumSignificantDigits")
Double getMaximumSignificantDigits();
@JsProperty(name="maximumSignificantDigits")
void setMaximumSignificantDigits(Double val);
@JsProperty(name="useGrouping")
boolean getUseGrouping();
@JsProperty(name="useGrouping")
void setUseGrouping(boolean val);
}
