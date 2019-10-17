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
	Memory Usage: 36.9 MB, less than 98.92% of Java online submissions for Reverse Linked List.

 */


package reverse.linkedlist;

public class RecursionWay {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseLinkedList(ListNode head) {
		if (head.next == null || head == null) {
			return head;
		}

		ListNode reversedListHead = reverseLinkedList(head.next);
		head.next.next = head;
		head.next = null;

		return reversedListHead;
	}
}
