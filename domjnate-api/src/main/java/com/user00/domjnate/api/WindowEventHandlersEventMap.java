package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WindowEventHandlersEventMap")
public interface WindowEventHandlersEventMap
{
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
@JsProperty(name="hashchange")
HashChangeEvent getHashchange();
@JsProperty(name="hashchange")
void setHashchange(HashChangeEvent val);
@JsProperty(name="languagechange")
com.user00.domjnate.api.dom.Event getLanguagechange();
@JsProperty(name="languagechange")
void setLanguagechange(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="message")
MessageEvent getMessage();
@JsProperty(name="message")
void setMessage(MessageEvent val);
@JsProperty(name="messageerror")
MessageEvent getMessageerror();
@JsProperty(name="messageerror")
void setMessageerror(MessageEvent val);
@JsProperty(name="offline")
com.user00.domjnate.api.dom.Event getOffline();
@JsProperty(name="offline")
void setOffline(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="online")
com.user00.domjnate.api.dom.Event getOnline();
@JsProperty(name="online")
void setOnline(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="pagehide")
PageTransitionEvent getPagehide();
@JsProperty(name="pagehide")
void setPagehide(PageTransitionEvent val);
@JsProperty(name="pageshow")
PageTransitionEvent getPageshow();
@JsProperty(name="pageshow")
void setPageshow(PageTransitionEvent val);
@JsProperty(name="popstate")
PopStateEvent getPopstate();
@JsProperty(name="popstate")
void setPopstate(PopStateEvent val);
@JsProperty(name="rejectionhandled")
com.user00.domjnate.api.dom.Event getRejectionhandled();
@JsProperty(name="rejectionhandled")
void setRejectionhandled(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="storage")
StorageEvent getStorage();
@JsProperty(name="storage")
void setStorage(StorageEvent val);
@JsProperty(name="unhandledrejection")
PromiseRejectionEvent getUnhandledrejection();
@JsProperty(name="unhandledrejection")
void setUnhandledrejection(PromiseRejectionEvent val);
@JsProperty(name="unload")
com.user00.domjnate.api.dom.Event getUnload();
@JsProperty(name="unload")
void setUnload(com.user00.domjnate.api.dom.Event val);
}
