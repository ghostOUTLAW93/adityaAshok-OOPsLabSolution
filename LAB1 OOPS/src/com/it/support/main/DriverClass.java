package com.it.support.main;

import java.util.Scanner;
import com.it.support.model.Employee;
import com.it.support.service.CredentialServices;

public class DriverClass {

	public static void main(String[] args) {

		// Creating the instances of Scanner, Employee, and CredentialService class
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee("Aditya","Shahi");
		CredentialServices cs = new CredentialServices();

		System.out.println("Please enter the department from the following:");
		System.out.println(" 1.Technical\n 2.Admin\n 3.HR\n 4.Legal");
		int option = sc.nextInt();

		switch(option) {

		case 1: 
			cs.showCredentials(emp.getFirstName(), 
			cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"tech"),
			cs.generatePassword());
			break;

		case 2:
			cs.showCredentials(emp.getFirstName(), 
			cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"admin"),
			cs.generatePassword());
			break;

		case 3:
			cs.showCredentials(emp.getFirstName(), 
			cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"HR"),
			cs.generatePassword());
			break;

		case 4:
			cs.showCredentials(emp.getFirstName(), 
			cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"legal"),
			cs.generatePassword());
			break;

		default:
			System.out.println("Enter the valid department option!");

		}
		sc.close();
	}

}
