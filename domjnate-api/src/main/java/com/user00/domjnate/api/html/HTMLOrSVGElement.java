package com.user00.domjnate.api.html;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLOrSVGElement")
public interface HTMLOrSVGElement
{
@JsProperty(name="dataset")
com.user00.domjnate.api.DOMStringMap getDataset();
@JsProperty(name="nonce")
String getNonce();
@JsProperty(name="nonce")
void setNonce(String val);
@JsProperty(name="tabIndex")
double getTabIndex();
@JsProperty(name="tabIndex")
void setTabIndex(double val);
@JsMethod(name="blur")
void blur();
@JsMethod(name="focus")
void focus();
@JsMethod(name="focus")
void focus(com.user00.domjnate.api.FocusOptions options);
}
