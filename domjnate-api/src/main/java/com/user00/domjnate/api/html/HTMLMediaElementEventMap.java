package com.user00.domjnate.api.html;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLMediaElementEventMap")
public interface HTMLMediaElementEventMap extends HTMLElementEventMap
{
@JsProperty(name="encrypted")
com.user00.domjnate.api.eme.MediaEncryptedEvent getEncrypted();
@JsProperty(name="encrypted")
void setEncrypted(com.user00.domjnate.api.eme.MediaEncryptedEvent val);
@JsProperty(name="msneedkey")
com.user00.domjnate.api.dom.Event getMsneedkey();
@JsProperty(name="msneedkey")
void setMsneedkey(com.user00.domjnate.api.dom.Event val);
}
