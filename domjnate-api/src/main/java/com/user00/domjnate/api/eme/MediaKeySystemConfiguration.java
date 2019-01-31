package com.user00.domjnate.api.eme;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaKeySystemConfiguration")
public interface MediaKeySystemConfiguration
{
@JsProperty(name="audioCapabilities")
com.user00.domjnate.api.Array<MediaKeySystemMediaCapability> getAudioCapabilities();
@JsProperty(name="audioCapabilities")
void setAudioCapabilities(com.user00.domjnate.api.Array<MediaKeySystemMediaCapability> val);
@JsProperty(name="distinctiveIdentifier")
String getDistinctiveIdentifier();
@JsProperty(name="distinctiveIdentifier")
void setDistinctiveIdentifier(String val);
@JsProperty(name="initDataTypes")
com.user00.domjnate.api.Array<String> getInitDataTypes();
@JsProperty(name="initDataTypes")
void setInitDataTypes(com.user00.domjnate.api.Array<String> val);
@JsProperty(name="persistentState")
String getPersistentState();
@JsProperty(name="persistentState")
void setPersistentState(String val);
@JsProperty(name="videoCapabilities")
com.user00.domjnate.api.Array<MediaKeySystemMediaCapability> getVideoCapabilities();
@JsProperty(name="videoCapabilities")
void setVideoCapabilities(com.user00.domjnate.api.Array<MediaKeySystemMediaCapability> val);
}
