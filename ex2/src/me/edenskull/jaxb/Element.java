package me.edenskull.jaxb;

public class Element {
	private String _name;
	private String _type;
	private String __prefix;


	// Getter Methods

	public String get_name() {
		return _name;
	}

	public String get_type() {
		return _type;
	}

	public String get__prefix() {
		return __prefix;
	}

	// Setter Methods

	public void set_name(String _name) {
		this._name = _name;
	}

	public void set_type(String _type) {
		this._type = _type;
	}

	public void set__prefix(String __prefix) {
		this.__prefix = __prefix;
	}
}
