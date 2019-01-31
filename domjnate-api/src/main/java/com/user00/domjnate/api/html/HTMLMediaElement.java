package com.user00.domjnate.api.html;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="HTMLMediaElement")
public interface HTMLMediaElement extends HTMLElement
{
@JsProperty(name="audioTracks")
com.user00.domjnate.api.webaudio.AudioTrackList getAudioTracks();
@JsProperty(name="autoplay")
boolean getAutoplay();
@JsProperty(name="autoplay")
void setAutoplay(boolean val);
@JsProperty(name="buffered")
com.user00.domjnate.api.dom.TimeRanges getBuffered();
@JsProperty(name="controls")
boolean getControls();
@JsProperty(name="controls")
void setControls(boolean val);
@JsProperty(name="crossOrigin")
String getCrossOrigin();
@JsProperty(name="crossOrigin")
void setCrossOrigin(String val);
@JsProperty(name="currentSrc")
String getCurrentSrc();
@JsProperty(name="currentTime")
double getCurrentTime();
@JsProperty(name="currentTime")
void setCurrentTime(double val);
@JsProperty(name="defaultMuted")
boolean getDefaultMuted();
@JsProperty(name="defaultMuted")
void setDefaultMuted(boolean val);
@JsProperty(name="defaultPlaybackRate")
double getDefaultPlaybackRate();
@JsProperty(name="defaultPlaybackRate")
void setDefaultPlaybackRate(double val);
@JsProperty(name="duration")
double getDuration();
@JsProperty(name="ended")
boolean getEnded();
@JsProperty(name="error")
com.user00.domjnate.api.MediaError getError();
@JsProperty(name="loop")
boolean getLoop();
@JsProperty(name="loop")
void setLoop(boolean val);
@JsProperty(name="mediaKeys")
com.user00.domjnate.api.eme.MediaKeys getMediaKeys();
@JsProperty(name="msAudioCategory")
String getMsAudioCategory();
@JsProperty(name="msAudioCategory")
void setMsAudioCategory(String val);
@JsProperty(name="msAudioDeviceType")
String getMsAudioDeviceType();
@JsProperty(name="msAudioDeviceType")
void setMsAudioDeviceType(String val);
@JsProperty(name="msGraphicsTrustStatus")
com.user00.domjnate.api.MSGraphicsTrust getMsGraphicsTrustStatus();
@JsProperty(name="msKeys")
com.user00.domjnate.api.MSMediaKeys getMsKeys();
@JsProperty(name="msPlayToDisabled")
boolean getMsPlayToDisabled();
@JsProperty(name="msPlayToDisabled")
void setMsPlayToDisabled(boolean val);
@JsProperty(name="msPlayToPreferredSourceUri")
String getMsPlayToPreferredSourceUri();
@JsProperty(name="msPlayToPreferredSourceUri")
void setMsPlayToPreferredSourceUri(String val);
@JsProperty(name="msPlayToPrimary")
boolean getMsPlayToPrimary();
@JsProperty(name="msPlayToPrimary")
void setMsPlayToPrimary(boolean val);
@JsProperty(name="msPlayToSource")
java.lang.Object getMsPlayToSource();
@JsProperty(name="msRealTime")
boolean getMsRealTime();
@JsProperty(name="msRealTime")
void setMsRealTime(boolean val);
@JsProperty(name="muted")
boolean getMuted();
@JsProperty(name="muted")
void setMuted(boolean val);
@JsProperty(name="networkState")
double getNetworkState();
@JsProperty(name="onencrypted")
OnencryptedCallback getOnencrypted();
@JsProperty(name="onencrypted")
void setOnencrypted(OnencryptedCallback val);
@JsProperty(name="onmsneedkey")
OnmsneedkeyCallback getOnmsneedkey();
@JsProperty(name="onmsneedkey")
void setOnmsneedkey(OnmsneedkeyCallback val);
@JsProperty(name="paused")
boolean getPaused();
@JsProperty(name="playbackRate")
double getPlaybackRate();
@JsProperty(name="playbackRate")
void setPlaybackRate(double val);
@JsProperty(name="played")
com.user00.domjnate.api.dom.TimeRanges getPlayed();
@JsProperty(name="preload")
String getPreload();
@JsProperty(name="preload")
void setPreload(String val);
@JsProperty(name="readyState")
double getReadyState();
@JsProperty(name="seekable")
com.user00.domjnate.api.dom.TimeRanges getSeekable();
@JsProperty(name="seeking")
boolean getSeeking();
@JsProperty(name="src")
String getSrc();
@JsProperty(name="src")
void setSrc(String val);
@JsProperty(name="srcObject")
java.lang.Object getSrcObject();
@JsProperty(name="srcObject")
void setSrcObject(java.lang.Object val);
@JsProperty(name="textTracks")
com.user00.domjnate.api.webvtt.TextTrackList getTextTracks();
@JsProperty(name="videoTracks")
com.user00.domjnate.api.VideoTrackList getVideoTracks();
@JsProperty(name="volume")
double getVolume();
@JsProperty(name="volume")
void setVolume(double val);
@JsProperty(name="HAVE_CURRENT_DATA")
double HAVE_CURRENT_DATA();
@JsProperty(name="HAVE_ENOUGH_DATA")
double HAVE_ENOUGH_DATA();
@JsProperty(name="HAVE_FUTURE_DATA")
double HAVE_FUTURE_DATA();
@JsProperty(name="HAVE_METADATA")
double HAVE_METADATA();
@JsProperty(name="HAVE_NOTHING")
double HAVE_NOTHING();
@JsProperty(name="NETWORK_EMPTY")
double NETWORK_EMPTY();
@JsProperty(name="NETWORK_IDLE")
double NETWORK_IDLE();
@JsProperty(name="NETWORK_LOADING")
double NETWORK_LOADING();
@JsProperty(name="NETWORK_NO_SOURCE")
double NETWORK_NO_SOURCE();
@JsMethod(name="addTextTrack")
com.user00.domjnate.api.webvtt.TextTrack addTextTrack(String kind);
@JsMethod(name="addTextTrack")
com.user00.domjnate.api.webvtt.TextTrack addTextTrack(String kind, String label);
@JsMethod(name="addTextTrack")
com.user00.domjnate.api.webvtt.TextTrack addTextTrack(String kind, String label, String language);
@JsMethod(name="canPlayType")
String canPlayType(String type);
@JsMethod(name="load")
void load();
@JsMethod(name="msClearEffects")
void msClearEffects();
@JsMethod(name="msGetAsCastingSource")
java.lang.Object msGetAsCastingSource();
@JsMethod(name="msInsertAudioEffect")
void msInsertAudioEffect(String activatableClassId, boolean effectRequired);
@JsMethod(name="msInsertAudioEffect")
void msInsertAudioEffect(String activatableClassId, boolean effectRequired, java.lang.Object config);
@JsMethod(name="msSetMediaKeys")
void msSetMediaKeys(com.user00.domjnate.api.MSMediaKeys mediaKeys);
@JsMethod(name="msSetMediaProtectionManager")
void msSetMediaProtectionManager();
@JsMethod(name="msSetMediaProtectionManager")
void msSetMediaProtectionManager(java.lang.Object mediaProtectionManager);
@JsMethod(name="pause")
void pause();
@JsMethod(name="play")
com.user00.domjnate.api.Promise<Void> play();
@JsMethod(name="setMediaKeys")
com.user00.domjnate.api.Promise<Void> setMediaKeys(com.user00.domjnate.api.eme.MediaKeys mediaKeys);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, com.user00.domjnate.api.EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, com.user00.domjnate.api.EventListener listener, boolean options);
@JsFunction public static interface OnmsneedkeyCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnencryptedCallback
{
java.lang.Object apply(com.user00.domjnate.api.eme.MediaEncryptedEvent ev);
}
@JsOverlay
public static HTMLMediaElement getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", HTMLMediaElement.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, HTMLMediaElement val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static double HAVE_CURRENT_DATA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HAVE_CURRENT_DATA", double.class);
}
@JsOverlay
public static double HAVE_ENOUGH_DATA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HAVE_ENOUGH_DATA", double.class);
}
@JsOverlay
public static double HAVE_FUTURE_DATA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HAVE_FUTURE_DATA", double.class);
}
@JsOverlay
public static double HAVE_METADATA(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HAVE_METADATA", double.class);
}
@JsOverlay
public static double HAVE_NOTHING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "HAVE_NOTHING", double.class);
}
@JsOverlay
public static double NETWORK_EMPTY(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NETWORK_EMPTY", double.class);
}
@JsOverlay
public static double NETWORK_IDLE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NETWORK_IDLE", double.class);
}
@JsOverlay
public static double NETWORK_LOADING(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NETWORK_LOADING", double.class);
}
@JsOverlay
public static double NETWORK_NO_SOURCE(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "HTMLMediaElement", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "NETWORK_NO_SOURCE", double.class);
}
@JsOverlay
public static HTMLMediaElement _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "HTMLMediaElement");
  return com.user00.domjnate.util.Js.construct(_win, constructor, HTMLMediaElement.class);
}
}
