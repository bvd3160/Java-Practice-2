package leetcode_study_basic;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode challenge"));
	}
	
	public static String reverseVowels(String s) {
		String result = "";
		ArrayList<Character> vowelsTemp = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        for (int i = 0; i < s.length(); i++) {
			if(vowels.contains(s.charAt(i))){
				vowelsTemp.add(s.charAt(i));
			}
		}
        
        for (int j = 0; j < s.length(); j++) {
			if(!vowels.contains(s.charAt(j))) {
				result += s.charAt(j);
			}else {
				result += vowelsTemp.get(vowelsTemp.size()-1);
				vowelsTemp.remove(vowelsTemp.size()-1);
			}
		}
        
		return result;        
    }

}
