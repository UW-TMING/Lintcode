package Solution0_100;

public class Solution_85_2 {
	public TreeNode insertNode(TreeNode root, TreeNode node) {
		if (root == null) return node;
        if (node == null) return root;
        if (root.val > node.val) {
        		root.left = insertNode (root.left, node);
        } else {
        		root.right = insertNode (root.right, node);
        }
        return root;
    }
	public TreeNode insertNode1(TreeNode root, TreeNode node) {
		if (root == null) return node;
        if (node == null) return root;
        TreeNode p = root;
        TreeNode last = p;
        while (p != null) {
        		last = p;
        		if (p.val > node.val) {
        			p = p.left;
        		} else {
        			p = p.right;
        		}
        }
        if (last.val > node.val) {
        		last.left = node;
        } else {
        		last.right = node;
        }
		return root;
	}
}
