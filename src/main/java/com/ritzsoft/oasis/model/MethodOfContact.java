package com.ritzsoft.oasis.model;

public enum MethodOfContact {
	PHONE("phone"), EMAIL("email"), SMS("sms");

	private String method;

	private String getMethod() {
		return this.method;
	}

	MethodOfContact(String method) {
		this.method = method;
	}

}
