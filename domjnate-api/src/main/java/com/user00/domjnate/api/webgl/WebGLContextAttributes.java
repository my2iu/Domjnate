package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLContextAttributes")
public interface WebGLContextAttributes
{
@JsProperty(name="alpha")
Boolean getAlpha();
@JsProperty(name="alpha")
void setAlpha(Boolean val);
@JsProperty(name="antialias")
Boolean getAntialias();
@JsProperty(name="antialias")
void setAntialias(Boolean val);
@JsProperty(name="depth")
Boolean getDepth();
@JsProperty(name="depth")
void setDepth(Boolean val);
@JsProperty(name="failIfMajorPerformanceCaveat")
Boolean getFailIfMajorPerformanceCaveat();
@JsProperty(name="failIfMajorPerformanceCaveat")
void setFailIfMajorPerformanceCaveat(Boolean val);
@JsProperty(name="powerPreference")
String getPowerPreference();
@JsProperty(name="powerPreference")
void setPowerPreference(String val);
@JsProperty(name="premultipliedAlpha")
Boolean getPremultipliedAlpha();
@JsProperty(name="premultipliedAlpha")
void setPremultipliedAlpha(Boolean val);
@JsProperty(name="preserveDrawingBuffer")
Boolean getPreserveDrawingBuffer();
@JsProperty(name="preserveDrawingBuffer")
void setPreserveDrawingBuffer(Boolean val);
@JsProperty(name="stencil")
Boolean getStencil();
@JsProperty(name="stencil")
void setStencil(Boolean val);
}
