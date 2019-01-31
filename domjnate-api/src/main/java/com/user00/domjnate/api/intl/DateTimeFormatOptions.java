package com.user00.domjnate.api.intl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DateTimeFormatOptions")
public interface DateTimeFormatOptions
{
@JsProperty(name="localeMatcher")
String getLocaleMatcher();
@JsProperty(name="localeMatcher")
void setLocaleMatcher(String val);
@JsProperty(name="weekday")
String getWeekday();
@JsProperty(name="weekday")
void setWeekday(String val);
@JsProperty(name="era")
String getEra();
@JsProperty(name="era")
void setEra(String val);
@JsProperty(name="year")
String getYear();
@JsProperty(name="year")
void setYear(String val);
@JsProperty(name="month")
String getMonth();
@JsProperty(name="month")
void setMonth(String val);
@JsProperty(name="day")
String getDay();
@JsProperty(name="day")
void setDay(String val);
@JsProperty(name="hour")
String getHour();
@JsProperty(name="hour")
void setHour(String val);
@JsProperty(name="minute")
String getMinute();
@JsProperty(name="minute")
void setMinute(String val);
@JsProperty(name="second")
String getSecond();
@JsProperty(name="second")
void setSecond(String val);
@JsProperty(name="timeZoneName")
String getTimeZoneName();
@JsProperty(name="timeZoneName")
void setTimeZoneName(String val);
@JsProperty(name="formatMatcher")
String getFormatMatcher();
@JsProperty(name="formatMatcher")
void setFormatMatcher(String val);
@JsProperty(name="hour12")
Boolean getHour12();
@JsProperty(name="hour12")
void setHour12(Boolean val);
@JsProperty(name="timeZone")
String getTimeZone();
@JsProperty(name="timeZone")
void setTimeZone(String val);
}
