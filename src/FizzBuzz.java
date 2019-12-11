import java.util.*;

/*
DESCRIPTION:
	Write a program that outputs the string representation of numbers from 1 to n.
	
	But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
	
	Example:
	
	n = 15,
	
	Return:
	[
	    "1",
	    "2",
	    "Fizz",
	    "4",
	    "Buzz",
	    "Fizz",
	    "7",
	    "8",
	    "Fizz",
	    "Buzz",
	    "11",
	    "Fizz",
	    "13",
	    "14",
	    "FizzBuzz"
	]
SOLUTION:
Runtime: 1 ms, faster than 99.81% of Java online submissions for Fizz Buzz.
Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Fizz Buzz.
 */
public class FizzBuzz {
	public List<String> fizzBuzz(int n){
		List<String> result = new ArrayList<String>();
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				result.add("Fizz");
			} else if ( i % 5 == 0) {
				result.add("Buzz");
			} else if (i % 15 ==0) {
				result.add("FizzBuzz");
			} else {
				result.add(Integer.toString(i));
			}
		}
		return result;
	}
}
