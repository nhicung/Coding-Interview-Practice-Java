/*
PROBLEM DESCRIPTION:
	Given a binary tree, determine if it is a valid binary search tree (BST).
	
	Assume a BST is defined as follows:
	
	The left subtree of a node contains only nodes with keys less than the node's key.
	The right subtree of a node contains only nodes with keys greater than the node's key.
	Both the left and right subtrees must also be binary search trees.
	 
	
	Example 1:
	
	    2
	   / \
	  1   3
	
	Input: [2,1,3]
	Output: true
	Example 2:
	
	    5
	   / \
	  1   4
	     / \
	    3   6
	
	Input: [5,1,4,null,null,3,6]
	Output: false
	Explanation: The root node's value is 5 but its right child's value is 4.
 */



public class ValidBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {

		return helper(root, null, null);

	}

	public boolean helper(TreeNode node, Integer upper, Integer lower) {
		if (node == null) {
			return true;
		}
		int val = node.val;

		if (lower != null && val <= lower) {
			return false;
		}

		if (upper != null && upper <= val) {
			return false;
		}

		if (!helper(node.left, val, lower)) {
			return false;
		}

		if (!helper(node.right, upper, val)) {
			return false;
		}
		return true;
	}

}
