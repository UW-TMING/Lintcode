package Solution200_300;

import java.util.Stack;

class TreeNode {
	public int val;
	public TreeNode left, right;
	public TreeNode (int val) {
		this.val = val;
		this.left = this.right = null;
	}
}


public class Solution_126 {
	public TreeNode maxTree(int[] A) {
		if (A == null) {
			return null;
		}
		TreeNode root = null;
		Stack<TreeNode> stack = new Stack<TreeNode> ();
		for (int i = 0; i <= A.length; i ++) {
			TreeNode tn = null;
			if (i == A.length) {
				tn = new TreeNode(Integer.MAX_VALUE);
				root = tn;
			} else {
				tn = new TreeNode(A[i]);
			}
			while (!stack.isEmpty()) {
				if (tn.val > stack.peek().val) {
					TreeNode temp = stack.pop();
					if (!stack.isEmpty()) {
						if (stack.peek().val > tn.val) {
							tn.left = temp;
						} else {
							stack.lastElement().right = temp;
						}
					} else {
						tn.left = temp;
					}
				} else {
					break;
				}
			}
			stack.push(tn);
		}
		return root.left;
    }
}
