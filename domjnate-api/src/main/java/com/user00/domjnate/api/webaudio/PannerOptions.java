package com.user00.domjnate.api.webaudio;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="PannerOptions")
public interface PannerOptions extends AudioNodeOptions
{
@JsProperty(name="coneInnerAngle")
Double getConeInnerAngle();
@JsProperty(name="coneInnerAngle")
void setConeInnerAngle(Double val);
@JsProperty(name="coneOuterAngle")
Double getConeOuterAngle();
@JsProperty(name="coneOuterAngle")
void setConeOuterAngle(Double val);
@JsProperty(name="coneOuterGain")
Double getConeOuterGain();
@JsProperty(name="coneOuterGain")
void setConeOuterGain(Double val);
@JsProperty(name="distanceModel")
String getDistanceModel();
@JsProperty(name="distanceModel")
void setDistanceModel(String val);
@JsProperty(name="maxDistance")
Double getMaxDistance();
@JsProperty(name="maxDistance")
void setMaxDistance(Double val);
@JsProperty(name="orientationX")
Double getOrientationX();
@JsProperty(name="orientationX")
void setOrientationX(Double val);
@JsProperty(name="orientationY")
Double getOrientationY();
@JsProperty(name="orientationY")
void setOrientationY(Double val);
@JsProperty(name="orientationZ")
Double getOrientationZ();
@JsProperty(name="orientationZ")
void setOrientationZ(Double val);
@JsProperty(name="panningModel")
String getPanningModel();
@JsProperty(name="panningModel")
void setPanningModel(String val);
@JsProperty(name="positionX")
Double getPositionX();
@JsProperty(name="positionX")
void setPositionX(Double val);
@JsProperty(name="positionY")
Double getPositionY();
@JsProperty(name="positionY")
void setPositionY(Double val);
@JsProperty(name="positionZ")
Double getPositionZ();
@JsProperty(name="positionZ")
void setPositionZ(Double val);
@JsProperty(name="refDistance")
Double getRefDistance();
@JsProperty(name="refDistance")
void setRefDistance(Double val);
@JsProperty(name="rolloffFactor")
Double getRolloffFactor();
@JsProperty(name="rolloffFactor")
void setRolloffFactor(Double val);
}
