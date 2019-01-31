package com.user00.domjnate.api.mediastream;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MediaStreamConstraints")
public interface MediaStreamConstraints
{
@JsProperty(name="audio")
java.lang.Object getAudio();
@JsProperty(name="audio")
void setAudio(java.lang.Object val);
@JsProperty(name="peerIdentity")
String getPeerIdentity();
@JsProperty(name="peerIdentity")
void setPeerIdentity(String val);
@JsProperty(name="video")
java.lang.Object getVideo();
@JsProperty(name="video")
void setVideo(java.lang.Object val);
}
