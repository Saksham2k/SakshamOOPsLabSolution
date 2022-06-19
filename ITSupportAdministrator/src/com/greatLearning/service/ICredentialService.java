package com.greatLearning.service;

import com.greatLearning.model.Employee;

public interface ICredentialService {
	String generatePassword();
	
	String generateEmailAddress(String firstName,String lastName,String department);
	
	void showCredentials(Employee employee,String emailAddress,String password);

	

}
