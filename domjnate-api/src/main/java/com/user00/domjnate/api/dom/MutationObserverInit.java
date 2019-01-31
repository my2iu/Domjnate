package com.user00.domjnate.api.dom;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="MutationObserverInit")
public interface MutationObserverInit
{
@JsProperty(name="attributeFilter")
com.user00.domjnate.api.Array<String> getAttributeFilter();
@JsProperty(name="attributeFilter")
void setAttributeFilter(com.user00.domjnate.api.Array<String> val);
@JsProperty(name="attributeOldValue")
Boolean getAttributeOldValue();
@JsProperty(name="attributeOldValue")
void setAttributeOldValue(Boolean val);
@JsProperty(name="attributes")
Boolean getAttributes();
@JsProperty(name="attributes")
void setAttributes(Boolean val);
@JsProperty(name="characterData")
Boolean getCharacterData();
@JsProperty(name="characterData")
void setCharacterData(Boolean val);
@JsProperty(name="characterDataOldValue")
Boolean getCharacterDataOldValue();
@JsProperty(name="characterDataOldValue")
void setCharacterDataOldValue(Boolean val);
@JsProperty(name="childList")
Boolean getChildList();
@JsProperty(name="childList")
void setChildList(Boolean val);
@JsProperty(name="subtree")
Boolean getSubtree();
@JsProperty(name="subtree")
void setSubtree(Boolean val);
}
