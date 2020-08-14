package graphs.easy;

public class MinimumDepthOfBinaryTree {
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

	/**
	 * DFS
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		int depth = 1;
		if (root.left == null && root.right == null) {
			return depth;
		}
		int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
		if (root.left != null) {
			left = minDepth(root.left);
		}
		if (root.right != null) {
			right = minDepth(root.right);
		}
		depth += Math.min(left, right);
		return depth;
	}
}
