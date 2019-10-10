/*
DESCRIPTION:
	Given a column title as appear in an Excel sheet, return its corresponding column number.
	
	For example:
	
	    A -> 1
	    B -> 2
	    C -> 3
	    ...
	    Z -> 26
	    AA -> 27
	    AB -> 28 
	    ...
	Example 1:
	
	Input: "A"
	Output: 1
	Example 2:
	
	Input: "AB"
	Output: 28
	Example 3:
	
	Input: "ZY"
	Output: 701
SOLUTION:
	Runtime: 1 ms, faster than 99.98% of Java online submissions for Excel Sheet Column Number.
	Memory Usage: 36 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.

 */
package excelSheetColumnNumber;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int result = 0; 
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + s.charAt(i) - 'A' +1;
		}
		return result;
	}
}
