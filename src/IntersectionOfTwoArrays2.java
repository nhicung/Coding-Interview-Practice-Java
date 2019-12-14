import java.util.*;

/*
DESCRIPTION:
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

SOLUTION:
Runtime: 2 ms, faster than 91.01% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 37 MB, less than 83.87% of Java online submissions for Intersection of Two Arrays II.
 */
public class IntersectionOfTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		List<Integer> result = new ArrayList<Integer>();
		
		int i = 0; 
		int j = 0; 
		
		while ( i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				result.add(nums1[i]);
				i++;
				j++;
			}
		}
		int[] finRes = new int[result.size()];
		for (int h = 0; h < result.size(); h++) {
			finRes[h] = result.get(h);
		}
		return finRes;
	}
}
