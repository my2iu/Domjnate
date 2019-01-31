package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MSNavigatorDoNotTrack")
public interface MSNavigatorDoNotTrack
{
@JsMethod(name="confirmSiteSpecificTrackingException")
boolean confirmSiteSpecificTrackingException(ConfirmSiteSpecificExceptionsInformation args);
@JsMethod(name="confirmWebWideTrackingException")
boolean confirmWebWideTrackingException(ExceptionInformation args);
@JsMethod(name="removeSiteSpecificTrackingException")
void removeSiteSpecificTrackingException(ExceptionInformation args);
@JsMethod(name="removeWebWideTrackingException")
void removeWebWideTrackingException(ExceptionInformation args);
@JsMethod(name="storeSiteSpecificTrackingException")
void storeSiteSpecificTrackingException(StoreSiteSpecificExceptionsInformation args);
@JsMethod(name="storeWebWideTrackingException")
void storeWebWideTrackingException(StoreExceptionsInformation args);
}
