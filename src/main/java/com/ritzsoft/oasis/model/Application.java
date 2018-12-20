package com.ritzsoft.oasis.model;

import java.sql.Date;

import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.NotEmpty;

@MappedSuperclass
public class Application extends BaseEntity {

	@NotEmpty
	private String typeOfPlace;
	private String lengthOfStay;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String nationalID;
	private Date dob;
	@NotEmpty
	private String gender;
	private String maritalStatus;
	private String cellphone;
	private String occupation;
	@NotEmpty
	private String employer;
	private String workphone;
	private String workAddress;
	private int lengthOfEmployment;
	@NotEmpty
	private double netMonthlyIncome;
	@NotEmpty
	private String taxNumber;
	@NotEmpty
	private String preferredMethodOfContact;

	public String getTypeOfPlace() {
		return typeOfPlace;
	}

	public void setTypeOfPlace(String typeOfPlace) {
		this.typeOfPlace = typeOfPlace;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getWorkphone() {
		return workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public int getLengthOfEmployment() {
		return lengthOfEmployment;
	}

	public void setLengthOfEmployment(int lengthOfEmployment) {
		this.lengthOfEmployment = lengthOfEmployment;
	}

	public double getNetMonthlyIncome() {
		return netMonthlyIncome;
	}

	public void setNetMonthlyIncome(double netMonthlyIncome) {
		this.netMonthlyIncome = netMonthlyIncome;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getPreferredMethodOfContact() {
		return preferredMethodOfContact;
	}

	public void setPreferredMethodOfContact(String preferredMethodOfContact) {
		this.preferredMethodOfContact = preferredMethodOfContact;
	}

}
