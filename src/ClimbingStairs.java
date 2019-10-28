/*
DESCRIPTION:

	You are climbing a stair case. It takes n steps to reach to the top.
	
	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	
	Note: Given n will be a positive integer.
	
	Example 1:
	
	Input: 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	Example 2:
	
	Input: 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step
	
SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
	Memory Usage: 33 MB, less than 5.26% of Java online submissions for Climbing Stairs.

 */
public class ClimbingStairs {
	public int climbStairs(int n) {
		// if there is 1 stair to take, return 1 way
		if (n == 1) {
			return n;
		}
		//make an int array to store the number of ways to climb up n stairs. 
		//the array has length n + 1, starting with value 1.
		//go through for loop, update the value of each index in the array. Each value equals to 
		// the sum of two previous ones.
		// the last value of the array is the answer of the question.
		int[] cache = new int[n+1];
		cache[0] = 1;
		cache[1] = 1;
		for (int i = 0; i < cache.length; i++) {
			cache[i] = cache[i-1] +cache[1-2];
		}
		return cache[n];
	}

}
