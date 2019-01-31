package com.user00.domjnate.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MessageEventInit")
public interface MessageEventInit extends com.user00.domjnate.api.dom.EventInit
{
@JsProperty(name="data")
java.lang.Object getData();
@JsProperty(name="data")
void setData(java.lang.Object val);
@JsProperty(name="lastEventId")
String getLastEventId();
@JsProperty(name="lastEventId")
void setLastEventId(String val);
@JsProperty(name="origin")
String getOrigin();
@JsProperty(name="origin")
void setOrigin(String val);
@JsProperty(name="ports")
Array<MessagePort> getPorts();
@JsProperty(name="ports")
void setPorts(Array<MessagePort> val);
@JsProperty(name="source")
java.lang.Object getSource();
@JsProperty(name="source")
void setSource(java.lang.Object val);
}
