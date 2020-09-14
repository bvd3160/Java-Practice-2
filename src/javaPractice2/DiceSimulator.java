package javaPractice2;

import java.util.Random;

public class DiceSimulator {

	public DiceSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); //Java built in random number generator.
		
		int rolls = 1; //rolls start from 1 not 0.
		while(rolls <= 10) { //set the ceiling - could even ask user for this ceiling. 
		int dice = random.nextInt(7); //HOW A DICE ROLL IS PERFORMED.
		if(dice != 0) { //I don't want any zeros in my results.
		  System.out.println("On Roll: "+rolls+" Dice Produced: "+dice);
		}else { //if a Zero is rolled, then we roll again! 
			  dice = random.nextInt(7); 
			}
		  rolls++; //count a roll complete once a printout is made. 
		}
		  
	}
	
		 
}
