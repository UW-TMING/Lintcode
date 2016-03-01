package Solution0_100;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_67 {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        Stack<TreeNode> stack = new Stack<TreeNode> ();
        TreeNode p = root;
        while (!stack.empty() || p != null) {
        		while (p != null) {
        			stack.add(p);
        			p = p.left;
        		}
        		p = stack.pop();
        		ans.add(p.val);
        		p = p.right;
        }
        return ans;
    }
	public ArrayList<Integer> inorderTraversal1(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        if (root == null) return ans;
        ArrayList<Integer> left_list = inorderTraversal1(root.left);
        ArrayList<Integer> right_list = inorderTraversal1(root.right);
        
        ans.addAll(left_list);
        ans.add(root.val);
        ans.addAll(right_list);
        return ans;
    }
}
