package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="StoreSiteSpecificExceptionsInformation")
public interface StoreSiteSpecificExceptionsInformation extends StoreExceptionsInformation
{
@JsProperty(name="arrayOfDomainStrings")
Array<String> getArrayOfDomainStrings();
@JsProperty(name="arrayOfDomainStrings")
void setArrayOfDomainStrings(Array<String> val);
}
