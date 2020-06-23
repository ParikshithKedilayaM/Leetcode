package linkedlist.easy;

public class MergeTwoSortedLists {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode();
		ListNode dummy = l3;
		while (l1 != null && l2 != null) {

			if (l1.val > l2.val) {
				l3.next = l2;
				l2 = l2.next;
			} else {
				l3.next = l1;
				l1 = l1.next;
			}
			l3 = l3.next;
		}
		l3.next = l1 == null ? l2 : l1;
		return dummy.next;
	}
}
