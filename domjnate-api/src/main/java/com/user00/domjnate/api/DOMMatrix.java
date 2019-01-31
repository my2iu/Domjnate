package com.user00.domjnate.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="DOMMatrix")
public interface DOMMatrix extends DOMMatrixReadOnly
{
@JsProperty(name="a")
double getA();
@JsProperty(name="a")
void setA(double val);
@JsProperty(name="b")
double getB();
@JsProperty(name="b")
void setB(double val);
@JsProperty(name="c")
double getC();
@JsProperty(name="c")
void setC(double val);
@JsProperty(name="d")
double getD();
@JsProperty(name="d")
void setD(double val);
@JsProperty(name="e")
double getE();
@JsProperty(name="e")
void setE(double val);
@JsProperty(name="f")
double getF();
@JsProperty(name="f")
void setF(double val);
@JsProperty(name="m11")
double getM11();
@JsProperty(name="m11")
void setM11(double val);
@JsProperty(name="m12")
double getM12();
@JsProperty(name="m12")
void setM12(double val);
@JsProperty(name="m13")
double getM13();
@JsProperty(name="m13")
void setM13(double val);
@JsProperty(name="m14")
double getM14();
@JsProperty(name="m14")
void setM14(double val);
@JsProperty(name="m21")
double getM21();
@JsProperty(name="m21")
void setM21(double val);
@JsProperty(name="m22")
double getM22();
@JsProperty(name="m22")
void setM22(double val);
@JsProperty(name="m23")
double getM23();
@JsProperty(name="m23")
void setM23(double val);
@JsProperty(name="m24")
double getM24();
@JsProperty(name="m24")
void setM24(double val);
@JsProperty(name="m31")
double getM31();
@JsProperty(name="m31")
void setM31(double val);
@JsProperty(name="m32")
double getM32();
@JsProperty(name="m32")
void setM32(double val);
@JsProperty(name="m33")
double getM33();
@JsProperty(name="m33")
void setM33(double val);
@JsProperty(name="m34")
double getM34();
@JsProperty(name="m34")
void setM34(double val);
@JsProperty(name="m41")
double getM41();
@JsProperty(name="m41")
void setM41(double val);
@JsProperty(name="m42")
double getM42();
@JsProperty(name="m42")
void setM42(double val);
@JsProperty(name="m43")
double getM43();
@JsProperty(name="m43")
void setM43(double val);
@JsProperty(name="m44")
double getM44();
@JsProperty(name="m44")
void setM44(double val);
@JsMethod(name="invertSelf")
DOMMatrix invertSelf();
@JsMethod(name="multiplySelf")
DOMMatrix multiplySelf();
@JsMethod(name="multiplySelf")
DOMMatrix multiplySelf(DOMMatrixInit other);
@JsMethod(name="preMultiplySelf")
DOMMatrix preMultiplySelf();
@JsMethod(name="preMultiplySelf")
DOMMatrix preMultiplySelf(DOMMatrixInit other);
@JsMethod(name="rotateAxisAngleSelf")
DOMMatrix rotateAxisAngleSelf();
@JsMethod(name="rotateAxisAngleSelf")
DOMMatrix rotateAxisAngleSelf(double x);
@JsMethod(name="rotateAxisAngleSelf")
DOMMatrix rotateAxisAngleSelf(double x, double y);
@JsMethod(name="rotateAxisAngleSelf")
DOMMatrix rotateAxisAngleSelf(double x, double y, double z);
@JsMethod(name="rotateAxisAngleSelf")
DOMMatrix rotateAxisAngleSelf(double x, double y, double z, double angle);
@JsMethod(name="rotateFromVectorSelf")
DOMMatrix rotateFromVectorSelf();
@JsMethod(name="rotateFromVectorSelf")
DOMMatrix rotateFromVectorSelf(double x);
@JsMethod(name="rotateFromVectorSelf")
DOMMatrix rotateFromVectorSelf(double x, double y);
@JsMethod(name="rotateSelf")
DOMMatrix rotateSelf();
@JsMethod(name="rotateSelf")
DOMMatrix rotateSelf(double rotX);
@JsMethod(name="rotateSelf")
DOMMatrix rotateSelf(double rotX, double rotY);
@JsMethod(name="rotateSelf")
DOMMatrix rotateSelf(double rotX, double rotY, double rotZ);
@JsMethod(name="scale3dSelf")
DOMMatrix scale3dSelf();
@JsMethod(name="scale3dSelf")
DOMMatrix scale3dSelf(double scale);
@JsMethod(name="scale3dSelf")
DOMMatrix scale3dSelf(double scale, double originX);
@JsMethod(name="scale3dSelf")
DOMMatrix scale3dSelf(double scale, double originX, double originY);
@JsMethod(name="scale3dSelf")
DOMMatrix scale3dSelf(double scale, double originX, double originY, double originZ);
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf();
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf(double scaleX);
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf(double scaleX, double scaleY);
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ);
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX);
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX, double originY);
@JsMethod(name="scaleSelf")
DOMMatrix scaleSelf(double scaleX, double scaleY, double scaleZ, double originX, double originY, double originZ);
@JsMethod(name="setMatrixValue")
DOMMatrix setMatrixValue(String transformList);
@JsMethod(name="skewXSelf")
DOMMatrix skewXSelf();
@JsMethod(name="skewXSelf")
DOMMatrix skewXSelf(double sx);
@JsMethod(name="skewYSelf")
DOMMatrix skewYSelf();
@JsMethod(name="skewYSelf")
DOMMatrix skewYSelf(double sy);
@JsMethod(name="translateSelf")
DOMMatrix translateSelf();
@JsMethod(name="translateSelf")
DOMMatrix translateSelf(double tx);
@JsMethod(name="translateSelf")
DOMMatrix translateSelf(double tx, double ty);
@JsMethod(name="translateSelf")
DOMMatrix translateSelf(double tx, double ty, double tz);
@JsOverlay
public static DOMMatrix getPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMMatrix", com.user00.domjnate.util.EmptyInterface.class);
  return com.user00.domjnate.util.Js.getMember(obj, "prototype", DOMMatrix.class);
}
@JsOverlay
public static void setPrototype(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMMatrix val) {
  java.lang.Object obj = com.user00.domjnate.util.Js.getMember(_win, "DOMMatrix", com.user00.domjnate.util.EmptyInterface.class);
  com.user00.domjnate.util.Js.setMember(obj, "prototype", val);
}
@JsOverlay
public static DOMMatrix fromFloat32Array(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Float32Array array32) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrix", "fromFloat32Array", DOMMatrix.class, array32);
}
@JsOverlay
public static DOMMatrix fromFloat64Array(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Float64Array array64) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrix", "fromFloat64Array", DOMMatrix.class, array64);
}
@JsOverlay
public static DOMMatrix fromMatrix(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrix", "fromMatrix", DOMMatrix.class);
}
@JsOverlay
public static DOMMatrix fromMatrix(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, DOMMatrixInit other) {
  return com.user00.domjnate.util.Js.callStaticMethod(_win, "DOMMatrix", "fromMatrix", DOMMatrix.class, other);
}
@JsOverlay
public static DOMMatrix _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMMatrix");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMMatrix.class);
}
@JsOverlay
public static DOMMatrix _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, Array<Double> init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMMatrix");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMMatrix.class, init);
}
@JsOverlay
public static DOMMatrix _new(com.user00.domjnate.api.WindowOrWorkerGlobalScope _win, String init) {
  java.lang.Object constructor = com.user00.domjnate.util.Js.getConstructor(_win, "DOMMatrix");
  return com.user00.domjnate.util.Js.construct(_win, constructor, DOMMatrix.class, init);
}
}
