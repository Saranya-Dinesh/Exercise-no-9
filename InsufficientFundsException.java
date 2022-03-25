package org.kiot.insufficientfundsexception;

public class InsufficientFundsException extends Exception{
	String errorMessage;

	public InsufficientFundsException(String errorMessage) {
		
		super();
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	
}
