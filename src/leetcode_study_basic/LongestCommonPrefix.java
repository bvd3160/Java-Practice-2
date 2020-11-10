package leetcode_study_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import javax.sql.CommonDataSource;

public class LongestCommonPrefix {
	
	/*
	 * Write a function to find the longest common prefix string amongst an array of
	 * strings.
	 * 
	 * If there is no common prefix, return an empty string "".
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
	 * 
	 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
	 * common prefix among the input strings.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= strs.length <= 200 
	 * 0 <= strs[i].length <= 200 
	 * strs[i] consists of only	 * lower-case English letters.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testSTRS = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(testSTRS));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		Stack<Character> tempChars = new Stack<Character>();
		if(strs.length >= 1 && strs.length <= 200) {
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].length() >= 1 && strs[i].length() <= 200) {
					for (int j = 0; j < strs[i].length(); j++) {
						if(!vowels.contains(strs[i].charAt(j))) {
							if(!tempChars.contains(strs[i].charAt(j))) {
								tempChars.push(strs[i].charAt(j));
							}
							
						}else {
							//tempChars.push(' ') ;
							break;
						}
					}
				}
			}
		}
		
		return tempChars.toString();        
    }
	
	//Not finished

}
