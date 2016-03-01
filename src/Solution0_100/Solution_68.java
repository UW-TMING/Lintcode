package Solution0_100;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_68 {
	public static void main (String[] args) {
		Solution_68 test = new Solution_68 ();
		int[] vals = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0};
		int index = 0;
		TreeNode root = test.build(vals, index);
		ArrayList<Integer> result = test.postorderTraversal2(root);
		for (Integer k : result) System.out.print(k + " "); 
	}
	public TreeNode build (int[] vals, int index) {
		if (index >= vals.length || vals[index] == 0) return null;
		TreeNode root = new TreeNode (vals[index]);
		root.left = build (vals, index * 2 + 1);
		root.right = build (vals, index * 2 + 2);
		return root;
	}
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<Integer> ();
		if (root == null) return ans;
		ArrayList<Integer> left_list = postorderTraversal(root.left);
		ArrayList<Integer> right_list = postorderTraversal(root.right);
		
		ans.addAll(left_list);
		ans.addAll(right_list);
		ans.add(root.val);
		
		return ans;
	}
	public ArrayList<Integer> postorderTraversal1(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<Integer> ();
		if (root == null) return ans;
		Stack<TreeNode> stack = new Stack<TreeNode> ();
		TreeNode p = root;
		while (!stack.empty() || p != null) {
			while (p != null) {
				p.flag = "left";
				stack.add(p);
				p = p.left;
			}
			while (!stack.empty() && stack.peek().flag.equals("right")) {
				ans.add(stack.pop().val);
			}
			if (!stack.empty()) {
				p = stack.peek();
				p.flag = "right";
				p = p.right;
			}
		}
		return ans;
	}
	public ArrayList<Integer> postorderTraversal2(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<Integer> ();
		if (root == null) return ans;
		Stack<TreeNode> stack1 = new Stack<TreeNode> ();
		Stack<TreeNode> stack2 = new Stack<TreeNode> ();
		TreeNode p = root;
		stack1.add(p);
		while (!stack1.empty()) {
			p = stack1.pop();
			stack2.push(p);
			if (p.left != null) stack1.push(p.left);
			if (p.right != null) stack1.push(p.right);
		}
		while (!stack2.empty()) {
			ans.add(stack2.pop().val);
		}
		return ans;
	}
}
