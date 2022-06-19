package com.greatLearning.driver;

import com.greatLearning.service.CredentialService;
import com.greatLearning.model.Employee;
import java.util.Scanner;

public class DriverClass {
	private static final CredentialService cs = new CredentialService();
	private static final Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		String firstName;
		String lastName;
		System.out.print("Enter your first name: ");
		firstName=sc.nextLine();
		System.out.print("Enter your last name: ");
		lastName=sc.nextLine();
		Employee emp=new Employee(firstName,lastName);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		String arr=cs.generatePassword();
		String email;
		
		switch(option) {
		case 1:
			email=cs.generateEmailAddress(firstName, lastName, "tech");
			cs.showCredentials(emp, email, arr);
			break;
		case 2:
			email=cs.generateEmailAddress(firstName, lastName, "admin");
			cs.showCredentials(emp, email, arr);
			break;
		case 3:
			email=cs.generateEmailAddress(firstName, lastName, "hr");
			cs.showCredentials(emp, email, arr);
			break;
		case 4:
			email=cs.generateEmailAddress(firstName, lastName, "legal");
			cs.showCredentials(emp, email, arr);
			
		}
	}
}
