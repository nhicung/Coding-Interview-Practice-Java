/*
 PROBLEM DESCRIPTION:
		Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
		
		Example 1:
		
		Input: 121
		Output: true
		Example 2:
		
		Input: -121
		Output: false
		Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
		Example 3:
		
		Input: 10
		Output: false
		Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
		
		
MY SOLUTION:
		Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
		Memory Usage: 36.4 MB, less than 5.02% of Java online submissions for Palindrome Number.

 */
package palindromeNumber;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertNumber = 0;
		while (revertNumber < x) {
			revertNumber = revertNumber * 10 + x % 10;
			x = x /= 10;
		}
		if (x == revertNumber || x == revertNumber / 10) {
			return true;
		}
		return false;
	}
}
