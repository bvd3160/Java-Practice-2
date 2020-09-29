package bankATM;

import java.util.Scanner;


public class ATM {
	
	private static BankAccount account;
	private static Card card;

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
		
		//ATM personalAtm =  new ATM(new Card(cName, null, cid, cPin));
		account = new BankAccount("Jill's Bank", cName, 123, 123);
		account.setAccountBalance(100.0);
		card = new Card(account.getBankName(), account.getAccountId(), account.getAccountPin());
		ATM myAtm = new ATM(card);
		
		if(myAtm.card.getAccountId() == cid  && myAtm.card.getAccountPin() == cPin) {
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
