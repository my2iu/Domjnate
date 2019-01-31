package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NumberFormatOptions")
public interface NumberFormatOptions
{
@JsProperty(name="localeMatcher")
String getLocaleMatcher();
@JsProperty(name="localeMatcher")
void setLocaleMatcher(String val);
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
@JsProperty(name="useGrouping")
Boolean getUseGrouping();
@JsProperty(name="useGrouping")
void setUseGrouping(Boolean val);
@JsProperty(name="minimumIntegerDigits")
Double getMinimumIntegerDigits();
@JsProperty(name="minimumIntegerDigits")
void setMinimumIntegerDigits(Double val);
@JsProperty(name="minimumFractionDigits")
Double getMinimumFractionDigits();
@JsProperty(name="minimumFractionDigits")
void setMinimumFractionDigits(Double val);
@JsProperty(name="maximumFractionDigits")
Double getMaximumFractionDigits();
@JsProperty(name="maximumFractionDigits")
void setMaximumFractionDigits(Double val);
@JsProperty(name="minimumSignificantDigits")
Double getMinimumSignificantDigits();
@JsProperty(name="minimumSignificantDigits")
void setMinimumSignificantDigits(Double val);
@JsProperty(name="maximumSignificantDigits")
Double getMaximumSignificantDigits();
@JsProperty(name="maximumSignificantDigits")
void setMaximumSignificantDigits(Double val);
}
