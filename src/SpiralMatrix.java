import java.util.*;

/*
DESCRIPTION:
	Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
	
	Example 1:
	
	Input:
	[
	 [ 1, 2, 3 ],
	 [ 4, 5, 6 ],
	 [ 7, 8, 9 ]
	]
	Output: [1,2,3,6,9,8,7,4,5]
	Example 2:
	
	Input:
	[
	  [1, 2, 3, 4],
	  [5, 6, 7, 8],
	  [9,10,11,12]
	]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
	Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Spiral Matrix.

 */
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix){
		List<Integer> result = new ArrayList<Integer>();
		
		if (matrix.length == 0) {
			return result;
		}
		
		int startR = 0; 
		int startC = 0;
		int endR = matrix.length;
		int endC = matrix[0].length;
		
		while (startR <= endR && startC <= endC) {
			for (int i = 0; i < endR; i++) {
				result.add(matrix[startR][i]);
			}
			startR++;
			
			for (int i = 0; i < endR; i++) {
				result.add(matrix[i][endC]);
			}
			endC--;
			
			if (startR <= endR) {
				for (int i = endC; i>0; i--) {
					result.add(matrix[endR][i]);
				}
				endR--;
			}
			
			if (startC <= endC) {
				for (int i = endR; i> 0; i++) {
					result.add(matrix[i][startC]);
				}
				startC++;
			}
		}
		
		return result;
		
	}
}
