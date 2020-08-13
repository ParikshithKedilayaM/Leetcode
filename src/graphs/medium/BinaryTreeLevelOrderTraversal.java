package graphs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
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

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		result.add(Arrays.asList(root.val));
		while (!queue.isEmpty()) {
			int queueSize = queue.size();
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < queueSize; i++) {
				TreeNode current = queue.poll();
				if (current.left != null) {
					queue.offer(current.left);
					list.add(current.left.val);
				}
				if (current.right != null) {
					queue.offer(current.right);
					list.add(current.right.val);
				}
			}
			if (list.size() > 0)
				result.add(list);
		}
		return result;

	}
}
