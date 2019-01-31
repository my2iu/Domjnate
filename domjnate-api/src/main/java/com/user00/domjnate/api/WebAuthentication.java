package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebAuthentication")
public interface WebAuthentication
{
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(ArrayBuffer assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(DataView assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Float64Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Float32Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint8ClampedArray assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint32Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint16Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint8Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Int32Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Int16Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Int8Array assertionChallenge);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(ArrayBuffer assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(DataView assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Float64Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Float32Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint8ClampedArray assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint32Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint16Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Uint8Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Int32Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Int16Array assertionChallenge, AssertionOptions options);
@JsMethod(name="getAssertion")
Promise<WebAuthnAssertion> getAssertion(Int8Array assertionChallenge, AssertionOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, ArrayBuffer attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, DataView attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Float64Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Float32Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint8ClampedArray attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint32Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint16Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint8Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Int32Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Int16Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Int8Array attestationChallenge);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, ArrayBuffer attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, DataView attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Float64Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Float32Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint8ClampedArray attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint32Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint16Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Uint8Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Int32Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Int16Array attestationChallenge, ScopedCredentialOptions options);
@JsMethod(name="makeCredential")
Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Int8Array attestationChallenge, ScopedCredentialOptions options);
@JsOverlay
public static WebAuthentication getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebAuthentication", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", WebAuthentication.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, WebAuthentication val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "WebAuthentication", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static WebAuthentication _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "WebAuthentication");
  return com.user00.domjnate.util.Js.construct(_win, constructor, WebAuthentication.class);
}
}
