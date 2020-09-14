package javaPractice2;

import java.util.Scanner;

public class UserInput {

	public UserInput() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("We are going to multiply TWO numbers!");	
		System.out.println("Please enter the first number: ");
		int firstNum = scan.nextInt();
		System.out.println("Please enter the second number:");
		int secondNum = scan.nextInt();
		System.out.println("The result is: "+firstNum +" x "+secondNum+" = "+(firstNum*secondNum));
		
	}

}
