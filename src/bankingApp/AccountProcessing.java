package bankingApp;

import java.util.Scanner;

public class AccountProcessing extends User{
	
	private String bankName;
	private int accountId;
	private int accountPin;
	private double accountBalance;
	public static User user;

	public AccountProcessing(int accountId, User user) {
		super(userId, usersName, userPin);
		setBankName("Jean's BANK");
		setAccountBalance(1000.00);
		this.user = user;
		this.accountId = accountId;	
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("======"+getBankName());
		System.out.println("========================");
		System.out.println("Customer Name: "+user.getUsersName());
		System.out.println("========================");
		System.out.println("Amount Balance: "+getAccountBalance());
		System.out.println("======================== \n \n");
		System.out.println("WHAT WOULD YOU LIKE TO DO? \n \n");
		System.out.println("A: Withdraw Cash \nB: Deposit Cash \nC: Transfer Money \nE: Exit\n");
		System.out.println("======================== \n");
		
		String input = userInput.next().toLowerCase();
		
		if(input.equals("a")) {
			
		}else if(input.equals("b")) {
			
		}else if(input.equals("c")) {
			
		}else if(input.equals("e")) {
			System.out.println("Thank you for using Jean's ATM. See you soon!");
			System.exit(0);
		}else {
			System.out.println("That's not one of the options. Goodbye!");
		}
	}

}
