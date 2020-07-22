package com.wipro.ccbill.exception;

public class InputValidationException extends Exception {

	public String toString()
	{
		return "Invalid Input Data";
	}
	public InputValidationException(String str)
	{
		super(str);
		System.out.println(str);
	}
}
