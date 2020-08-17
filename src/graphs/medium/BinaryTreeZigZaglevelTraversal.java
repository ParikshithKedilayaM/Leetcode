package graphs.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZaglevelTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int depth = 1;
		while (!queue.isEmpty()) {
			int queueSize = queue.size();
			List<Integer> list = new LinkedList<>();

			for (int i = 0; i < queueSize; i++) {
				TreeNode current = queue.poll();
				if (depth % 2 == 1)
					list.add(current.val);
				else
					list.add(0, current.val);
				if (current.left != null) {
					queue.offer(current.left);
				}
				if (current.right != null) {
					queue.offer(current.right);
				}
			}
			depth++;
			if (list.size() > 0)
				result.add(list);
		}
		return result;
	}
}
