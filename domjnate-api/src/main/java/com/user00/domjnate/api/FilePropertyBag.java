package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="FilePropertyBag")
public interface FilePropertyBag extends BlobPropertyBag
{
@JsProperty(name="lastModified")
Double getLastModified();
@JsProperty(name="lastModified")
void setLastModified(Double val);
}
