package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ElementCSSInlineStyle")
public interface ElementCSSInlineStyle
{
@JsProperty(name="style")
CSSStyleDeclaration getStyle();
}
