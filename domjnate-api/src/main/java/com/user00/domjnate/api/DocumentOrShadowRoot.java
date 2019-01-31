package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentOrShadowRoot")
public interface DocumentOrShadowRoot
{
@JsProperty(name="activeElement")
com.user00.domjnate.api.dom.Element getActiveElement();
@JsProperty(name="styleSheets")
StyleSheetList getStyleSheets();
@JsMethod(name="caretPositionFromPoint")
CaretPosition caretPositionFromPoint(double x, double y);
@JsMethod(name="caretRangeFromPoint")
com.user00.domjnate.api.dom.Range caretRangeFromPoint(double x, double y);
@JsMethod(name="elementFromPoint")
com.user00.domjnate.api.dom.Element elementFromPoint(double x, double y);
@JsMethod(name="elementsFromPoint")
Array<com.user00.domjnate.api.dom.Element> elementsFromPoint(double x, double y);
@JsMethod(name="getSelection")
Selection getSelection();
}
