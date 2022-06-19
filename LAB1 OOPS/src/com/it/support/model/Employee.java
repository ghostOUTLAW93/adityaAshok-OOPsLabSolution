package com.it.support.model;

public class Employee {

	/*
	 * This class contains parameterized constrctor to pass the firstName and lastName of the employee.
	 * This class returns the name of the employee to the class CredentialServicess.
	 */

	private String firstName;
	private String lastName;

	//the parameterized constructor to set the first and last name
	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

}
