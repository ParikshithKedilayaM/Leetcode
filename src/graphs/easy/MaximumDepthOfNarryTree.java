package graphs.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNarryTree {
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

	/**
	 * BFS
	 * 
	 * @param root
	 * @return
	 */
	public int maxDepthBFS(Node root) {
		if (root == null)
			return 0;

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		int depth = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				Node current = queue.poll();
				for (Node child : current.children)
					queue.offer(child);
			}

			depth++;
		}

		return depth;
	}

	/**
	 * DFS
	 * 
	 * @param root
	 * @return
	 */
	public int maxDepthDFS(Node root) {
		if (root == null)
			return 0;
		int depth = 0;
		for (Node child : root.children) {
			depth = Math.max(depth, maxDepthDFS(child));
		}

		return depth + 1;
	}
}
