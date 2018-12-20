package com.ritzsoft.oasis.model;

public enum MaritalStatus {
	MARRIED("married"), SINGLE("single"), WIDOWED("widowed");

	private String status;

	public String getStatus() {
		return this.status;
	}

	private MaritalStatus(String status) {
		this.status = status;
	}

}
