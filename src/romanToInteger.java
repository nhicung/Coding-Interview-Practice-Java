/*
DESCRIPTION:
	Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
	
	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
	
	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	
	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
	
	Example 1:
	
	Input: "III"
	Output: 3
	Example 2:
	
	Input: "IV"
	Output: 4
	Example 3:
	
	Input: "IX"
	Output: 9
	Example 4:
	
	Input: "LVIII"
	Output: 58
	Explanation: L = 50, V= 5, III = 3.
	Example 5:
	
	Input: "MCMXCIV"
	Output: 1994
	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	
	
MY SOLUTION:
	Runtime: 5 ms, faster than 59.29% of Java online submissions for Roman to Integer.
	Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Roman to Integer.

 */




public class RomanToInteger {
	public int romanToInt(String s) {
		int result = 0;
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);

			if (s.length() - i > 1) {
				String sNew = s.substring(i, i + 2);

				if (sNew.equals("IV")) {
					result += 4;
					i += 2;
					continue;
				}
				if (sNew.equals("IX")) {
					result += 9;
					i += 2;
					continue;
				}
				if (sNew.equals("XL")) {
					result += 40;
					i += 2;
					continue;
				}
				if (sNew.equals("XC")) {
					result += 90;
					i += 2;
					continue;
				}
				if (sNew.equals("CD")) {
					result += 400;
					i += 2;
					continue;
				}
				if (sNew.equals("CM")) {
					result += 900;
					i += 2;
					continue;
				}
			}

			if (c == 'I') {
				result += 1;
			}
			if (c == 'V') {
				result += 5;
			}
			if (c == 'X') {
				result += 10;
			}
			if (c == 'L') {
				result += 50;
			}
			if (c == 'C') {
				result += 100;
			}
			if (c == 'D') {
				result += 500;
			}
			if (c == 'M') {
				result += 1000;
			}
			i++;
		}
		return result;
	}
}
