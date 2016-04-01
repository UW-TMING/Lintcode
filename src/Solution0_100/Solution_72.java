package Solution0_100;

public class Solution_72 {
	class TreeNode {
		public int val;
		public TreeNode left, right;
		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) return null;
        return helper (inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
	public int findIndex (int[] inorder, int val) {
		for (int i = 0; i < inorder.length; i ++) {
			if (inorder[i] == val) return i;
		}
		return -1;
	}
	public TreeNode helper (int[]inorder, int start, int end, int[]postorder, int left, int right) {
		if (start > end || left > right) return null;
		int rootval = postorder[right];
		int rootIndex = findIndex(inorder, rootval);
		if (rootIndex == -1) return null;
		TreeNode root = new TreeNode(rootval);
		root.left = helper(inorder, start, rootIndex - 1, postorder, left, left + rootIndex - start - 1);
		root.right = helper(inorder, rootIndex + 1, end, postorder, left + rootIndex - start, right - 1);
		return root;
	}
}
