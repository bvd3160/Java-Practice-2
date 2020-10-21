package leetcode_study_basic;

import java.util.Arrays;

public class TwoSum {
	
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * 
	 * 
	 * Example 1:
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1]. 
	 * 
	 * Example 2:
	 * * Input: nums = [3,2,4], target = 6 Output: [1,2] 
	 * 
	 * Example 3:
	 * * Input: nums = [3,3], target = 6 Output: [0,1]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 2 <= nums.length <= 105 -109 <= nums[i] <= 109 -109 <= target <= 109 Only one
	 * valid answer exists.
	 */

	public static void main(String[] args) {
		int[] input1 = {2,7,11,15};
		int target1 = 9;
		System.out.println(Arrays.toString(twoSum(input1, target1)));
		
		int[] input2 = {3,2,4};
		int target2 = 6;
		System.out.println(Arrays.toString(twoSum(input2, target2)));
		
		int[] input3 = {3,3};
		int target3 = 6;
		System.out.println(Arrays.toString(twoSum(input3, target3)));
		
	}
	
	
	/**
	 * Take an array of numbers and find the target number by adding 
	 * 2 numbers in the array, returning where you found them
	 * @param nums: numbers to be searched
	 * @param target: sum to be found
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {          
        int firstNum = 0;
        int secondNum = 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            firstNum = nums[i];  
            for(int j = 0; j < nums.length; j++){
                secondNum = nums[j];
                if((firstNum + secondNum) == target && i != j){
                    result[1] = i;
                    result[0] = j;
                }
            }
        }
        return result;
    }

}
