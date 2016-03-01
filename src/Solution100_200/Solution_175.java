package Solution100_200;

import java.util.LinkedList;

public class Solution_175 {
	public void invertBinaryTree(TreeNode root) {
        if (root == null) return;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertBinaryTree (root.left);
        invertBinaryTree (root.right);
    }
	public void invertBinaryTree1(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> ll = new LinkedList<TreeNode> ();
        TreeNode p = root;
        ll.push(p);
        while (!ll.isEmpty()) {
        		p = ll.poll();
        		if (p.left != null) ll.push(p.left);
        		if (p.right != null) ll.push(p.right);
        		TreeNode temp = p.left;
        		p.left = p.right;
        		p.right = temp;
        }
    }
}
