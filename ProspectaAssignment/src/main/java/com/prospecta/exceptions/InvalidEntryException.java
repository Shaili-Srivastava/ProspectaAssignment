package com.prospecta.exceptions;

public class InvalidEntryException extends Exception{

	

	public InvalidEntryException( ){
		
	}
	
	public  InvalidEntryException(String msg) {
		super(msg);
	}

}
