package com.optum.customer.dto;

import java.io.Serializable;

public class CustomerUI implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3266524153804721857L;
	private String firstName;
	private String lastName;
	
	public CustomerUI(String firstName, String lastName) {
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
}
