package solution400_500;

import java.util.Stack;

public class Solution_453 {
	private TreeNode lastNode = null;
	public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return; 
        if (lastNode != null) {
        		lastNode.left = null;
        		lastNode.right = root;
        }
        lastNode = root;
        TreeNode temp = root.right;
        flatten (root.left);
        flatten (temp);
    }
}
