/*
DESCRIPTION:
	Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.
	
	Example:
	
	nums = [1, 2, 3]
	target = 4
	
	The possible combination ways are:
	(1, 1, 1, 1)
	(1, 1, 2)
	(1, 2, 1)
	(1, 3)
	(2, 1, 1)
	(2, 2)
	(3, 1)
	
	Note that different sequences are counted as different combinations.
	
	Therefore the output is 7.

SOLUTION:
	Runtime: 1 ms, faster than 82.45% of Java online submissions for Combination Sum IV.
	Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Combination Sum IV.
 */
public class CombinationSum4 {
	public int combinationSum4(int[] nums, int target) {
        
		//make an int array to keep track of the total numbers of combination 
		// while traveling through the list 
        int[] cache = new int[target +1];
        // initialize first index with value 1
        cache[0] = 1;
        // use nested loop, update value in each index of array cache
        for (int i = 1; i < cache.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[j] <= i){
                    cache[i] += cache[i - nums[j]];
                }
            }
        }
        return cache[target];
    }
}
