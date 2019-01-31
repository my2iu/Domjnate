package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DocumentAndElementEventHandlersEventMap")
public interface DocumentAndElementEventHandlersEventMap
{
@JsProperty(name="copy")
ClipboardEvent getCopy();
@JsProperty(name="copy")
void setCopy(ClipboardEvent val);
@JsProperty(name="cut")
ClipboardEvent getCut();
@JsProperty(name="cut")
void setCut(ClipboardEvent val);
@JsProperty(name="paste")
ClipboardEvent getPaste();
@JsProperty(name="paste")
void setPaste(ClipboardEvent val);
}
