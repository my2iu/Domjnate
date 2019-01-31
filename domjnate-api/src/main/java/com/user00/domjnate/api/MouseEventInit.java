package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MouseEventInit")
public interface MouseEventInit extends EventModifierInit
{
@JsProperty(name="button")
Double getButton();
@JsProperty(name="button")
void setButton(Double val);
@JsProperty(name="buttons")
Double getButtons();
@JsProperty(name="buttons")
void setButtons(Double val);
@JsProperty(name="clientX")
Double getClientX();
@JsProperty(name="clientX")
void setClientX(Double val);
@JsProperty(name="clientY")
Double getClientY();
@JsProperty(name="clientY")
void setClientY(Double val);
@JsProperty(name="relatedTarget")
com.user00.domjnate.api.dom.EventTarget getRelatedTarget();
@JsProperty(name="relatedTarget")
void setRelatedTarget(com.user00.domjnate.api.dom.EventTarget val);
@JsProperty(name="screenX")
Double getScreenX();
@JsProperty(name="screenX")
void setScreenX(Double val);
@JsProperty(name="screenY")
Double getScreenY();
@JsProperty(name="screenY")
void setScreenY(Double val);
}
