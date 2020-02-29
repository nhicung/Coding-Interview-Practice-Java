/*
PROBLEM DESCRIPTION:
	The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
	
	F(0) = 0,   F(1) = 1
	F(N) = F(N - 1) + F(N - 2), for N > 1.
	Given N, calculate F(N).
	
MY SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
	Memory Usage: 33.1 MB, less than 5.51% of Java online submissions for Fibonacci Number.

 */


package Trial;

public class DPFibonacci {
	public int fib(int N) {
		if (N == 0) {
			return 0;
		}
		int[] res = new int[N + 2];
		res[0] = 0;
		res[1] = 1;

		for (int i = 2; i < res.length; i++) {
			res[i] = res[i - 1] + res[i - 2];
		}
		return res[N];
	}
}