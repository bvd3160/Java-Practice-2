package javaPractice2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdayCalculator {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Please enter your birthyear!");
		int year = userInput.nextInt();
		System.out.println("Please enter your birth month now!");
		int month = userInput.nextInt();
		System.out.println("Please enter your birth day too!");
		int day = userInput.nextInt();
		
		LocalDate todaysDate = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		
		Period bc = Period.between(birthday, todaysDate);
		System.out.println("Well "+name+", your age is exactly: "+bc.getYears()+" YEARS, "+
				bc.getMonths()+" MONTHS, "+bc.getDays()+" DAYS.");		
	}

}
