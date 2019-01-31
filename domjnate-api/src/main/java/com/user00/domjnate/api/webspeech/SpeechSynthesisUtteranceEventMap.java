package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechSynthesisUtteranceEventMap")
public interface SpeechSynthesisUtteranceEventMap
{
@JsProperty(name="boundary")
SpeechSynthesisEvent getBoundary();
@JsProperty(name="boundary")
void setBoundary(SpeechSynthesisEvent val);
@JsProperty(name="end")
SpeechSynthesisEvent getEnd();
@JsProperty(name="end")
void setEnd(SpeechSynthesisEvent val);
@JsProperty(name="error")
SpeechSynthesisErrorEvent getError();
@JsProperty(name="error")
void setError(SpeechSynthesisErrorEvent val);
@JsProperty(name="mark")
SpeechSynthesisEvent getMark();
@JsProperty(name="mark")
void setMark(SpeechSynthesisEvent val);
@JsProperty(name="pause")
SpeechSynthesisEvent getPause();
@JsProperty(name="pause")
void setPause(SpeechSynthesisEvent val);
@JsProperty(name="resume")
SpeechSynthesisEvent getResume();
@JsProperty(name="resume")
void setResume(SpeechSynthesisEvent val);
@JsProperty(name="start")
SpeechSynthesisEvent getStart();
@JsProperty(name="start")
void setStart(SpeechSynthesisEvent val);
}
