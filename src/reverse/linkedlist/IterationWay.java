/*
PROBLEM DESCRIPTION:

	Reverse a singly linked list.
	
	Example:
	
	Input: 1->2->3->4->5->NULL
	Output: 5->4->3->2->1->NULL
	Follow up:
	
	A linked list can be reversed either iteratively or recursively. Could you implement both?
	
MY SOLUTION:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
	Memory Usage: 37 MB, less than 98.92% of Java online submissions for Reverse Linked List.


 */
package reverse.linkedlist;

public class IterationWay {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode cur = head;
		ListNode prev = null;

		if (head == null) {
			return head;
		}

		ListNode nextNode = cur.next;
		while (cur.next != null) {
			cur.next = prev;
			prev = cur;
			cur = nextNode;
			nextNode = cur.next;
		}
		cur.next = prev;
		return cur;
	}
}
