package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSInputMethodContextEventMap")
public interface MSInputMethodContextEventMap
{
@JsProperty(name="MSCandidateWindowHide")
com.user00.domjnate.api.dom.Event getMSCandidateWindowHide();
@JsProperty(name="MSCandidateWindowHide")
void setMSCandidateWindowHide(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSCandidateWindowShow")
com.user00.domjnate.api.dom.Event getMSCandidateWindowShow();
@JsProperty(name="MSCandidateWindowShow")
void setMSCandidateWindowShow(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSCandidateWindowUpdate")
com.user00.domjnate.api.dom.Event getMSCandidateWindowUpdate();
@JsProperty(name="MSCandidateWindowUpdate")
void setMSCandidateWindowUpdate(com.user00.domjnate.api.dom.Event val);
}
