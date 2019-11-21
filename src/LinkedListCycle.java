/*
PROBLEM DESCRIPTION:
	Given a linked list, determine if it has a cycle in it.
	
	To represent a cycle in the given linked list, we use an integer pos which represents the position 
	(0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the 
	linked list.	
	
	Example 1:
	
	Input: head = [3,2,0,-4], pos = 1
	Output: true
	Explanation: There is a cycle in the linked list, where tail connects to the second node.
	
	Example 2:
	
	Input: head = [1,2], pos = 0
	Output: true
	Explanation: There is a cycle in the linked list, where tail connects to the first node.
	
	Example 3:
	
	Input: head = [1], pos = -1
	Output: false
	Explanation: There is no cycle in the linked list. 
	
	Follow up:
	
	Can you solve it using O(1) (i.e. constant) memory?

MY SOLUTION:
	Runtime: 4 ms, faster than 21.97% of Java online submissions for Linked List Cycle.
	Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Linked List Cycle.
 */

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		ListNode cur = head;
		while (cur != null) {
			if (set.contains(cur)) {
				return true;
			}
			set.add(cur);
			cur = cur.next;
		}
		return false;
	}
}
