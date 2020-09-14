package javaPractice2;

import java.util.*;

public class ReverseString {

	private static String userInput = "Honey";

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString(userInput);
	}

	private static void reverseString(String userInput2) {
		// TODO Auto-generated method stub
		String reversed = "";
		// 1: reverse the string passed through parameter that is userInput2
		for (int i = userInput2.length() - 1; i >= 0; i--) {
			reversed += userInput2.charAt(i);
		}
		// 2: Print the result
		System.out.println("The reverse of '"+userInput2+"' is: "+reversed);
	}

}
