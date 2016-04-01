package solution400_500;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_480_2 {
	ArrayList<String> ans = new ArrayList<String> ();
	ArrayList<Integer> res = new ArrayList<Integer> ();
	Stack<TreeNode> stack = new Stack<TreeNode> ();
	Stack<Integer> levels = new Stack<Integer> ();
	public List<String> binaryTreePaths1(TreeNode root) {
		if(root == null) return ans;
		TreeNode p = root;
		stack.add(p);
		levels.add(0);
		while(!stack.isEmpty()) {
			int level = levels.pop();
			p = stack.pop();
			res.add(p.val);
			if(p.left == null && p.right == null) {
				StringBuffer sb = new StringBuffer();
				for(int i = 0; i < res.size() - 1; i ++){
					sb.append(res.get(i) + "->");
				}
				sb.append(res.get(res.size() - 1));
				while(!levels.isEmpty() && res.size() > levels.peek()) {
					res.remove(res.size() - 1);
				}
			}
			if(p.right != null){
				stack.add(p.right);
				levels.add(level + 1);
			}
			if(p.left != null) {
				stack.add(p.left);
				levels.add(level + 1);
			}
		}
		return ans;
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
		if(root == null) return ans;
		helper(root, "" + root.val);
		return ans;
	}
	public void helper(TreeNode root, String path) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			ans.add(path);
			return;
		}
		if(root.left != null) helper(root.left, path + "->" + root.left.val);
		if(root.right != null) helper(root.right, path + "->" + root.right.val);
	}
}
