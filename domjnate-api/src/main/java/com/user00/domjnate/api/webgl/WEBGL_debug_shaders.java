package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WEBGL_debug_shaders")
public interface WEBGL_debug_shaders
{
@JsMethod(name="getTranslatedShaderSource")
String getTranslatedShaderSource(WebGLShader shader);
}
