package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="VRLayer")
public interface VRLayer
{
@JsProperty(name="leftBounds")
java.lang.Object getLeftBounds();
@JsProperty(name="leftBounds")
void setLeftBounds(java.lang.Object val);
@JsProperty(name="rightBounds")
java.lang.Object getRightBounds();
@JsProperty(name="rightBounds")
void setRightBounds(java.lang.Object val);
@JsProperty(name="source")
com.user00.domjnate.api.html.HTMLCanvasElement getSource();
@JsProperty(name="source")
void setSource(com.user00.domjnate.api.html.HTMLCanvasElement val);
}
