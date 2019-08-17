package reverseLinkedList;

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
