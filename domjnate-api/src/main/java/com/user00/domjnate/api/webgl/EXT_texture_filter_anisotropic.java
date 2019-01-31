package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="EXT_texture_filter_anisotropic")
public interface EXT_texture_filter_anisotropic
{
@JsProperty(name="MAX_TEXTURE_MAX_ANISOTROPY_EXT")
double MAX_TEXTURE_MAX_ANISOTROPY_EXT();
@JsProperty(name="TEXTURE_MAX_ANISOTROPY_EXT")
double TEXTURE_MAX_ANISOTROPY_EXT();
}
