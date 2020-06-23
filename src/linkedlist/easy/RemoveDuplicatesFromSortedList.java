package linkedlist.easy;

public class RemoveDuplicatesFromSortedList {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public ListNode deleteDuplicates(ListNode head) {
        ListNode iterate = head;
        while (iterate != null && iterate.next != null) {
            if (iterate.next.val == iterate.val) {
                iterate.next = iterate.next.next;
            } else {
                iterate = iterate.next;
            }
        }
        return head;
    }
}
