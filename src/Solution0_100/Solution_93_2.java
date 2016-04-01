package Solution0_100;

import java.util.Stack;

class BinaryTree {
	public int val;
	public BinaryTree left;
	public BinaryTree right;
	public BinaryTree() {}
	public BinaryTree(int val) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class Solution_93_2 {
	
	public static void main(String[] args) {
		String[] num = {"3", "9", "20", "#", "#", "15", "7"};
		BinaryTree root = buildTree(num);
		preOrder(root);
	}
	
	public boolean isBalanced(TreeNode root) {
		return getDepth(root) != -1;
	}
	
	public int getDepth(TreeNode root) {
		if(root == null) return 0;
		
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		
		if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
			return  -1;
		}
		return Math.max(left, right) + 1;
	}
	
	public static boolean isBalanced1(TreeNode root) {
		if(root == null) return true;
		int left = depth(root.left);
		int right = depth(root.right);
		if (Math.abs(left - right) > 1) return false;
        return isBalanced1(root.left) && isBalanced1(root.right);
    }
	
	public static int depth(TreeNode root) {
		if (root == null) return 0;
		int left = depth(root.left) + 1;
		int right = depth(root.right) + 1;
		return Math.max(left, right) + 1;
	}
	
	public static void preOrder (BinaryTree root) {
		if (root == null) return;
		Stack<BinaryTree> stack = new Stack<BinaryTree> ();
		stack.add(root);
		while (!stack.isEmpty()) {
			BinaryTree bt = stack.pop();
			System.out.print(bt.val + " ");
			if (bt.right != null) stack.add(bt.right);
			if (bt.left != null) stack.add(bt.left);
		}
		System.out.println();
	}
	
	public static BinaryTree buildTree(String[] num) {
		return build(num, 0);
	}
	public static BinaryTree build(String[] num, int index) {
		if (index >= num.length) return null;
		if (num[index].equals("#")) return null;
 		BinaryTree root = new BinaryTree(Integer.parseInt(num[index]));
 		root.left = build(num, 2 * index + 1);
 		root.right = build(num, 2 * index + 2);
 		return root;
	}
}
