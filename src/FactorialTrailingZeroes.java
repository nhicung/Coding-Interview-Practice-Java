/*
DESCRIPTION:
	Given an integer n, return the number of trailing zeroes in n!.
	
	Example 1:
	
	Input: 3
	Output: 0
	Explanation: 3! = 6, no trailing zero.
	Example 2:
	
	Input: 5
	Output: 1
	Explanation: 5! = 120, one trailing zero.
	Note: Your solution should be in logarithmic time complexity.
	
SOLUTION:
	Runtime: 1 ms, faster than 46.47% of Java online submissions for Factorial Trailing Zeroes.
	Memory Usage: 33.2 MB, less than 7.69% of Java online submissions for Factorial Trailing Zeroes.

 */

public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int result = 0;
		while (n > 0) {
			result += (n /= 5);
		}
		return result;
	}
}
