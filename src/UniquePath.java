/*
DESCRIPTION:
	A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

	The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
	
	How many possible unique paths are there?
	
	Example 1:

	Input: m = 3, n = 2
	Output: 3
	Explanation:
	From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
	1. Right -> Right -> Down
	2. Right -> Down -> Right
	3. Down -> Right -> Right
	Example 2:
	
	Input: m = 7, n = 3
	Output: 28
	
SOLUTION:
	
 */

public class UniquePath {
	public int uniquePaths( int m, int n) {
		// make an 2D array to store the total number of paths to that location
		int[][] path = new int[m][n];
		
		// initialize the values in the whole 1st row to be 1
		for (int i = 0; i < m; i++) {
			path[m][0] = 1;
		}
		
		// initialize the values in the whole 1st column to be 1
		for (int i = 0; i < n; i++) {
			path[i][n] = 1;
		}
		
		// go through the whole array and update each index with the previous adjacent index on top
		// and to the left of it. 
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				path[m][n] = path[m-1][n] + path[m][n-1];
			}
		}
		// return the value of the last index of the array
		return path[m-1][n-1];
	}
}
