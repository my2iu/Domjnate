package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Navigator")
public interface Navigator extends NavigatorID, NavigatorOnLine, NavigatorContentUtils, NavigatorStorageUtils, MSNavigatorDoNotTrack, MSFileSaver, NavigatorBeacon, NavigatorConcurrentHardware, com.user00.domjnate.api.mediastream.NavigatorUserMedia, NavigatorLanguage, NavigatorStorage, NavigatorAutomationInformation
{
@JsProperty(name="activeVRDisplays")
ReadonlyArray<VRDisplay> getActiveVRDisplays();
@JsProperty(name="authentication")
WebAuthentication getAuthentication();
@JsProperty(name="cookieEnabled")
boolean getCookieEnabled();
@JsProperty(name="doNotTrack")
String getDoNotTrack();
@JsProperty(name="gamepadInputEmulation")
String getGamepadInputEmulation();
@JsProperty(name="gamepadInputEmulation")
void setGamepadInputEmulation(String val);
@JsProperty(name="geolocation")
Geolocation getGeolocation();
@JsProperty(name="maxTouchPoints")
double getMaxTouchPoints();
@JsProperty(name="mimeTypes")
MimeTypeArray getMimeTypes();
@JsProperty(name="msManipulationViewsEnabled")
boolean getMsManipulationViewsEnabled();
@JsProperty(name="msMaxTouchPoints")
double getMsMaxTouchPoints();
@JsProperty(name="msPointerEnabled")
boolean getMsPointerEnabled();
@JsProperty(name="plugins")
PluginArray getPlugins();
@JsProperty(name="pointerEnabled")
boolean getPointerEnabled();
@JsProperty(name="serviceWorker")
ServiceWorkerContainer getServiceWorker();
@JsProperty(name="webdriver")
boolean getWebdriver();
@JsMethod(name="getGamepads")
Array<Gamepad> getGamepads();
@JsMethod(name="getVRDisplays")
Promise<Array<VRDisplay>> getVRDisplays();
@JsMethod(name="javaEnabled")
boolean javaEnabled();
@JsMethod(name="msLaunchUri")
void msLaunchUri(String uri);
@JsMethod(name="msLaunchUri")
void msLaunchUri(String uri, MSLaunchUriCallback successCallback);
@JsMethod(name="msLaunchUri")
void msLaunchUri(String uri, MSLaunchUriCallback successCallback, MSLaunchUriCallback noHandlerCallback);
@JsMethod(name="requestMediaKeySystemAccess")
Promise<com.user00.domjnate.api.eme.MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, Array<com.user00.domjnate.api.eme.MediaKeySystemConfiguration> supportedConfigurations);
@JsMethod(name="vibrate")
boolean vibrate(Array<Double> pattern);
@JsMethod(name="vibrate")
boolean vibrate(double pattern);
@JsOverlay
public static Navigator getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Navigator", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Navigator.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Navigator val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Navigator", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Navigator _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Navigator");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Navigator.class);
}
}
