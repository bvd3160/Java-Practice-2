package bankATM;

import java.util.Scanner;


public class BankAccount{
	
	private Scanner userInput;
	private String bankName;
	private String custName;
	private int accountId;
	private int accountPin;
	private double accountBalance;

	public BankAccount(String bankName, String custName, int accountId, int accountPin) {
		this.bankName = bankName;
		this.custName = custName;
		this.accountId = accountId;
		this.accountPin = accountPin;
		userInput = new Scanner(System.in);
		
		/*
		 * 
		setBankName("Jean's Bank");
		setCustName("Jeanelle");
		setAccountId(123);
		setAccountPin(123);
		setAccountBalance(1000.00);
		*
		*/
		
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountPin() {
		return accountPin;
	}

	public void setAccountPin(int accountPin) {
		this.accountPin = accountPin;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void displayAccountInfo() {
		System.out.println("========================");
		System.out.println("======"+getBankName());
		System.out.println("========================");
		System.out.println("Customer Name: "+getCustName());
		System.out.println("========================");
		System.out.println("Amount Balance: "+getAccountBalance());
		System.out.println("======================== \n \n");
		System.out.println("WHAT WOULD YOU LIKE TO DO?");
		System.out.println("A: Withdraw Cash \nB: Deposit Cash \nC: Transfer Money \n");
		
		if(userInput.next().toLowerCase().equals("a")) {
			
		}else if(userInput.next().toLowerCase().equals("b")) {
			
		}else if(userInput.next().toLowerCase().equals("c")) {
			
		}else {
			System.out.println("That's not one of the options. Goodbye!");
		}
	}

}
