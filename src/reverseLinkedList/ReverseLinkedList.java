package reverseLinkedList;

public class ReverseLinkedList {
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
