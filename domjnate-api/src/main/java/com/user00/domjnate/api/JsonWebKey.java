package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="JsonWebKey")
public interface JsonWebKey
{
@JsProperty(name="alg")
String getAlg();
@JsProperty(name="alg")
void setAlg(String val);
@JsProperty(name="crv")
String getCrv();
@JsProperty(name="crv")
void setCrv(String val);
@JsProperty(name="d")
String getD();
@JsProperty(name="d")
void setD(String val);
@JsProperty(name="dp")
String getDp();
@JsProperty(name="dp")
void setDp(String val);
@JsProperty(name="dq")
String getDq();
@JsProperty(name="dq")
void setDq(String val);
@JsProperty(name="e")
String getE();
@JsProperty(name="e")
void setE(String val);
@JsProperty(name="ext")
Boolean getExt();
@JsProperty(name="ext")
void setExt(Boolean val);
@JsProperty(name="k")
String getK();
@JsProperty(name="k")
void setK(String val);
@JsProperty(name="key_ops")
Array<String> getKey_ops();
@JsProperty(name="key_ops")
void setKey_ops(Array<String> val);
@JsProperty(name="kty")
String getKty();
@JsProperty(name="kty")
void setKty(String val);
@JsProperty(name="n")
String getN();
@JsProperty(name="n")
void setN(String val);
@JsProperty(name="oth")
Array<com.user00.domjnate.api.webcrypto.RsaOtherPrimesInfo> getOth();
@JsProperty(name="oth")
void setOth(Array<com.user00.domjnate.api.webcrypto.RsaOtherPrimesInfo> val);
@JsProperty(name="p")
String getP();
@JsProperty(name="p")
void setP(String val);
@JsProperty(name="q")
String getQ();
@JsProperty(name="q")
void setQ(String val);
@JsProperty(name="qi")
String getQi();
@JsProperty(name="qi")
void setQi(String val);
@JsProperty(name="use")
String getUse();
@JsProperty(name="use")
void setUse(String val);
@JsProperty(name="x")
String getX();
@JsProperty(name="x")
void setX(String val);
@JsProperty(name="y")
String getY();
@JsProperty(name="y")
void setY(String val);
}
