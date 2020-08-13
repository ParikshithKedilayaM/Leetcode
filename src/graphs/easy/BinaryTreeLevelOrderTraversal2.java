package graphs.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
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
	 * BFS
	 * 
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrderBottomBFS(TreeNode root) {
		if (root == null)
			return new ArrayList<>();
		List<List<Integer>> result = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		result.add(Arrays.asList(root.val));
		while (!queue.isEmpty()) {
			List<Integer> lvlList = new ArrayList<>();
			int queueSize = queue.size();
			for (int i = 0; i < queueSize; i++) {
				TreeNode current = queue.poll();
				if (current.left != null) {
					lvlList.add(current.left.val);
					queue.offer(current.left);
				}
				if (current.right != null) {
					lvlList.add(current.right.val);
					queue.offer(current.right);
				}
			}
			if (lvlList.size() > 0)
				result.add(0, lvlList);
		}
		return result;
	}
}
