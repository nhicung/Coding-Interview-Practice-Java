/*
DESCRIPTION:
		Given preorder and inorder traversal of a tree, construct the binary tree.
		
		Note:
		You may assume that duplicates do not exist in the tree.
		
		For example, given
		
		preorder = [3,9,20,15,7]
		inorder = [9,3,15,20,7]
		Return the following binary tree:
		
		    3
		   / \
		  9  20
		    /  \
		   15   7

SOLUTION:
	Runtime: 2 ms, faster than 97.52% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
	Memory Usage: 36 MB, less than 100.00% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.

 */



public class ConstructBinaryTreeFromInorderAndPreorderTraversal {

	public class TreeNode {
		int val;
		TreeNode left; 
		TreeNode right;
		TreeNode( int x) {
			val = x;
		}
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return helper(0, 0, inorder.length, preorder, inorder);
	}
	
	public TreeNode helper (int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		
		//base case
		if (preStart > preorder.length || inStart > inEnd){
			return null;
		}
		
		// get root in preorder list
		TreeNode root = new TreeNode(preorder[preStart]);
		
		//locate root in inorder list
		int index = 0;
		for ( int i = inStart; i < inEnd; i++) {
			if (root.val == inorder[i]) {
				index = inorder[i];
			}
		}
		
		//recurse left and right nodes based on location of root in inorder list
		root.left = helper(preStart +1, inStart, index -1, preorder, inorder);
		root.right = helper(preStart + index - inStart +1, index +1, inEnd, preorder, inorder);
		
		return root;
	}
}
