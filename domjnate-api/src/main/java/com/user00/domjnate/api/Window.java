package com.user00.domjnate.api;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="Window")
public interface Window extends com.user00.domjnate.api.dom.EventTarget, WindowTimers, WindowSessionStorage, WindowLocalStorage, WindowConsole, GlobalEventHandlers, com.user00.domjnate.api.indexeddb.IDBEnvironment, WindowBase64, GlobalFetch, WindowOrWorkerGlobalScope, WindowEventHandlers
{
// TODO: Suppressing property with type query type Blob
// TODO: Suppressing property with type query type URL
// TODO: Suppressing property with type query type URLSearchParams
@JsProperty(name="applicationCache")
ApplicationCache getApplicationCache();
@JsProperty(name="caches")
CacheStorage getCaches();
@JsProperty(name="clientInformation")
Navigator getClientInformation();
@JsProperty(name="closed")
boolean getClosed();
@JsProperty(name="crypto")
com.user00.domjnate.api.webcrypto.Crypto getCrypto();
@JsProperty(name="customElements")
CustomElementRegistry getCustomElements();
@JsProperty(name="customElements")
void setCustomElements(CustomElementRegistry val);
@JsProperty(name="defaultStatus")
String getDefaultStatus();
@JsProperty(name="defaultStatus")
void setDefaultStatus(String val);
@JsProperty(name="devicePixelRatio")
double getDevicePixelRatio();
@JsProperty(name="doNotTrack")
String getDoNotTrack();
@JsProperty(name="document")
com.user00.domjnate.api.dom.Document getDocument();
@JsProperty(name="event")
java.lang.Object getEvent();
@JsProperty(name="external")
External getExternal();
@JsProperty(name="frameElement")
com.user00.domjnate.api.dom.Element getFrameElement();
@JsProperty(name="frames")
Window getFrames();
@JsProperty(name="history")
History getHistory();
@JsProperty(name="innerHeight")
double getInnerHeight();
@JsProperty(name="innerWidth")
double getInnerWidth();
@JsProperty(name="isSecureContext")
boolean getIsSecureContext();
@JsProperty(name="length")
double getLength();
@JsProperty(name="location")
Location getLocation();
@JsProperty(name="location")
void setLocation(Location val);
@JsProperty(name="locationbar")
BarProp getLocationbar();
@JsProperty(name="menubar")
BarProp getMenubar();
@JsProperty(name="msContentScript")
ExtensionScriptApis getMsContentScript();
@JsProperty(name="name")
String getName();
@JsProperty(name="name")
void setName(String val);
@JsProperty(name="navigator")
Navigator getNavigator();
@JsProperty(name="offscreenBuffering")
java.lang.Object getOffscreenBuffering();
@JsProperty(name="offscreenBuffering")
void setOffscreenBuffering(java.lang.Object val);
@JsProperty(name="oncompassneedscalibration")
OncompassneedscalibrationCallback getOncompassneedscalibration();
@JsProperty(name="oncompassneedscalibration")
void setOncompassneedscalibration(OncompassneedscalibrationCallback val);
@JsProperty(name="ondevicelight")
OndevicelightCallback getOndevicelight();
@JsProperty(name="ondevicelight")
void setOndevicelight(OndevicelightCallback val);
@JsProperty(name="ondevicemotion")
OndevicemotionCallback getOndevicemotion();
@JsProperty(name="ondevicemotion")
void setOndevicemotion(OndevicemotionCallback val);
@JsProperty(name="ondeviceorientation")
OndeviceorientationCallback getOndeviceorientation();
@JsProperty(name="ondeviceorientation")
void setOndeviceorientation(OndeviceorientationCallback val);
@JsProperty(name="onmousewheel")
OnmousewheelCallback getOnmousewheel();
@JsProperty(name="onmousewheel")
void setOnmousewheel(OnmousewheelCallback val);
@JsProperty(name="onmsgesturechange")
OnmsgesturechangeCallback getOnmsgesturechange();
@JsProperty(name="onmsgesturechange")
void setOnmsgesturechange(OnmsgesturechangeCallback val);
@JsProperty(name="onmsgesturedoubletap")
OnmsgesturedoubletapCallback getOnmsgesturedoubletap();
@JsProperty(name="onmsgesturedoubletap")
void setOnmsgesturedoubletap(OnmsgesturedoubletapCallback val);
@JsProperty(name="onmsgestureend")
OnmsgestureendCallback getOnmsgestureend();
@JsProperty(name="onmsgestureend")
void setOnmsgestureend(OnmsgestureendCallback val);
@JsProperty(name="onmsgesturehold")
OnmsgestureholdCallback getOnmsgesturehold();
@JsProperty(name="onmsgesturehold")
void setOnmsgesturehold(OnmsgestureholdCallback val);
@JsProperty(name="onmsgesturestart")
OnmsgesturestartCallback getOnmsgesturestart();
@JsProperty(name="onmsgesturestart")
void setOnmsgesturestart(OnmsgesturestartCallback val);
@JsProperty(name="onmsgesturetap")
OnmsgesturetapCallback getOnmsgesturetap();
@JsProperty(name="onmsgesturetap")
void setOnmsgesturetap(OnmsgesturetapCallback val);
@JsProperty(name="onmsinertiastart")
OnmsinertiastartCallback getOnmsinertiastart();
@JsProperty(name="onmsinertiastart")
void setOnmsinertiastart(OnmsinertiastartCallback val);
@JsProperty(name="onmspointercancel")
OnmspointercancelCallback getOnmspointercancel();
@JsProperty(name="onmspointercancel")
void setOnmspointercancel(OnmspointercancelCallback val);
@JsProperty(name="onmspointerdown")
OnmspointerdownCallback getOnmspointerdown();
@JsProperty(name="onmspointerdown")
void setOnmspointerdown(OnmspointerdownCallback val);
@JsProperty(name="onmspointerenter")
OnmspointerenterCallback getOnmspointerenter();
@JsProperty(name="onmspointerenter")
void setOnmspointerenter(OnmspointerenterCallback val);
@JsProperty(name="onmspointerleave")
OnmspointerleaveCallback getOnmspointerleave();
@JsProperty(name="onmspointerleave")
void setOnmspointerleave(OnmspointerleaveCallback val);
@JsProperty(name="onmspointermove")
OnmspointermoveCallback getOnmspointermove();
@JsProperty(name="onmspointermove")
void setOnmspointermove(OnmspointermoveCallback val);
@JsProperty(name="onmspointerout")
OnmspointeroutCallback getOnmspointerout();
@JsProperty(name="onmspointerout")
void setOnmspointerout(OnmspointeroutCallback val);
@JsProperty(name="onmspointerover")
OnmspointeroverCallback getOnmspointerover();
@JsProperty(name="onmspointerover")
void setOnmspointerover(OnmspointeroverCallback val);
@JsProperty(name="onmspointerup")
OnmspointerupCallback getOnmspointerup();
@JsProperty(name="onmspointerup")
void setOnmspointerup(OnmspointerupCallback val);
@JsProperty(name="onorientationchange")
OnorientationchangeCallback getOnorientationchange();
@JsProperty(name="onorientationchange")
void setOnorientationchange(OnorientationchangeCallback val);
@JsProperty(name="onreadystatechange")
OnreadystatechangeCallback getOnreadystatechange();
@JsProperty(name="onreadystatechange")
void setOnreadystatechange(OnreadystatechangeCallback val);
@JsProperty(name="onvrdisplayactivate")
OnvrdisplayactivateCallback getOnvrdisplayactivate();
@JsProperty(name="onvrdisplayactivate")
void setOnvrdisplayactivate(OnvrdisplayactivateCallback val);
@JsProperty(name="onvrdisplayblur")
OnvrdisplayblurCallback getOnvrdisplayblur();
@JsProperty(name="onvrdisplayblur")
void setOnvrdisplayblur(OnvrdisplayblurCallback val);
@JsProperty(name="onvrdisplayconnect")
OnvrdisplayconnectCallback getOnvrdisplayconnect();
@JsProperty(name="onvrdisplayconnect")
void setOnvrdisplayconnect(OnvrdisplayconnectCallback val);
@JsProperty(name="onvrdisplaydeactivate")
OnvrdisplaydeactivateCallback getOnvrdisplaydeactivate();
@JsProperty(name="onvrdisplaydeactivate")
void setOnvrdisplaydeactivate(OnvrdisplaydeactivateCallback val);
@JsProperty(name="onvrdisplaydisconnect")
OnvrdisplaydisconnectCallback getOnvrdisplaydisconnect();
@JsProperty(name="onvrdisplaydisconnect")
void setOnvrdisplaydisconnect(OnvrdisplaydisconnectCallback val);
@JsProperty(name="onvrdisplayfocus")
OnvrdisplayfocusCallback getOnvrdisplayfocus();
@JsProperty(name="onvrdisplayfocus")
void setOnvrdisplayfocus(OnvrdisplayfocusCallback val);
@JsProperty(name="onvrdisplaypointerrestricted")
OnvrdisplaypointerrestrictedCallback getOnvrdisplaypointerrestricted();
@JsProperty(name="onvrdisplaypointerrestricted")
void setOnvrdisplaypointerrestricted(OnvrdisplaypointerrestrictedCallback val);
@JsProperty(name="onvrdisplaypointerunrestricted")
OnvrdisplaypointerunrestrictedCallback getOnvrdisplaypointerunrestricted();
@JsProperty(name="onvrdisplaypointerunrestricted")
void setOnvrdisplaypointerunrestricted(OnvrdisplaypointerunrestrictedCallback val);
@JsProperty(name="onvrdisplaypresentchange")
OnvrdisplaypresentchangeCallback getOnvrdisplaypresentchange();
@JsProperty(name="onvrdisplaypresentchange")
void setOnvrdisplaypresentchange(OnvrdisplaypresentchangeCallback val);
@JsProperty(name="opener")
java.lang.Object getOpener();
@JsProperty(name="opener")
void setOpener(java.lang.Object val);
@JsProperty(name="orientation")
java.lang.Object getOrientation();
@JsProperty(name="outerHeight")
double getOuterHeight();
@JsProperty(name="outerWidth")
double getOuterWidth();
@JsProperty(name="pageXOffset")
double getPageXOffset();
@JsProperty(name="pageYOffset")
double getPageYOffset();
@JsProperty(name="parent")
Window getParent();
@JsProperty(name="performance")
com.user00.domjnate.api.performance.Performance getPerformance();
@JsProperty(name="personalbar")
BarProp getPersonalbar();
@JsProperty(name="screen")
Screen getScreen();
@JsProperty(name="screenLeft")
double getScreenLeft();
@JsProperty(name="screenTop")
double getScreenTop();
@JsProperty(name="screenX")
double getScreenX();
@JsProperty(name="screenY")
double getScreenY();
@JsProperty(name="scrollX")
double getScrollX();
@JsProperty(name="scrollY")
double getScrollY();
@JsProperty(name="scrollbars")
BarProp getScrollbars();
@JsProperty(name="self")
Window getSelf();
@JsProperty(name="speechSynthesis")
com.user00.domjnate.api.webspeech.SpeechSynthesis getSpeechSynthesis();
@JsProperty(name="status")
String getStatus();
@JsProperty(name="status")
void setStatus(String val);
@JsProperty(name="statusbar")
BarProp getStatusbar();
@JsProperty(name="styleMedia")
StyleMedia getStyleMedia();
@JsProperty(name="toolbar")
BarProp getToolbar();
@JsProperty(name="top")
Window getTop();
@JsProperty(name="window")
Window getWindow();
@JsMethod(name="alert")
void alert();
@JsMethod(name="alert")
void alert(java.lang.Object message);
@JsMethod(name="blur")
void blur();
@JsMethod(name="cancelAnimationFrame")
void cancelAnimationFrame(double handle);
@JsMethod(name="captureEvents")
void captureEvents();
@JsMethod(name="close")
void close();
@JsMethod(name="confirm")
boolean confirm();
@JsMethod(name="confirm")
boolean confirm(String message);
@JsMethod(name="departFocus")
void departFocus(String navigationReason, FocusNavigationOrigin origin);
@JsMethod(name="focus")
void focus();
@JsMethod(name="getComputedStyle")
CSSStyleDeclaration getComputedStyle(com.user00.domjnate.api.dom.Element elt);
@JsMethod(name="getComputedStyle")
CSSStyleDeclaration getComputedStyle(com.user00.domjnate.api.dom.Element elt, String pseudoElt);
@JsMethod(name="getMatchedCSSRules")
CSSRuleList getMatchedCSSRules(com.user00.domjnate.api.dom.Element elt);
@JsMethod(name="getMatchedCSSRules")
CSSRuleList getMatchedCSSRules(com.user00.domjnate.api.dom.Element elt, String pseudoElt);
@JsMethod(name="getSelection")
Selection getSelection();
@JsMethod(name="matchMedia")
MediaQueryList matchMedia(String query);
@JsMethod(name="moveBy")
void moveBy(double x, double y);
@JsMethod(name="moveTo")
void moveTo(double x, double y);
@JsMethod(name="msWriteProfilerMark")
void msWriteProfilerMark(String profilerMarkName);
@JsMethod(name="open")
Window open();
@JsMethod(name="open")
Window open(String url);
@JsMethod(name="open")
Window open(String url, String target);
@JsMethod(name="open")
Window open(String url, String target, String features);
@JsMethod(name="open")
Window open(String url, String target, String features, boolean replace);
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message, String targetOrigin);
@JsMethod(name="postMessage")
void postMessage(java.lang.Object message, String targetOrigin, Array<ImageBitmap> transfer);
@JsMethod(name="print")
void print();
@JsMethod(name="prompt")
String prompt();
@JsMethod(name="prompt")
String prompt(String message);
@JsMethod(name="prompt")
String prompt(String message, String _default);
@JsMethod(name="releaseEvents")
void releaseEvents();
@JsMethod(name="requestAnimationFrame")
double requestAnimationFrame(FrameRequestCallback callback);
@JsMethod(name="resizeBy")
void resizeBy(double x, double y);
@JsMethod(name="resizeTo")
void resizeTo(double x, double y);
@JsMethod(name="scroll")
void scroll();
@JsMethod(name="scroll")
void scroll(ScrollToOptions options);
@JsMethod(name="scroll")
void scroll(double x, double y);
@JsMethod(name="scrollBy")
void scrollBy();
@JsMethod(name="scrollBy")
void scrollBy(ScrollToOptions options);
@JsMethod(name="scrollBy")
void scrollBy(double x, double y);
@JsMethod(name="scrollTo")
void scrollTo();
@JsMethod(name="scrollTo")
void scrollTo(ScrollToOptions options);
@JsMethod(name="scrollTo")
void scrollTo(double x, double y);
@JsMethod(name="stop")
void stop();
@JsMethod(name="webkitCancelAnimationFrame")
void webkitCancelAnimationFrame(double handle);
@JsMethod(name="webkitConvertPointFromNodeToPage")
WebKitPoint webkitConvertPointFromNodeToPage(com.user00.domjnate.api.dom.Node node, WebKitPoint pt);
@JsMethod(name="webkitConvertPointFromPageToNode")
WebKitPoint webkitConvertPointFromPageToNode(com.user00.domjnate.api.dom.Node node, WebKitPoint pt);
@JsMethod(name="webkitRequestAnimationFrame")
double webkitRequestAnimationFrame(FrameRequestCallback callback);
// TODO: Suppressing generic keyof type parameter for addEventListener
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
@JsMethod(name="addEventListener")
void addEventListener(String type, EventListener listener, boolean options);
// TODO: Suppressing generic keyof type parameter for removeEventListener
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, EventListenerOptions options);
@JsMethod(name="removeEventListener")
void removeEventListener(String type, EventListener listener, boolean options);
@JsFunction public static interface OnreadystatechangeCallback
{
java.lang.Object apply(ProgressEvent ev);
}
@JsFunction public static interface OndevicemotionCallback
{
java.lang.Object apply(DeviceMotionEvent ev);
}
@JsFunction public static interface OnorientationchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointerdownCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointeroverCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplaydeactivateCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointercancelCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmsgestureholdCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointerenterCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplaypointerunrestrictedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmsinertiastartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplayconnectCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OncompassneedscalibrationCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmousewheelCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointeroutCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplayfocusCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmsgesturetapCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointerupCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OndevicelightCallback
{
java.lang.Object apply(DeviceLightEvent ev);
}
@JsFunction public static interface OnmspointermoveCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmspointerleaveCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplayactivateCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplaypresentchangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplaydisconnectCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplayblurCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnvrdisplaypointerrestrictedCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmsgesturechangeCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OndeviceorientationCallback
{
java.lang.Object apply(DeviceOrientationEvent ev);
}
@JsFunction public static interface OnmsgesturedoubletapCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmsgesturestartCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsFunction public static interface OnmsgestureendCallback
{
java.lang.Object apply(com.user00.domjnate.api.dom.Event ev);
}
@JsOverlay
public static Window getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Window", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", Window.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Window val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "Window", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static Window _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "Window");
  return com.user00.domjnate.util.Js.construct(_win, constructor, Window.class);
}
}
