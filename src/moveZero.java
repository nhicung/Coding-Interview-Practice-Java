/*
DESCRIPTION
	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	
	Example:
	
	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Note:
	
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
	
MY SOLUTION
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
	Memory Usage: 38.1 MB, less than 82.14% of Java online submissions for Move Zeroes.

 */


public class MoveZero {
	public void moveZeroes(int[] nums) {
		/*
		 * int a = nums.length-1; int count = 0; for (int i = 0; i <nums.length; i++){
		 * count++; } int i =0; while(i< nums.length){ if (nums[i] == 0 && count >0){
		 * for ( int j = i; j < nums.length-1; j++){ nums[j] =nums[j+1]; } nums[a]=0;
		 * count--; }else{ i++; } }
		 */

		int i = 0;
		int j = 1;
		while (j < nums.length) {
			if (nums[i] == 0 && nums[j] != 0) {
				int a = nums[i];
				nums[i] = nums[j];
				nums[j] = a;
				i++;
				j++;
			} else if (nums[j] == 0 && nums[i] != 0) {
				i++;
				j++;
			} else if (nums[i] == 0 && nums[j] == 0) {
				j++;
			} else if (nums[i] != 0 && nums[j] != 0) {
				i++;
				j++;
			}
		}
	}
}
