package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowEventMap")
public interface WindowEventMap extends GlobalEventHandlersEventMap, WindowEventHandlersEventMap
{
@JsProperty(name="abort")
UIEvent getAbort();
@JsProperty(name="abort")
void setAbort(UIEvent val);
@JsProperty(name="afterprint")
com.user00.domjnate.api.dom.Event getAfterprint();
@JsProperty(name="afterprint")
void setAfterprint(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="beforeprint")
com.user00.domjnate.api.dom.Event getBeforeprint();
@JsProperty(name="beforeprint")
void setBeforeprint(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="beforeunload")
BeforeUnloadEvent getBeforeunload();
@JsProperty(name="beforeunload")
void setBeforeunload(BeforeUnloadEvent val);
@JsProperty(name="blur")
FocusEvent getBlur();
@JsProperty(name="blur")
void setBlur(FocusEvent val);
@JsProperty(name="canplay")
com.user00.domjnate.api.dom.Event getCanplay();
@JsProperty(name="canplay")
void setCanplay(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="canplaythrough")
com.user00.domjnate.api.dom.Event getCanplaythrough();
@JsProperty(name="canplaythrough")
void setCanplaythrough(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="change")
com.user00.domjnate.api.dom.Event getChange();
@JsProperty(name="change")
void setChange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="click")
MouseEvent getClick();
@JsProperty(name="click")
void setClick(MouseEvent val);
@JsProperty(name="compassneedscalibration")
com.user00.domjnate.api.dom.Event getCompassneedscalibration();
@JsProperty(name="compassneedscalibration")
void setCompassneedscalibration(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="contextmenu")
MouseEvent getContextmenu();
@JsProperty(name="contextmenu")
void setContextmenu(MouseEvent val);
@JsProperty(name="dblclick")
MouseEvent getDblclick();
@JsProperty(name="dblclick")
void setDblclick(MouseEvent val);
@JsProperty(name="devicelight")
DeviceLightEvent getDevicelight();
@JsProperty(name="devicelight")
void setDevicelight(DeviceLightEvent val);
@JsProperty(name="devicemotion")
DeviceMotionEvent getDevicemotion();
@JsProperty(name="devicemotion")
void setDevicemotion(DeviceMotionEvent val);
@JsProperty(name="deviceorientation")
DeviceOrientationEvent getDeviceorientation();
@JsProperty(name="deviceorientation")
void setDeviceorientation(DeviceOrientationEvent val);
@JsProperty(name="drag")
DragEvent getDrag();
@JsProperty(name="drag")
void setDrag(DragEvent val);
@JsProperty(name="dragend")
DragEvent getDragend();
@JsProperty(name="dragend")
void setDragend(DragEvent val);
@JsProperty(name="dragenter")
DragEvent getDragenter();
@JsProperty(name="dragenter")
void setDragenter(DragEvent val);
@JsProperty(name="dragleave")
DragEvent getDragleave();
@JsProperty(name="dragleave")
void setDragleave(DragEvent val);
@JsProperty(name="dragover")
DragEvent getDragover();
@JsProperty(name="dragover")
void setDragover(DragEvent val);
@JsProperty(name="dragstart")
DragEvent getDragstart();
@JsProperty(name="dragstart")
void setDragstart(DragEvent val);
@JsProperty(name="drop")
DragEvent getDrop();
@JsProperty(name="drop")
void setDrop(DragEvent val);
@JsProperty(name="durationchange")
com.user00.domjnate.api.dom.Event getDurationchange();
@JsProperty(name="durationchange")
void setDurationchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="emptied")
com.user00.domjnate.api.dom.Event getEmptied();
@JsProperty(name="emptied")
void setEmptied(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="ended")
com.user00.domjnate.api.dom.Event getEnded();
@JsProperty(name="ended")
void setEnded(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
ErrorEvent getError();
@JsProperty(name="error")
void setError(ErrorEvent val);
@JsProperty(name="focus")
FocusEvent getFocus();
@JsProperty(name="focus")
void setFocus(FocusEvent val);
@JsProperty(name="hashchange")
HashChangeEvent getHashchange();
@JsProperty(name="hashchange")
void setHashchange(HashChangeEvent val);
@JsProperty(name="input")
com.user00.domjnate.api.dom.Event getInput();
@JsProperty(name="input")
void setInput(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="invalid")
com.user00.domjnate.api.dom.Event getInvalid();
@JsProperty(name="invalid")
void setInvalid(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="keydown")
KeyboardEvent getKeydown();
@JsProperty(name="keydown")
void setKeydown(KeyboardEvent val);
@JsProperty(name="keypress")
KeyboardEvent getKeypress();
@JsProperty(name="keypress")
void setKeypress(KeyboardEvent val);
@JsProperty(name="keyup")
KeyboardEvent getKeyup();
@JsProperty(name="keyup")
void setKeyup(KeyboardEvent val);
@JsProperty(name="load")
com.user00.domjnate.api.dom.Event getLoad();
@JsProperty(name="load")
void setLoad(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="loadeddata")
com.user00.domjnate.api.dom.Event getLoadeddata();
@JsProperty(name="loadeddata")
void setLoadeddata(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="loadedmetadata")
com.user00.domjnate.api.dom.Event getLoadedmetadata();
@JsProperty(name="loadedmetadata")
void setLoadedmetadata(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="loadstart")
com.user00.domjnate.api.dom.Event getLoadstart();
@JsProperty(name="loadstart")
void setLoadstart(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="message")
MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(MessageEvent val);
@JsProperty(name="mousedown")
MouseEvent getMousedown();
@JsProperty(name="mousedown")
void setMousedown(MouseEvent val);
@JsProperty(name="mouseenter")
MouseEvent getMouseenter();
@JsProperty(name="mouseenter")
void setMouseenter(MouseEvent val);
@JsProperty(name="mouseleave")
MouseEvent getMouseleave();
@JsProperty(name="mouseleave")
void setMouseleave(MouseEvent val);
@JsProperty(name="mousemove")
MouseEvent getMousemove();
@JsProperty(name="mousemove")
void setMousemove(MouseEvent val);
@JsProperty(name="mouseout")
MouseEvent getMouseout();
@JsProperty(name="mouseout")
void setMouseout(MouseEvent val);
@JsProperty(name="mouseover")
MouseEvent getMouseover();
@JsProperty(name="mouseover")
void setMouseover(MouseEvent val);
@JsProperty(name="mouseup")
MouseEvent getMouseup();
@JsProperty(name="mouseup")
void setMouseup(MouseEvent val);
@JsProperty(name="mousewheel")
com.user00.domjnate.api.dom.Event getMousewheel();
@JsProperty(name="mousewheel")
void setMousewheel(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSGestureChange")
com.user00.domjnate.api.dom.Event getMSGestureChange();
@JsProperty(name="MSGestureChange")
void setMSGestureChange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSGestureDoubleTap")
com.user00.domjnate.api.dom.Event getMSGestureDoubleTap();
@JsProperty(name="MSGestureDoubleTap")
void setMSGestureDoubleTap(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSGestureEnd")
com.user00.domjnate.api.dom.Event getMSGestureEnd();
@JsProperty(name="MSGestureEnd")
void setMSGestureEnd(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSGestureHold")
com.user00.domjnate.api.dom.Event getMSGestureHold();
@JsProperty(name="MSGestureHold")
void setMSGestureHold(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSGestureStart")
com.user00.domjnate.api.dom.Event getMSGestureStart();
@JsProperty(name="MSGestureStart")
void setMSGestureStart(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSGestureTap")
com.user00.domjnate.api.dom.Event getMSGestureTap();
@JsProperty(name="MSGestureTap")
void setMSGestureTap(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSInertiaStart")
com.user00.domjnate.api.dom.Event getMSInertiaStart();
@JsProperty(name="MSInertiaStart")
void setMSInertiaStart(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerCancel")
com.user00.domjnate.api.dom.Event getMSPointerCancel();
@JsProperty(name="MSPointerCancel")
void setMSPointerCancel(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerDown")
com.user00.domjnate.api.dom.Event getMSPointerDown();
@JsProperty(name="MSPointerDown")
void setMSPointerDown(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerEnter")
com.user00.domjnate.api.dom.Event getMSPointerEnter();
@JsProperty(name="MSPointerEnter")
void setMSPointerEnter(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerLeave")
com.user00.domjnate.api.dom.Event getMSPointerLeave();
@JsProperty(name="MSPointerLeave")
void setMSPointerLeave(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerMove")
com.user00.domjnate.api.dom.Event getMSPointerMove();
@JsProperty(name="MSPointerMove")
void setMSPointerMove(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerOut")
com.user00.domjnate.api.dom.Event getMSPointerOut();
@JsProperty(name="MSPointerOut")
void setMSPointerOut(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerOver")
com.user00.domjnate.api.dom.Event getMSPointerOver();
@JsProperty(name="MSPointerOver")
void setMSPointerOver(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="MSPointerUp")
com.user00.domjnate.api.dom.Event getMSPointerUp();
@JsProperty(name="MSPointerUp")
void setMSPointerUp(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="offline")
com.user00.domjnate.api.dom.Event getOffline();
@JsProperty(name="offline")
void setOffline(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="online")
com.user00.domjnate.api.dom.Event getOnline();
@JsProperty(name="online")
void setOnline(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="orientationchange")
com.user00.domjnate.api.dom.Event getOrientationchange();
@JsProperty(name="orientationchange")
void setOrientationchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="pagehide")
PageTransitionEvent getPagehide();
@JsProperty(name="pagehide")
void setPagehide(PageTransitionEvent val);
@JsProperty(name="pageshow")
PageTransitionEvent getPageshow();
@JsProperty(name="pageshow")
void setPageshow(PageTransitionEvent val);
@JsProperty(name="pause")
com.user00.domjnate.api.dom.Event getPause();
@JsProperty(name="pause")
void setPause(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="play")
com.user00.domjnate.api.dom.Event getPlay();
@JsProperty(name="play")
void setPlay(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="playing")
com.user00.domjnate.api.dom.Event getPlaying();
@JsProperty(name="playing")
void setPlaying(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="popstate")
PopStateEvent getPopstate();
@JsProperty(name="popstate")
void setPopstate(PopStateEvent val);
@JsProperty(name="progress")
ProgressEvent getProgress();
@JsProperty(name="progress")
void setProgress(ProgressEvent val);
@JsProperty(name="ratechange")
com.user00.domjnate.api.dom.Event getRatechange();
@JsProperty(name="ratechange")
void setRatechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="readystatechange")
ProgressEvent getReadystatechange();
@JsProperty(name="readystatechange")
void setReadystatechange(ProgressEvent val);
@JsProperty(name="reset")
com.user00.domjnate.api.dom.Event getReset();
@JsProperty(name="reset")
void setReset(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="resize")
UIEvent getResize();
@JsProperty(name="resize")
void setResize(UIEvent val);
@JsProperty(name="scroll")
UIEvent getScroll();
@JsProperty(name="scroll")
void setScroll(UIEvent val);
@JsProperty(name="seeked")
com.user00.domjnate.api.dom.Event getSeeked();
@JsProperty(name="seeked")
void setSeeked(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="seeking")
com.user00.domjnate.api.dom.Event getSeeking();
@JsProperty(name="seeking")
void setSeeking(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="select")
UIEvent getSelect();
@JsProperty(name="select")
void setSelect(UIEvent val);
@JsProperty(name="stalled")
com.user00.domjnate.api.dom.Event getStalled();
@JsProperty(name="stalled")
void setStalled(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="storage")
StorageEvent getStorage();
@JsProperty(name="storage")
void setStorage(StorageEvent val);
@JsProperty(name="submit")
com.user00.domjnate.api.dom.Event getSubmit();
@JsProperty(name="submit")
void setSubmit(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="suspend")
com.user00.domjnate.api.dom.Event getSuspend();
@JsProperty(name="suspend")
void setSuspend(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="timeupdate")
com.user00.domjnate.api.dom.Event getTimeupdate();
@JsProperty(name="timeupdate")
void setTimeupdate(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="unload")
com.user00.domjnate.api.dom.Event getUnload();
@JsProperty(name="unload")
void setUnload(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="volumechange")
com.user00.domjnate.api.dom.Event getVolumechange();
@JsProperty(name="volumechange")
void setVolumechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplayactivate")
com.user00.domjnate.api.dom.Event getVrdisplayactivate();
@JsProperty(name="vrdisplayactivate")
void setVrdisplayactivate(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplayblur")
com.user00.domjnate.api.dom.Event getVrdisplayblur();
@JsProperty(name="vrdisplayblur")
void setVrdisplayblur(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplayconnect")
com.user00.domjnate.api.dom.Event getVrdisplayconnect();
@JsProperty(name="vrdisplayconnect")
void setVrdisplayconnect(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplaydeactivate")
com.user00.domjnate.api.dom.Event getVrdisplaydeactivate();
@JsProperty(name="vrdisplaydeactivate")
void setVrdisplaydeactivate(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplaydisconnect")
com.user00.domjnate.api.dom.Event getVrdisplaydisconnect();
@JsProperty(name="vrdisplaydisconnect")
void setVrdisplaydisconnect(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplayfocus")
com.user00.domjnate.api.dom.Event getVrdisplayfocus();
@JsProperty(name="vrdisplayfocus")
void setVrdisplayfocus(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplaypointerrestricted")
com.user00.domjnate.api.dom.Event getVrdisplaypointerrestricted();
@JsProperty(name="vrdisplaypointerrestricted")
void setVrdisplaypointerrestricted(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplaypointerunrestricted")
com.user00.domjnate.api.dom.Event getVrdisplaypointerunrestricted();
@JsProperty(name="vrdisplaypointerunrestricted")
void setVrdisplaypointerunrestricted(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="vrdisplaypresentchange")
com.user00.domjnate.api.dom.Event getVrdisplaypresentchange();
@JsProperty(name="vrdisplaypresentchange")
void setVrdisplaypresentchange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="waiting")
com.user00.domjnate.api.dom.Event getWaiting();
@JsProperty(name="waiting")
void setWaiting(com.user00.domjnate.api.dom.Event val);
}
