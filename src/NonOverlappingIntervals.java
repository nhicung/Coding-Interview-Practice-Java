import java.util.Arrays;

/*
DESCRIPTION:
	Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.	 
	
	Example 1:
	
	Input: [[1,2],[2,3],[3,4],[1,3]]
	Output: 1
	Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
	Example 2:
	
	Input: [[1,2],[1,2],[1,2]]
	Output: 2
	Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
	Example 3:
	
	Input: [[1,2],[2,3]]
	Output: 0
	Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
	 
	
	Note:
	
	You may assume the interval's end point is always bigger than its start point.
	Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
	
SOLUTION:
	Runtime: 37 ms, faster than 11.45% of Java online submissions for Non-overlapping Intervals.
	Memory Usage: 38.2 MB, less than 6.25% of Java online submissions for Non-overlapping Intervals.

 */
public class NonOverlappingIntervals {
	public int eraseOverlapIntervals(int[][] intervals) {
		// null case
		if (intervals.length == 0) {
			return 0;
		}
		// sort the array based on the second index of the inner array in increasing order
		// check each inner array, only count the one that has value of its first index less or equals to
		// the its previous' second index's value.
		// return the length - that total count
		int count = 1;
		Arrays.sort(intervals, (a,b) -> (a[1] -b[1]));
		int end = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (end <= intervals[i][0]) {
				count ++;
				end = intervals[i][1];
			}
		}
		return intervals.length - count;
	}
}
