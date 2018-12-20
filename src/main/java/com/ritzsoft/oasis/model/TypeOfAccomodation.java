package com.ritzsoft.oasis.model;

public enum TypeOfAccomodation {
	APARTMENT("apartment"), HOUSE("house"), ROOM("room");

	private String type;

	public String getType() {
		return this.type;
	}

	private TypeOfAccomodation(String type) {
		this.type = type;
	}
}
