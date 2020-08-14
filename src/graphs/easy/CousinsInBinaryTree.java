package graphs.easy;

public class CousinsInBinaryTree {
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

	public boolean isCousins(TreeNode root, int x, int y) {
		return depth(root, x, root.val)[0] == depth(root, y, root.val)[0]
				&& depth(root, x, root.val)[1] != depth(root, y, root.val)[1];

	}

	private int[] depth(TreeNode root, int target, int parent) {
		if (root == null)
			return new int[] { 0, parent };
		if (root.val == target) {
			return new int[] { 1, parent };
		}
		int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE, parentLeft = -1, parentRight = -1;
		if (root.left != null) {
			int[] leftDepth = depth(root.left, target, root.val);
			left = 1 + leftDepth[0];
			parentLeft = leftDepth[1];
		}
		if (root.right != null) {
			int[] rightDepth = depth(root.right, target, root.val);
			right = 1 + rightDepth[0];
			parentRight = rightDepth[1];
		}
		if (left < right) {
			left = right;
			parentLeft = parentRight;
		}

		return new int[] { left, parentLeft };
	}
}
