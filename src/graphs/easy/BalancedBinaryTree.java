package graphs.easy;

public class BalancedBinaryTree {
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

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		return height(root) == -1 ? false : true;
	}

	private int height(TreeNode root) {
		if (root == null)
			return 0;
		int left = 0, right = 0;
		left = height(root.left);
		right = height(root.right);
		if (left == -1 || right == -1)
			return -1;
		if (Math.abs(left - right) > 1)
			return -1;
		return 1 + Math.max(left, right);
	}
}
