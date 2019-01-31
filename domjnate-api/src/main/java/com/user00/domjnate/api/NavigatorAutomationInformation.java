package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorAutomationInformation")
public interface NavigatorAutomationInformation
{
@JsProperty(name="webdriver")
boolean getWebdriver();
}
