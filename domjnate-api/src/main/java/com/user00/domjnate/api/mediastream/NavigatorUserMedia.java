package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="NavigatorUserMedia")
public interface NavigatorUserMedia
{
@JsProperty(name="mediaDevices")
MediaDevices getMediaDevices();
@JsMethod(name="getDisplayMedia")
com.user00.domjnate.api.Promise<MediaStream> getDisplayMedia(MediaStreamConstraints constraints);
@JsMethod(name="getUserMedia")
void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
}
