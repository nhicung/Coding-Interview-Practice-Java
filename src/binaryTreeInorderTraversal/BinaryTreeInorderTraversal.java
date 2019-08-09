/*
DESCRIPTION:
	Given a binary tree, return the inorder traversal of its nodes' values.
	
	Example:
	
	Input: [1,null,2,3]
	   1
	    \
	     2
	    /
	   3
	
	Output: [1,3,2]
	
MY SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
	Memory Usage: 35 MB, less than 100.00% of Java online submissions for Binary Tree Inorder Traversal.


 */


package binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root) {

		if (root == null) {
			return result;
		}
		if (root.left != null) {
			inorderTraversal(root.left);
		}
		result.add(root.val);

		if (root.right != null) {
			inorderTraversal(root.right);
		}
		return result;
	}
}
