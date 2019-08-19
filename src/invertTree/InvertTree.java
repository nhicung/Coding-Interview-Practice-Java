/*
PROBLEM DESCRIPTION:
	Invert a binary tree.
	
	Example:
	
	Input:
	
	     4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
	Output:
	
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1

MY SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
	Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
 */

package invertTree;

public class InvertTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			x = val;
		}
	}

	public TreeNode invert(TreeNode root) {
		if (root == null) {
			return root;
		}
		if (root.left == null && root.right == null) {
			return root;
		}

		TreeNode n = root.left;
		root.left = root.right;
		root.right = n;

		invert(root.left);
		invert(root.right);

		return root;
	}
}
