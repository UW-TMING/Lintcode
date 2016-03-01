package Solution0_100;

import java.util.Stack;

public class Solution_95 {
	public boolean isValidBST(TreeNode root) {
		if (root == null) return true;
		if (root.left == null && root.right == null) return true;
		if (root.left != null && root.left.val >= root.val) return false;
		if (root.right != null && root.right.val <= root.val) return false;
		return isValidBST(root.left) && isValidBST(root.right);
    }
	public boolean isValidBST1(TreeNode root) {
		if (root == null) return false;
		Stack<TreeNode> stack = new Stack<TreeNode> ();
		TreeNode p = root;
		long before = Long.MIN_VALUE;
		while (!stack.empty() || p != null) {
			while (p != null) {
				stack.add(p);
				p = p.left;
			}
			p = stack.pop();
			if (p.val <= before) return false; 
			before = p.val;
			p = p.right;
		}
		return true;
    }
}
