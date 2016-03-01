package Solution0_100;

public class Solution_88 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
       if (root == null || A == root || B == root) return root;
       
       TreeNode left = lowestCommonAncestor (root.left, A, B);
       TreeNode right = lowestCommonAncestor (root.right, A, B);
       
       if (left != null) return left;
       if (right != null) return right;
       return null;
    }
}
