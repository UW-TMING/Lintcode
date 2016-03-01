package Solution0_100;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_71 {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
        if (root == null) return ans;
        Stack<TreeNode> stack1 = new Stack<TreeNode> ();
        Stack<TreeNode> stack2 = new Stack<TreeNode> ();
        Stack<TreeNode> temp;
        TreeNode p = root;
        boolean flag = true;
        stack1.add(p);
        while (!stack1.empty()) {
        		ArrayList<Integer> currentans = new ArrayList<Integer> ();
        		while (!stack1.empty()) {
        			p = stack1.pop();
        			currentans.add (p.val);
        			if (flag) {
        				if (p.left != null) stack2.add(p.left);
        				if (p.right != null) stack2.add(p.right);
        			} else {
        				if (p.right != null) stack2.add(p.right);
        				if (p.left != null) stack2.add(p.left);
        			}
        		}
        		ans.add(currentans);
        		stack1 = stack2;
        		stack2.removeAllElements();
        		flag = false;
        }
        return ans;
    }
}
