package Solution0_100;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_11 {
	public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        if (root == null) return ans;
        Stack<TreeNode> stack = new Stack<TreeNode> ();
        TreeNode p = root;
        while (!stack.empty() || p != null) {
        		while (p != null) {
        			stack.add(p);
        			p = p.left;
        		}
        		p = stack.pop();
        		if (p.val >= k1 && p.val <= k2) ans.add(p.val);
        		p = p.right;
        }
        return ans;
    }
}
