# CreditCardBillGenerator
Project Objective:
Create a console based Java application that would allow users to generate CreditCard bill based on annual interest rate for the given month.
Project Design:
A. System Design:
Name of the package	Usage
com.wipro.ccbill.entity	This package will contains the credit card bill and transaction related classes
com.wipro.ccbill.exception	This package will contains the user defined exception class
com.wipro.ccbill.main	This package will contains the MainClass that is used to test the application
 
Package: com.wipro.ccbill.exception
Class	Method and Variables	Description
InputValidationException	 	An Exception Class
 	public String toString()	Override toString() method such that it Returns the message “Invalid Input Data”
 
 
Package: com.wipro.ccbill.entity
Class	Method and Variables	Description
Transaction	 	 
 	private String creditCardNo	 
 	private Date dateOfTransaction	java.util.Date
 	private String transactionDesc	 
 	private double transactionAmount	 
 	private String transactionType	 
 	public Transaction ()	No args constructor
 	public Transaction (String creditCardNo, Date dateOfTransaction, String transactionDesc, double transactionAmount, String transactionType)	Overloaded constructor to initialize all the member variables
 	Create getters and setters	Right click on eclipse and generate getters and setters from Source
 
Package: com.wipro.ccbill.entity
Class	Method and Variables	Description
CreditCardBill	 	 
 	private String creditCardNo	 
 	private String customerId	 
 	private Date billDate	 
 	private Transaction monthTransactions[]	object array of Transaction class
 	public CreditCardBill ()	No args constructor
 	public CreditCardBill (String creditCardNo, String customerId, Date BillDate, Transaction monthTransactions[])	Overloaded constructor to initialize the input string
 	public double getTotalAmount(String transactionType)	This method iterates throughmonthTransactions[] and returns the total amount of the given transaction type
Valid transaction Type
DB- amount spent on card
CR- amount paid to card
If given transactionType is not CR or DB return 0
 	public double calculateBillAmount()	This method calls the
1.       Call validateData method, if it returns “valid” proceed to step 2 else handle the exception and return 0.0
2.        Check whether the monthsTransaction is not null and array length is more than 0 and proceed to step 3
else if there are no transactions for the month return 0.0
3.       getTotalAmount with debit(DB) type and gets the total amount spend on card.
4.       getTotalAmount with credit(CR) type and gets the total amount paid to card.
5.       Difference is the outstanding to be paid
6.       Calculate the interest for the outstanding using the given formula
Interest calculated = (outstanding amount x 19.9% per year / 12)
7.       Add up outstanding amount and interest calculated as bill amount and return the same
 	public String validateData() throws InputValidationException	This checks whether the given data is valid or not.
1.       CreditCardNo should not be null
2.       CreditCardNo should be of length 16 exactly
3.       CustomerId should not be null
4.       CustomerId should be of length 6 minimum
•         If any of these condition fails the function should throwInputValidationException
•         If all condition passes return “valid”.
 
 
Package : com.wipro.ccbill.main
Class	Method and Variables	Description
MainClass	 	Main Class
 	public static void main(String[] args)	Checks the application:
Creates CreditCardBill object and passes input to all the fields.
Gets the total bill amount to be paid.
Note: Sample code given below
 
 
