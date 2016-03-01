package Solution0_100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Solution_70 {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<ArrayList<Integer>> (); 
        Stack<ArrayList<Integer>> ans = new Stack<ArrayList<Integer>> ();
        if (root == null) return ans1;
        LinkedList<TreeNode> ll1 = new LinkedList<TreeNode> ();
        LinkedList<TreeNode> ll2 = new LinkedList<TreeNode> ();
        LinkedList<TreeNode> temp;
        TreeNode p = root;
        ll1.add(p);
        
        while (!ll1.isEmpty()) {
        		ArrayList<Integer> curans = new ArrayList<Integer> ();
        		while (!ll1.isEmpty()) {
        			p = ll1.pop();
        			curans.add(p.val);
        			if (p.left != null) ll2.add(p.left);
        			if (p.right != null) ll2.add(p.right);
        		}
        		ans.add(curans);
        		temp = ll1;
        		ll1 = ll2;
        		ll2 = temp;
        		ll2.removeAll(ll2);
        }
        while (!ans1.isEmpty()) {
        		ans1.add(ans.pop());
        }
        
        return ans1;
    }
}
