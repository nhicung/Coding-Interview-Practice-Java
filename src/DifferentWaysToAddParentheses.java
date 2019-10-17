/*
DESCRIPTION:
		Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are +, - and *.
		
		Example 1:
		
		Input: "2-1-1"
		Output: [0, 2]
		Explanation: 
		((2-1)-1) = 0 
		(2-(1-1)) = 2
		Example 2:
		
		Input: "2*3-4*5"
		Output: [-34, -14, -10, -10, 10]
		Explanation: 
		(2*(3-(4*5))) = -34 
		((2*3)-(4*5)) = -14 
		((2*(3-4))*5) = -10 
		(2*((3-4)*5)) = -10 
		(((2*3)-4)*5) = 10
SOLUTION:
		Runtime: 2 ms, faster than 74.34% of Java online submissions for Different Ways to Add Parentheses.
		Memory Usage: 35 MB, less than 100.00% of Java online submissions for Different Ways to Add Parentheses.

 */



import java.util.*;

public class DifferentWaysToAddParentheses {
	Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
	
	public List<Integer> diffWaysToCompute(String input){
		if(map.containsKey(input)) {
			return map.get(input);
		}
		
		List<Integer> result = new ArrayList<Integer>();
		
		if(!input.contains("+") && !input.contains("*") && !input.contains("-")) {
			return map.get(input);
		}
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (!Character.isDigit(c)) {
				List<Integer> left = diffWaysToCompute(input.substring(0,i+1));
				List<Integer> right = diffWaysToCompute(input.substring(i+1,input.length()));
				for (int x: left) {
					for(int y: right) {
						if (c =='+') {
							result.add(x+y);
						} else if (c == '-') {
							result.add(x-y);
						} else if (c == '*') {
							result.add(x*y);
						}
					}
				}
			}
		}
		map.put(input, result);
		return result;
	}
}
