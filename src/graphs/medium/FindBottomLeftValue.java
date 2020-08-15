package graphs.medium;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {
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

	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			if (root.right != null) {
				queue.offer(root.right);
			}
			if (root.left != null) {
				queue.offer(root.left);
			}
		}
		return root.val;
	}
}
