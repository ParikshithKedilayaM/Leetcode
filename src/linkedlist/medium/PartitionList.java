package linkedlist.medium;

public class PartitionList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode partition(ListNode head, int x) {
		ListNode small = new ListNode();
		ListNode large = new ListNode();
		ListNode smallIter = small;
		ListNode largeIter = large;
		while (head != null) {
			if (head.val < x) {
				smallIter.next = head;
				smallIter = smallIter.next;
			} else {
				largeIter.next = head;
				largeIter = largeIter.next;
			}
			head = head.next;
		}
		smallIter.next = large.next;
		largeIter.next = null;
		return small.next;
	}
}
