package com.user00.domjnate.api.webcrypto;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SubtleCrypto")
public interface SubtleCrypto
{
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="decrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> decrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="deriveBits")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> deriveBits(Pbkdf2Params algorithm, CryptoKey baseKey, double length);
@JsMethod(name="deriveBits")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> deriveBits(HkdfCtrParams algorithm, CryptoKey baseKey, double length);
@JsMethod(name="deriveBits")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> deriveBits(ConcatParams algorithm, CryptoKey baseKey, double length);
@JsMethod(name="deriveBits")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> deriveBits(DhKeyDeriveParams algorithm, CryptoKey baseKey, double length);
@JsMethod(name="deriveBits")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> deriveBits(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, double length);
@JsMethod(name="deriveBits")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> deriveBits(String algorithm, CryptoKey baseKey, double length);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(Pbkdf2Params algorithm, CryptoKey baseKey, Pbkdf2Params derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(HkdfCtrParams algorithm, CryptoKey baseKey, Pbkdf2Params derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(ConcatParams algorithm, CryptoKey baseKey, Pbkdf2Params derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(DhKeyDeriveParams algorithm, CryptoKey baseKey, Pbkdf2Params derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, Pbkdf2Params derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, Pbkdf2Params derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(Pbkdf2Params algorithm, CryptoKey baseKey, HkdfCtrParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(HkdfCtrParams algorithm, CryptoKey baseKey, HkdfCtrParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(ConcatParams algorithm, CryptoKey baseKey, HkdfCtrParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(DhKeyDeriveParams algorithm, CryptoKey baseKey, HkdfCtrParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, HkdfCtrParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, HkdfCtrParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(Pbkdf2Params algorithm, CryptoKey baseKey, ConcatParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(HkdfCtrParams algorithm, CryptoKey baseKey, ConcatParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(ConcatParams algorithm, CryptoKey baseKey, ConcatParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(DhKeyDeriveParams algorithm, CryptoKey baseKey, ConcatParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, ConcatParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, ConcatParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(Pbkdf2Params algorithm, CryptoKey baseKey, HmacImportParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(HkdfCtrParams algorithm, CryptoKey baseKey, HmacImportParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(ConcatParams algorithm, CryptoKey baseKey, HmacImportParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(DhKeyDeriveParams algorithm, CryptoKey baseKey, HmacImportParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, HmacImportParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, HmacImportParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(Pbkdf2Params algorithm, CryptoKey baseKey, AesDerivedKeyParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(HkdfCtrParams algorithm, CryptoKey baseKey, AesDerivedKeyParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(ConcatParams algorithm, CryptoKey baseKey, AesDerivedKeyParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(DhKeyDeriveParams algorithm, CryptoKey baseKey, AesDerivedKeyParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, AesDerivedKeyParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, AesDerivedKeyParams derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(Pbkdf2Params algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(HkdfCtrParams algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(ConcatParams algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(DhKeyDeriveParams algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="deriveKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> deriveKey(String algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.DataView data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.DataView data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(Algorithm algorithm, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="digest")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> digest(String algorithm, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCfbParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesGcmParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCbcParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(AesCtrParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(RsaOaepParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="encrypt")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> encrypt(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="exportKey")
com.user00.domjnate.api.PromiseLike<java.lang.Object> exportKey(String format, CryptoKey key);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<java.lang.Object> generateKey(String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<CryptoKeyPair> generateKey(DhKeyGenParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<CryptoKeyPair> generateKey(EcKeyGenParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<CryptoKeyPair> generateKey(RsaHashedKeyGenParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> generateKey(Pbkdf2Params algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> generateKey(HmacKeyGenParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="generateKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> generateKey(AesKeyGenParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.ArrayBuffer keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.DataView keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float64Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float32Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8ClampedArray keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint32Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint16Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int32Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int16Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int8Array keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.JsonWebKey keyData, AesKeyAlgorithm algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.ArrayBuffer keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.DataView keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float64Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float32Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8ClampedArray keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint32Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint16Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int32Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int16Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int8Array keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.JsonWebKey keyData, DhImportKeyParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.ArrayBuffer keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.DataView keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float64Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float32Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8ClampedArray keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint32Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint16Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int32Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int16Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int8Array keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.JsonWebKey keyData, HmacImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.ArrayBuffer keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.DataView keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float64Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float32Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8ClampedArray keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint32Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint16Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int32Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int16Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int8Array keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.JsonWebKey keyData, EcKeyImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.ArrayBuffer keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.DataView keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float64Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float32Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8ClampedArray keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint32Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint16Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int32Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int16Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int8Array keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.JsonWebKey keyData, RsaHashedImportParams algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.ArrayBuffer keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.DataView keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float64Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Float32Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8ClampedArray keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint32Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint16Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Uint8Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int32Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int16Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.Int8Array keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="importKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> importKey(String format, com.user00.domjnate.api.JsonWebKey keyData, String algorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="sign")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> sign(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.ArrayBuffer wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.DataView wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float64Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float32Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8ClampedArray wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint32Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint16Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int32Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int16Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int8Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.DataView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float64Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float32Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8ClampedArray wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint32Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint16Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int32Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int16Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int8Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.ArrayBuffer wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.DataView wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float64Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float32Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8ClampedArray wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint32Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint16Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int32Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int16Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int8Array wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.DataView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float64Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Float32Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8ClampedArray wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint32Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint16Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Uint8Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int32Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int16Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="unwrapKey")
com.user00.domjnate.api.PromiseLike<CryptoKey> unwrapKey(String format, com.user00.domjnate.api.Int8Array wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, com.user00.domjnate.api.Array<String> keyUsages);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.DataView data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float64Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Float32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8ClampedArray data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Uint8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int32Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int16Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.ArrayBuffer signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.DataView signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float64Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Float32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8ClampedArray signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Uint8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int32Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int16Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(AesCmacParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(EcdsaParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(RsaPssParams algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="verify")
com.user00.domjnate.api.PromiseLike<Boolean> verify(String algorithm, CryptoKey key, com.user00.domjnate.api.Int8Array signature, com.user00.domjnate.api.Int8Array data);
@JsMethod(name="wrapKey")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, Algorithm wrapAlgorithm);
@JsMethod(name="wrapKey")
com.user00.domjnate.api.PromiseLike<com.user00.domjnate.api.ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, String wrapAlgorithm);
@JsOverlay
public static SubtleCrypto getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SubtleCrypto", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", SubtleCrypto.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, SubtleCrypto val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "SubtleCrypto", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static SubtleCrypto _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "SubtleCrypto");
  return com.user00.domjnate.util.Js.construct(_win, constructor, SubtleCrypto.class);
}
}
