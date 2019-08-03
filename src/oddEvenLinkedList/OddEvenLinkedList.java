package oddEvenLinkedList;

public class OddEvenLinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode odd = head;
		ListNode even = head.next;
		ListNode second = even;

		while (odd.next != null && odd.next.next != null) {
			odd.next = odd.next.next;
			odd = odd.next;
			even.next = even.next.next;
			even = even.next;
		}

		odd.next = second;

		return head;
	}
}
