/*
DESCRIPTION:
	Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
	
	Example 1:
	
	Input: 
	[
	  [1,1,1],
	  [1,0,1],
	  [1,1,1]
	]
	Output: 
	[
	  [1,0,1],
	  [0,0,0],
	  [1,0,1]
	]
	Example 2:
	
	Input: 
	[
	  [0,1,2,0],
	  [3,4,5,2],
	  [1,3,1,5]
	]
	Output: 
	[
	  [0,0,0,0],
	  [0,4,5,0],
	  [0,3,1,0]
	]
	Follow up:
	
	A straight forward solution using O(mn) space is probably a bad idea.
	A simple improvement uses O(m + n) space, but still not the best solution.
	Could you devise a constant space solution?

SOLUTION:
	Runtime: 2 ms, faster than 43.37% of Java online submissions for Set Matrix Zeroes.
	Memory Usage: 49.4 MB, less than 17.14% of Java online submissions for Set Matrix Zeroes.
 */



public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		boolean checkCol = false;
		boolean checkRow = false;
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				checkCol = true;
				break;
			}
		}
		if (checkCol) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;		
			}
		}
		
		for (int j = 0; j < matrix[0].length;j++ ) {
			if(matrix[0][j] == 0) {
				checkRow = true;
				break;
			}
		}
		
		if (checkRow) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[0][j] =0;
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
	}

}
