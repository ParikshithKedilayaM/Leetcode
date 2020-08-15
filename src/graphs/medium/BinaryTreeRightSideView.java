package graphs.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
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

	public List<Integer> rightSideView(TreeNode root) {
		if (root == null)
			return new ArrayList<>();
		List<Integer> result = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		result.add(root.val);
		while (!queue.isEmpty()) {
			int rightMostElm = -1;
			int queueSize = queue.size();

			for (int i = 0; i < queueSize; i++) {
				TreeNode current = queue.poll();
				if (current.left != null) {
					queue.offer(current.left);
					rightMostElm = current.left.val;
				}
				if (current.right != null) {
					queue.offer(current.right);
					rightMostElm = current.right.val;
				}
			}

			if (rightMostElm != -1)
				result.add(rightMostElm);

		}
		return result;
	}
}
