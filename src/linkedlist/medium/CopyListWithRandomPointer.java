package linkedlist.medium;

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class CopyListWithRandomPointer {
	public Node copyRandomList(Node head) {
		// null check
		if (head == null)
			return head;

		Node iter = head;

		// Iterate over original list and duplicate each node next to original
		while (iter != null) {
			// Create new node
			Node temp = new Node(iter.val);
			temp.next = iter.next;

			// Add the new node next to original node
			iter.next = temp;
			iter = temp.next;
		}

		// Iterate the new list and assign random pointer for duplicated nodes
		iter = head;
		while (iter != null) {
			if (iter.random != null) {

				// Assign Random of copy node to corresponding random of copy node
				iter.next.random = iter.random.next;
			}
			iter = iter.next.next;
		}

		// Restore the original list and extract the duplicated nodes
		iter = head;
		Node copyHead = head.next;
		Node copyIter = copyHead;
		while (copyIter.next != null) {

			// Restoring original list
			iter.next = iter.next.next;
			iter = iter.next;

			// Creating copy list
			copyIter.next = copyIter.next.next;
			copyIter = copyIter.next;
		}

		// Last element of the original list
		iter.next = iter.next.next;

		return copyHead;
	}
}
