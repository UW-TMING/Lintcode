package Solution200_300;

import java.util.Stack;

public class Solution_245 {
	public boolean isSubtree(TreeNode T1, TreeNode T2) {
		if (T1 == null || T2 == null) return false; 
		Stack<TreeNode> stack = new Stack<TreeNode> ();
		Stack<TreeNode> stack1 = new Stack<TreeNode> ();
		stack.add(T1);
		TreeNode p = T1;
		TreeNode subtree = T2;
		boolean flag = false;
		while (!stack.empty()) {
			p = stack.pop();
			if (p.val == subtree.val) {
				flag = true;
				break;
			}
			if (p.left != null) stack.add(p.left);
			if (p.right != null) stack.add(p.right);
		}
		if (flag == false) {
			return false;
		}
		stack.removeAllElements();
		
		while (!stack1.empty() || subtree != null) {
			while (p != null) {
				stack.add(p);
				p = p.left;
			}
			while (subtree != null) {
				stack1.add(p);
				subtree = subtree.left;
			}
			p = stack.pop();
			subtree = stack1.pop();
			if (p.val != subtree.val) return false;
			p = p.right;
			subtree = subtree.right;
		}
        return true;
    }
	public boolean isSubtree1(TreeNode T1, TreeNode T2) {
		if (T2 == null) return true;
		if (T1 == null) return false;
		if (isEqual (T1, T2)) return true;
		if (isSubtree1(T1.left, T2) && isSubtree1 (T1.right, T2)) {
			return true;
		}
		return false;
	}
	public boolean isEqual (TreeNode T1, TreeNode T2) {
		if (T1 == null || T1 == null) return T1 == T2;
		if (T1.val != T2.val) return false;
		return isEqual (T1.left, T2.left) && isEqual (T1.right, T2.right);
	}
}
