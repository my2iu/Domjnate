package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamEventMap")
public interface MediaStreamEventMap
{
@JsProperty(name="active")
com.user00.domjnate.api.dom.Event getActive();
@JsProperty(name="active")
void setActive(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="addtrack")
MediaStreamTrackEvent getAddtrack();
@JsProperty(name="addtrack")
void setAddtrack(MediaStreamTrackEvent val);
@JsProperty(name="inactive")
com.user00.domjnate.api.dom.Event getInactive();
@JsProperty(name="inactive")
void setInactive(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="removetrack")
MediaStreamTrackEvent getRemovetrack();
@JsProperty(name="removetrack")
void setRemovetrack(MediaStreamTrackEvent val);
}
