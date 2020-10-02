package fundamentals;

import java.util.Scanner;


public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Factorials are made by recursively multiplying. E.g: 5! = 5 x 4 x 3 x 2 x 1 = 120
		
		//We can achieve this by using a method that calls on itself
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a number you'd like to factorise");
		int input = userInput.nextInt();
		System.out.println("Okay, so: "+input+"! = "+factorial(input));
		main(args);
	}

	private static int factorial(int x) {
		if(x == 1){
			return 1;
		}else {
			return x * factorial(x - 1);
		}
	}

}
