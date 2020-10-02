package bankingApp;

import java.util.Scanner;


public class ATM {
	
	private static User user;
	private static AccountProcessing account;
	private static Card card;
	private static ATM myAtm;

	//ATM needs a card to start interactions
	public ATM(Card card) {
		this.card = card;
	}
	
	//Automatically run ATM when program starts at main method
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hi there, what's your name?");
		String cName = userInput.next();
		
		System.out.println("Alright "+cName+" what's your Id?");
		int cid = userInput.nextInt();
		
		System.out.println("Great! So what's your Pin?");
		int cPin = userInput.nextInt();
		
		//create a new user
		user = new User(cid, cName, cPin);
		//create a new account
		account = new AccountProcessing(cid, user);
		//create a new card
		card = new Card(account.getBankName(), account.getAccountId(), account.getAccountPin());
		//create a new ATM
		myAtm = new ATM(card);
		
		if(user.getUserId() == cid  && user.getUserPin() == cPin) {
			account.displayAccountInfo();
		}else {
			System.out.println("Sorry your accountID and Pin didn't match. Here is your card back");
			System.out.println("Would you like to try again? Yes|No");
			if(userInput.next().toLowerCase().equals("yes")) {
				main(args);
			}else {
				System.out.println("Thank you for visiting. Goodbye!");
				System.exit(0);
			}
		}
	}

}
