package solution400_500;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class Solution_480 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> ans = new ArrayList<String> ();
		if (root == null) return ans;
		helper (root, "" + root.val, ans);
		return ans;
    }
	public void helper (TreeNode root, String path, List<String> ans) {
		if (root.left == null && root.right == null) ans.add(path);
		if (root.left != null) helper (root.left, path + "->" + root.left.val, ans);
		if (root.right != null) helper (root.right, path + "->" + root.right.val, ans);
	}
	
	
}
