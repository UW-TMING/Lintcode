package Solution0_100;

public class Solution_73 {
	class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null || preorder.length != inorder.length) return null;
		return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
	public int findIndex(int[] inorder, int val) {
		for (int i = 0; i < inorder.length; i ++) {
			if(inorder[i] == val) return i; 
		}
		return -1;
	}
	
	public TreeNode helper(int[] preorder, int left, int right, int[] inorder, int start, int end) {
		if (left > right || start > end) return null;
		int rootval = preorder[left];
		int rootindex = findIndex(inorder, rootval);
		if (rootindex == -1) return null;
		TreeNode root = new TreeNode(rootval);
		root.left = helper(preorder, left + 1, left + rootindex - start, inorder, start, rootindex - 1);
		root.right = helper(preorder, left + rootindex - start + 1, right, inorder, rootindex + 1, end);
		return root;
	}
}
