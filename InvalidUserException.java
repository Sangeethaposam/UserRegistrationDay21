package com.bridzelabz.userRegistration;

public class InvalidUserException extends Exception {
	enum enumType{
		FIRSTNAME,LASTNAME,EMAIL,PASSWORD,MOBILENUMBER
	}

	enumType type;
	public InvalidUserException(enumType type ) {
		super();
		this.type = type;
	}  
}
