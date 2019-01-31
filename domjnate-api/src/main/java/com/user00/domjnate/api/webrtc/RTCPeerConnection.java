package com.user00.domjnate.api.webrtc;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="RTCPeerConnection")
public interface RTCPeerConnection extends com.user00.domjnate.api.dom.EventTarget
{
@JsProperty(name="canTrickleIceCandidates")
Boolean getCanTrickleIceCandidates();
@JsProperty(name="connectionState")
String getConnectionState();
@JsProperty(name="currentLocalDescription")
RTCSessionDescription getCurrentLocalDescription();
@JsProperty(name="currentRemoteDescription")
RTCSessionDescription getCurrentRemoteDescription();
@JsProperty(name="iceConnectionState")
String getIceConnectionState();
@JsProperty(name="iceGatheringState")
String getIceGatheringState();
@JsProperty(name="idpErrorInfo")
String getIdpErrorInfo();
@JsProperty(name="idpLoginUrl")
String getIdpLoginUrl();
@JsProperty(name="localDescription")
RTCSessionDescription getLocalDescription();
@JsProperty(name="onconnectionstatechange")
OnconnectionstatechangeCallback getOnconnectionstatechange();
@JsProperty(name="onconnectionstatechange")
void setOnconnectionstatechange(OnconnectionstatechangeCallback val);
@JsProperty(name="ondatachannel")
OndatachannelCallback getOndatachannel();
@JsProperty(name="ondatachannel")
void setOndatachannel(OndatachannelCallback val);
@JsProperty(name="onicecandidate")
OnicecandidateCallback getOnicecandidate();
@JsProperty(name="onicecandidate")
void setOnicecandidate(OnicecandidateCallback val);
@JsProperty(name="onicecandidateerror")
OnicecandidateerrorCallback getOnicecandidateerror();
@JsProperty(name="onicecandidateerror")
void setOnicecandidateerror(OnicecandidateerrorCallback val);
@JsProperty(name="oniceconnectionstatechange")
OniceconnectionstatechangeCallback getOniceconnectionstatechange();
@JsProperty(name="oniceconnectionstatechange")
void setOniceconnectionstatechange(OniceconnectionstatechangeCallback val);
@JsProperty(name="onicegatheringstatechange")
OnicegatheringstatechangeCallback getOnicegatheringstatechange();
@JsProperty(name="onicegatheringstatechange")
void setOnicegatheringstatechange(OnicegatheringstatechangeCallback val);
@JsProperty(name="onnegotiationneeded")
OnnegotiationneededCallback getOnnegotiationneeded();
@JsProperty(name="onnegotiationneeded")
void setOnnegotiationneeded(OnnegotiationneededCallback val);
@JsProperty(name="onsignalingstatechange")
OnsignalingstatechangeCallback getOnsignalingstatechange();
@JsProperty(name="onsignalingstatechange")
void setOnsignalingstatechange(OnsignalingstatechangeCallback val);
@JsProperty(name="onstatsended")
OnstatsendedCallback getOnstatsended();
@JsProperty(name="onstatsended")
void setOnstatsended(OnstatsendedCallback val);
@JsProperty(name="ontrack")
OntrackCallback getOntrack();
@JsProperty(name="ontrack")
void setOntrack(OntrackCallback val);
@JsProperty(name="peerIdentity")
com.user00.domjnate.api.Promise<RTCIdentityAssertion> getPeerIdentity();
@JsProperty(name="pendingLocalDescription")
RTCSessionDescription getPendingLocalDescription();
@JsProperty(name="pendingRemoteDescription")
RTCSessionDescription getPendingRemoteDescription();
@JsProperty(name="remoteDescription")
RTCSessionDescription getRemoteDescription();
@JsProperty(name="sctp")
RTCSctpTransport getSctp();
@JsProperty(name="signalingState")
String getSignalingState();
@JsMethod(name="addIceCandidate")
com.user00.domjnate.api.Promise<Void> addIceCandidate(RTCIceCandidate candidate);
@JsMethod(name="addIceCandidate")
com.user00.domjnate.api.Promise<Void> addIceCandidate(RTCIceCandidateInit candidate);
@JsMethod(name="addTrack")
RTCRtpSender addTrack(com.user00.domjnate.api.mediastream.MediaStreamTrack track, com.user00.domjnate.api.mediastream.MediaStream... streams);
@JsMethod(name="addTransceiver")
RTCRtpTransceiver addTransceiver(String trackOrKind);
@JsMethod(name="addTransceiver")
RTCRtpTransceiver addTransceiver(com.user00.domjnate.api.mediastream.MediaStreamTrack trackOrKind);
@JsMethod(name="addTransceiver")
RTCRtpTransceiver addTransceiver(String trackOrKind, RTCRtpTransceiverInit init);
@JsMethod(name="addTransceiver")
RTCRtpTransceiver addTransceiver(com.user00.domjnate.api.mediastream.MediaStreamTrack trackOrKind, RTCRtpTransceiverInit init);
@JsMethod(name="close")
void close();
@JsMethod(name="createAnswer")
com.user00.domjnate.api.Promise<RTCSessionDescriptionInit> createAnswer();
@JsMethod(name="createAnswer")
com.user00.domjnate.api.Promise<RTCSessionDescriptionInit> createAnswer(RTCOfferOptions options);
@JsMethod(name="createDataChannel")
RTCDataChannel createDataChannel(String label);
@JsMethod(name="createDataChannel")
RTCDataChannel createDataChannel(String label, RTCDataChannelInit dataChannelDict);
@JsMethod(name="createOffer")
com.user00.domjnate.api.Promise<RTCSessionDescriptionInit> createOffer();
@JsMethod(name="createOffer")
com.user00.domjnate.api.Promise<RTCSessionDescriptionInit> createOffer(RTCOfferOptions options);
@JsMethod(name="getConfiguration")
RTCConfiguration getConfiguration();
@JsMethod(name="getIdentityAssertion")
com.user00.domjnate.api.Promise<String> getIdentityAssertion();
@JsMethod(name="getReceivers")
com.user00.domjnate.api.Array<RTCRtpReceiver> getReceivers();
@JsMethod(name="getSenders")
com.user00.domjnate.api.Array<RTCRtpSender> getSenders();
@JsMethod(name="getStats")
com.user00.domjnate.api.Promise<RTCStatsReport> getStats();
@JsMethod(name="getStats")
com.user00.domjnate.api.Promise<RTCStatsReport> getStats(com.user00.domjnate.api.mediastream.MediaStreamTrack selector);
@JsMethod(name="getTransceivers")
com.user00.domjnate.api.Array<RTCRtpTransceiver> getTransceivers();
@JsMethod(name="removeTrack")
void removeTrack(RTCRtpSender sender);
@JsMethod(name="setConfiguration")
void setConfiguration(RTCConfiguration configuration);
@JsMethod(name="setIdentityProvider")
void setIdentityProvider(String provider);
@JsMethod(name="setIdentityProvider")
void setIdentityProvider(String provider, RTCIdentityProviderOptions options);
@JsMethod(name="setLocalDescription")
com.user00.domjnate.api.Promise<Void> setLocalDescription(RTCSessionDescriptionInit description);
@JsMethod(name="setRemoteDescription")
com.user00.domjnate.api.Promise<Void> setRemoteDescription(RTCSessionDescriptionInit description);
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
@JsFunction public static interface OnsignalingstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnicecandidateerrorCallback
{
java.lang.Object apply(RTCPeerConnectionIceErrorEvent ev);
}
@JsFunction public static interface OnicecandidateCallback
{
java.lang.Object apply(RTCPeerConnectionIceEvent ev);
}
@JsFunction public static interface OniceconnectionstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnconnectionstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnnegotiationneededCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnstatsendedCallback
{
java.lang.Object apply(RTCStatsEvent ev);
}
@JsFunction public static interface OndatachannelCallback
{
java.lang.Object apply(RTCDataChannelEvent ev);
}
@JsFunction public static interface OntrackCallback
{
java.lang.Object apply(RTCTrackEvent ev);
}
@JsFunction public static interface OnicegatheringstatechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static RTCPeerConnection getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCPeerConnection", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", RTCPeerConnection.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCPeerConnection val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "RTCPeerConnection", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static com.user00.domjnate.api.Promise<RTCCertificate> generateCertificate(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, com.user00.domjnate.api.webcrypto.Algorithm keygenAlgorithm) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "RTCPeerConnection", "generateCertificate", com.user00.domjnate.api.Promise.class, keygenAlgorithm);
}
@JsOverlay
public static com.user00.domjnate.api.Promise<RTCCertificate> generateCertificate(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String keygenAlgorithm) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "RTCPeerConnection", "generateCertificate", com.user00.domjnate.api.Promise.class, keygenAlgorithm);
}
@JsOverlay
public static com.user00.domjnate.api.Array<RTCIceServer> getDefaultIceServers(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "RTCPeerConnection", "getDefaultIceServers", com.user00.domjnate.api.Array.class);
}
@JsOverlay
public static RTCPeerConnection _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCPeerConnection");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCPeerConnection.class);
}
@JsOverlay
public static RTCPeerConnection _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, RTCConfiguration configuration) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "RTCPeerConnection");
  return com.user00.domjnate.util.Js.construct(_win, constructor, RTCPeerConnection.class, configuration);
}
}
