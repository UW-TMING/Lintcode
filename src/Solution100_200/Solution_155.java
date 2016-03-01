package Solution100_200;

import java.util.Stack;

public class Solution_155 {
	public int minDepth(TreeNode root) {
		return depth (root);
    }
	public int depth (TreeNode root) {
		if (root == null) return 0;
		int left_height = depth (root.left) + 1;
		int right_height = depth (root.right) + 1;
		return Math.min(left_height, right_height);
	}
}
