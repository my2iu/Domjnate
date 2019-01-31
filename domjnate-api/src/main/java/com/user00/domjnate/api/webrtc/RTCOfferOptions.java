package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCOfferOptions")
public interface RTCOfferOptions extends RTCOfferAnswerOptions
{
@JsProperty(name="iceRestart")
Boolean getIceRestart();
@JsProperty(name="iceRestart")
void setIceRestart(Boolean val);
@JsProperty(name="offerToReceiveAudio")
Boolean getOfferToReceiveAudio();
@JsProperty(name="offerToReceiveAudio")
void setOfferToReceiveAudio(Boolean val);
@JsProperty(name="offerToReceiveVideo")
Boolean getOfferToReceiveVideo();
@JsProperty(name="offerToReceiveVideo")
void setOfferToReceiveVideo(Boolean val);
}
