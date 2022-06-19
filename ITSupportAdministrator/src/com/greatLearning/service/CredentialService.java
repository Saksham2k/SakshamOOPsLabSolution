package com.greatLearning.service;

import java.util.Random;

import com.greatLearning.model.Employee;

public class CredentialService implements ICredentialService {

	@Override
	public String generatePassword() {
		String capitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter="abcdefghijklmnopqrstuvwxyz";
		String numbers="1234567890";
		String special="!@#$&*?%";
		String values=capitalLetter+smallLetter+special+special+numbers+numbers+smallLetter;
		StringBuffer str=new StringBuffer();
		Random ran=new Random();
		for(int i=0;i<8;i++) {
			str.append(values.charAt(ran.nextInt(values.length())));
		}
		
		return str.toString();
	}

	@Override
	public String generateEmailAddress(String firstName,String lastName,String department) {
		firstName=firstName.toLowerCase();
		lastName=lastName.toLowerCase();
		return firstName+lastName+"@"+department+".abc.com";
	}

	public void showCredentials(Employee employee,String emailAddress,String password) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---> "+ emailAddress);
		System.out.println("Password ---> "+ password);
	}
	

}
