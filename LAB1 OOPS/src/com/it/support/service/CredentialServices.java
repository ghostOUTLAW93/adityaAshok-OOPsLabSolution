package com.it.support.service;

import java.util.Random;

public class CredentialServices{


	public CredentialServices() {
		/*
		 * This class generates the credentials of the employee;
		 * for say, the emailId and the password;
		 * and display those credentials to the user employee.
		 */
	}

	//method to generate random 8-digit password
	public char[] generatePassword() {

		String set1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String set2 = "abcdefghijklmnopqrstuvwxyz";
		String set3 = "0123456789";
		String set4 = "!@#$%^&*+=-/";
		String set = set1 + set2 + set3 + set4;

		Random random = new Random();

		char[] password = new char[8];

		for(int i = 0; i < 8; i++) {
			//random.nextInt to generate the random index from the length of the given String set;
			//and this index provides the random character for 8-digit char array of password.
			password[i] = set.charAt(random.nextInt(set.length()));		
		}
		//returning password 
		return password;
	}

	//method to generate the Email credential of the Employee
	public String generateEmailAddress(String fName, String lName, String dept) {

		return (fName+lName+"@"+dept+".abc.com");

	}

	//method to display the credentials of the employee
	public void showCredentials(String fName,String email, char[] passwrd) {

		System.out.println("\nDear "+fName+" your generated credentials are as follows:");
		System.out.println("Email   ---->"+email);
		System.out.print("Password --->");
		System.out.println(passwrd);

	}

}
