package com.ritzsoft.oasis.model;

public enum LengthOfStay {
	FEW_DAYS("few_days"), MONTH("1_month"), SIX_MONTHS("6_months"), YEAR("1_year"),
	MORE_THAN_ONE_YEAR("more_than_one_year");

	private String stay;

	public String getStay() {
		return this.stay;
	}

	private LengthOfStay(String stay) {
		this.stay = stay;
	}
}
