package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WEBGL_lose_context")
public interface WEBGL_lose_context
{
@JsMethod(name="loseContext")
void loseContext();
@JsMethod(name="restoreContext")
void restoreContext();
}
