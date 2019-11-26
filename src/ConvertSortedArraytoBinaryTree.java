/*
DESCRIPTION:
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

SOLUTION:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 */
public class ConvertSortedArraytoBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArray(nums, 0, nums.length - 1);
	}

	TreeNode sortedArray(int[] nums, int start, int end) {

		if (start == end) {
			return new TreeNode(nums[start]);
		} else if (start > end) {
			return null;
		}

		int mid = start + (end - start) / 2;
		TreeNode n = new TreeNode(nums[mid]);
		n.left = sortedArray(nums, start, mid - 1);
		n.right = sortedArray(nums, mid + 1, end);
		return n;
	}
}
