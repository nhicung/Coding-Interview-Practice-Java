/*
DESCRIPTION:
	Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
	
	Note: You may not slant the container and n is at least 2.
	
	Example:

	Input: [1,8,6,2,5,4,8,3,7]
	Output: 49
	
SOLUTION:
	Runtime: 203 ms, faster than 21.13% of Java online submissions for Container With Most Water.
	Memory Usage: 39.6 MB, less than 95.51% of Java online submissions for Container With Most Water.
 */

package containerWithMostWater;

public class ContainWithMostWater {
	public int maxArea(int[] height) {
		int maxVol = 0; 
		int vol = 0; 
		int posHeight = 0;
		int width = 0; 
		
		for (int i = 0; i < height.length; i ++) {
			for (int j = i+1; j < height.length; j++) {
				width = j-i;
				if (height[i] > height[j]) {
					posHeight = height[i];
				} else {
					posHeight = height[j];
				}
				vol = width * posHeight;
				maxVol = Math.max(vol,  maxVol);
			}
		}
		return maxVol;
	}
	
}
