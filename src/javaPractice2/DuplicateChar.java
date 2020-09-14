package javaPractice2;

import java.util.ArrayList;

public class DuplicateChar {

	private static String str = "Oprahh";
	
	public DuplicateChar() {
		// TODO Auto-generated constructor stub
			
	}
	
	public static void main(String[] args) {
		findDuplicateChars(str);
	}
	private static void findDuplicateChars(String str2) {
		String characters = "";
		String duplicate = "";
		for (int i = 0; i < str2.length(); i++) {
			String current = Character.toString(str2.charAt(i));
			
			if(characters.contains(current) && !duplicate.contains(current)) {
				duplicate += current;
				System.out.print(duplicate + ", ");
			}
		}
	}
	
}
