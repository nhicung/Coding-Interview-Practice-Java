/*
 PROBLEM DESCRIPTION:
	 Given two arrays, write a function to compute their intersection.
	
	Example 1:
	
	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2]
	Example 2:
	
	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [9,4]
 
 MY SOLUTION:
	Runtime: 2 ms, faster than 98.41% of Java online submissions for Intersection of Two Arrays.
	Memory Usage: 37.5 MB, less than 68.92% of Java online submissions for Intersection of Two Arrays.

 */


import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] num1, int[] num2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (int i = 0; i < num1.length; i++) {
			set1.add(num1[i]);
		}
		for (int i = 0; i < num2.length; i++) {
			int t = num2[i];
			if (set1.contains(t)) {
				set2.add(t);
			}
		}
		int[] result = new int[set2.size()];
		int idx = 0;
		for (int i : set2) {
			result[idx++] = i;
		}
		return result;
	}
}
