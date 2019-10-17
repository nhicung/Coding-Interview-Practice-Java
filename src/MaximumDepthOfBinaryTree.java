/*
PROBLEM DESCRIPTION
		Given a binary tree, find its maximum depth.
		
		The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
		
		Note: A leaf is a node with no children.
		
		Example:
		
		Given binary tree [3,9,20,null,null,15,7],
		
		    3
		   / \
		  9  20
		    /  \
		   15   7
		return its depth = 3.
		
MY SOLUTION
		Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
		Memory Usage: 38.8 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.
 */



public class MaximumDepthOfBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		int rightDepth = 0;
		int leftDepth = 0;
		int max = 0;
		if (root == null) {
			return 0;
		}
		leftDepth = maxDepth(root.left);
		rightDepth = maxDepth(root.right);

		if (leftDepth >= rightDepth) {
			max = leftDepth + 1;
		}
		if (rightDepth >= leftDepth) {
			max = rightDepth + 1;
		}
		return max;
	}
}
