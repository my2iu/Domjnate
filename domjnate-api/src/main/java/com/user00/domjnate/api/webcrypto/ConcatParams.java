package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="ConcatParams")
public interface ConcatParams extends Algorithm
{
@JsProperty(name="algorithmId")
com.user00.domjnate.api.Uint8Array getAlgorithmId();
@JsProperty(name="algorithmId")
void setAlgorithmId(com.user00.domjnate.api.Uint8Array val);
@JsProperty(name="hash")
java.lang.Object getHash();
@JsProperty(name="hash")
void setHash(java.lang.Object val);
@JsProperty(name="partyUInfo")
com.user00.domjnate.api.Uint8Array getPartyUInfo();
@JsProperty(name="partyUInfo")
void setPartyUInfo(com.user00.domjnate.api.Uint8Array val);
@JsProperty(name="partyVInfo")
com.user00.domjnate.api.Uint8Array getPartyVInfo();
@JsProperty(name="partyVInfo")
void setPartyVInfo(com.user00.domjnate.api.Uint8Array val);
@JsProperty(name="privateInfo")
com.user00.domjnate.api.Uint8Array getPrivateInfo();
@JsProperty(name="privateInfo")
void setPrivateInfo(com.user00.domjnate.api.Uint8Array val);
@JsProperty(name="publicInfo")
com.user00.domjnate.api.Uint8Array getPublicInfo();
@JsProperty(name="publicInfo")
void setPublicInfo(com.user00.domjnate.api.Uint8Array val);
}
