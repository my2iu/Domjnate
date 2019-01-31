package com.user00.domjnate.api.svg;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SVGSVGElementEventMap")
public interface SVGSVGElementEventMap extends SVGElementEventMap
{
@JsProperty(name="SVGUnload")
com.user00.domjnate.api.dom.Event getSVGUnload();
@JsProperty(name="SVGUnload")
void setSVGUnload(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="SVGZoom")
SVGZoomEvent getSVGZoom();
@JsProperty(name="SVGZoom")
void setSVGZoom(SVGZoomEvent val);
}
