package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ApplicationCacheEventMap")
public interface ApplicationCacheEventMap
{
@JsProperty(name="cached")
com.user00.domjnate.api.dom.Event getCached();
@JsProperty(name="cached")
void setCached(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="checking")
com.user00.domjnate.api.dom.Event getChecking();
@JsProperty(name="checking")
void setChecking(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="downloading")
com.user00.domjnate.api.dom.Event getDownloading();
@JsProperty(name="downloading")
void setDownloading(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
com.user00.domjnate.api.dom.Event getError();
@JsProperty(name="error")
void setError(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="noupdate")
com.user00.domjnate.api.dom.Event getNoupdate();
@JsProperty(name="noupdate")
void setNoupdate(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="obsolete")
com.user00.domjnate.api.dom.Event getObsolete();
@JsProperty(name="obsolete")
void setObsolete(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="progress")
ProgressEvent getProgress();
@JsProperty(name="progress")
void setProgress(ProgressEvent val);
@JsProperty(name="updateready")
com.user00.domjnate.api.dom.Event getUpdateready();
@JsProperty(name="updateready")
void setUpdateready(com.user00.domjnate.api.dom.Event val);
}
