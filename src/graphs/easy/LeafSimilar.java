package graphs.easy;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
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

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		leaves(root1, list1);
		leaves(root2, list2);
		System.out.println(list1 + "" + list2);
		return list1.equals(list2);
	}

	private void leaves(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		if (root.left != null) {
			leaves(root.left, list);
		}
		if (root.right != null) {
			leaves(root.right, list);
		}
		if (root.left == null && root.right == null) {
			list.add(root.val);
		}
	}
}
