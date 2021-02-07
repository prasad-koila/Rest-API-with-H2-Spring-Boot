package com.prasad.samples.spring.rest.dto;

public class PartyDto {

	private String firstName;
	private String lastName;

	public PartyDto(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "PartyDto [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
