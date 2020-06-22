package linkedlist.medium;

public class RotateRight {


	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

	public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while (temp.next.next != null) {
            temp = temp.next;
            len++;
        }
        ListNode tempNode = new ListNode();
        tempNode = temp.next; 
        
        temp.next = null;
        
        tempNode.next = head;
        head = tempNode;
        
        return rotateRight(head, (k-1)%(len+1));
        
    }
}
