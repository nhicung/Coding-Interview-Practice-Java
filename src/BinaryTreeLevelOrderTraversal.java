/*
PROBLEM DESCRIPTION:
	Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

	For example:
	Given binary tree [3,9,20,null,null,15,7],
	
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its level order traversal as:
	
	[
	  [3],
	  [9,20],
	  [15,7]
	]

MY SOLUTION:
 	Runtime: 1 ms, faster than 89.20% of Java online submissions for Binary Tree Level Order Traversal.
	Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
 */



import java.util.*;

public class BinaryTreeLevelOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if (root == null) {
			return new ArrayList();
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> currentLayer = new ArrayList<Integer>();
			int layerSize = queue.size();
			for (int i = 0; i < layerSize; i ++) {
				TreeNode currentNode = queue.poll();
				currentLayer.add(currentNode.val);
				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			result.add(currentLayer);
		}
		return result;		
	}

}
