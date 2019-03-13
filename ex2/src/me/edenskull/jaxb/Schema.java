package me.edenskull.jaxb;

import java.util.ArrayList;

public class Schema {
	Element ElementObject;
	ArrayList<Object> complexType = new ArrayList<>();
	private String _attributeFormDefault;
	private String _elementFormDefault;
	private String _xmlns;
	private String __prefix;


	// Getter Methods

	public Element getElement() {
		return ElementObject;
	}

	public String get_attributeFormDefault() {
		return _attributeFormDefault;
	}

	public String get_elementFormDefault() {
		return _elementFormDefault;
	}

	public String get_xmlns() {
		return _xmlns;
	}

	public String get__prefix() {
		return __prefix;
	}

	// Setter Methods

	public void setElement(Element elementObject) {
		this.ElementObject = elementObject;
	}

	public void set_attributeFormDefault(String _attributeFormDefault) {
		this._attributeFormDefault = _attributeFormDefault;
	}

	public void set_elementFormDefault(String _elementFormDefault) {
		this._elementFormDefault = _elementFormDefault;
	}

	public void set_xmlns(String _xmlns) {
		this._xmlns = _xmlns;
	}

	public void set__prefix(String __prefix) {
		this.__prefix = __prefix;
	}
}
