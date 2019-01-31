package com.user00.domjnate.api.webspeech;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="SpeechRecognitionEventMap")
public interface SpeechRecognitionEventMap
{
@JsProperty(name="audioend")
com.user00.domjnate.api.dom.Event getAudioend();
@JsProperty(name="audioend")
void setAudioend(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="audiostart")
com.user00.domjnate.api.dom.Event getAudiostart();
@JsProperty(name="audiostart")
void setAudiostart(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="end")
com.user00.domjnate.api.dom.Event getEnd();
@JsProperty(name="end")
void setEnd(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="error")
SpeechRecognitionError getError();
@JsProperty(name="error")
void setError(SpeechRecognitionError val);
@JsProperty(name="nomatch")
SpeechRecognitionEvent getNomatch();
@JsProperty(name="nomatch")
void setNomatch(SpeechRecognitionEvent val);
@JsProperty(name="result")
SpeechRecognitionEvent getResult();
@JsProperty(name="result")
void setResult(SpeechRecognitionEvent val);
@JsProperty(name="soundend")
com.user00.domjnate.api.dom.Event getSoundend();
@JsProperty(name="soundend")
void setSoundend(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="soundstart")
com.user00.domjnate.api.dom.Event getSoundstart();
@JsProperty(name="soundstart")
void setSoundstart(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="speechend")
com.user00.domjnate.api.dom.Event getSpeechend();
@JsProperty(name="speechend")
void setSpeechend(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="speechstart")
com.user00.domjnate.api.dom.Event getSpeechstart();
@JsProperty(name="speechstart")
void setSpeechstart(com.user00.domjnate.api.dom.Event val);
@JsProperty(name="start")
com.user00.domjnate.api.dom.Event getStart();
@JsProperty(name="start")
void setStart(com.user00.domjnate.api.dom.Event val);
}
