package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSFileSaver")
public interface MSFileSaver
{
@JsMethod(name="msSaveBlob")
boolean msSaveBlob(java.lang.Object blob);
@JsMethod(name="msSaveBlob")
boolean msSaveBlob(java.lang.Object blob, String defaultName);
@JsMethod(name="msSaveOrOpenBlob")
boolean msSaveOrOpenBlob(java.lang.Object blob);
@JsMethod(name="msSaveOrOpenBlob")
boolean msSaveOrOpenBlob(java.lang.Object blob, String defaultName);
}
