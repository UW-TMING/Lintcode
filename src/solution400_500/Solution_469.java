package solution400_500;

import java.util.Stack;

public class Solution_469 {
	public boolean isIdentical(TreeNode a, TreeNode b) {
		boolean ans = true;
        if (a == null && b == null) return ans;
        Stack<TreeNode> stack = new Stack<TreeNode> ();
        Stack<TreeNode> stack1 = new Stack<TreeNode> ();
        TreeNode p = a;
        TreeNode p1 = a;
        String str = "";
        while (!stack.empty() || p != null) {
        		while (p != null) {
        			stack.add(p);
        			p = p.left;
        		}
        		p = stack.pop();
        		str += p.val;
        		p = p.right;
        }
        String str1 = "";
        p = b;
        while (!stack.empty() || p != null) {
        		while (p != null) {
        			stack.add(p);
        			p = p.left;
        		}
        		p = stack.pop();
        		str1 += p.val;
        		p = p.right;
        }
        return str.equals(str1);
    }
}
