package graphs.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public List<List<Integer>> levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		List<List<Integer>> result = new LinkedList<>();
		if (root == null)
			return result;
		queue.offer(root);
		result.add(Arrays.asList(root.val));
		while (!queue.isEmpty()) {
			int queueSize = queue.size();
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < queueSize; i++) {
				Node current = queue.poll();
				for (Node child : current.children) {
					queue.offer(child);
					list.add(child.val);
				}
			}
			if (list.size() > 0) {
				result.add(list);
			}
		}
		return result;
	}
}
