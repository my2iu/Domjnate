package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WEBGL_debug_renderer_info")
public interface WEBGL_debug_renderer_info
{
@JsProperty(name="UNMASKED_RENDERER_WEBGL")
double UNMASKED_RENDERER_WEBGL();
@JsProperty(name="UNMASKED_VENDOR_WEBGL")
double UNMASKED_VENDOR_WEBGL();
}
