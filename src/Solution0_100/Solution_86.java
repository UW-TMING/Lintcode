package Solution0_100;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_86 {
	class BSTIterator {
		int currentIndex;
		ArrayList<TreeNode> values;
		public BSTIterator(TreeNode root) {
	        values = new ArrayList<TreeNode> ();
	        currentIndex = 0;
	        if (root == null) return;
	        TreeNode p = root;
	        Stack<TreeNode> stack = new Stack<TreeNode> ();
	        while (!stack.empty() || p != null) {
	        		while (p != null) {
	        			stack.add(p);
	        			p = p.left;
	        		}
	        		p = stack.pop();
	        		values.add(p);
	        		p = p.right;
	        }
	    }

	    //@return: True if there has next node, or false
	    public boolean hasNext() {
	        // write your code here
	    		return currentIndex < values.size();
	    }
	    
	    //@return: return next node
	    public TreeNode next() {
	        // write your code here
	    		return values.get(currentIndex ++);
	    }
	}
	
}
