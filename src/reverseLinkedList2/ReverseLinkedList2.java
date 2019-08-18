/*
PROBLEM DESCDRIPTION:
	Reverse a linked list from position m to n. Do it in one-pass.
	
	Note: 1 ≤ m ≤ n ≤ length of list.
	
	Example:
	
	Input: 1->2->3->4->5->NULL, m = 2, n = 4
	Output: 1->4->3->2->5->NULL

MY SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List II.
	Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Reverse Linked List II.
 */

package reverseLinkedList2;

public class ReverseLinkedList2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private ListNode left;
	private boolean stop;

	public void helper(ListNode right, int m, int n) {
		if (n == 1) {
			return;
		}
		right = right.next;

		if (m > 1) {
			this.left = this.left.next;
		}

		this.helper(right, m - 1, n - 1);

		if (this.left == right || this.left == right.next) {
			this.stop = true;
		}
		if (!this.stop) {
			int t = this.left.val;
			this.left.val = right.val;
			right.val = t;
			this.left = this.left.next;
		}
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		this.left = head;
		this.stop = false;
		helper(head, m, n);
		return head;
	}
}
