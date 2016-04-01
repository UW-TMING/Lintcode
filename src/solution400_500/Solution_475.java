package solution400_500;

public class Solution_475 {
	class TreeNode {
		public int val;
		public TreeNode left, right;
		public TreeNode() {}
		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
	public int ans = Integer.MIN_VALUE;
	public int maxPathSum2(TreeNode root) {
		pathSum(root, 0);
		return ans;
	}
	public void pathSum(TreeNode root, int sum) {
		if (root == null) return;
		sum += root.val;
		if (root.left == null && root.right == null) {
			if (sum > ans) ans = sum;
		}
		pathSum (root.left, sum);
		pathSum (root.right, sum);
		sum -= root.val;
	}
}
