package Solution0_100;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution_66 {
	static Scanner scan = new Scanner (System.in);
	public static void main (String[] args) {
//		int val = scan.nextInt();
		int[] vals = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0};
		Solution_66 test = new Solution_66 ();
		TreeNode root = test.build1(vals, 0);
System.out.println ("----");
		ArrayList<Integer> result = test.preorderTraversal4(root);
		for (Integer k : result) System.out.print (k + " ");
	}
	public TreeNode build (int val) {
		if (val == 0) return null; 
		TreeNode root = new TreeNode(val);
		root.left = build (scan.nextInt());
		root.right = build (scan.nextInt());
		return root;
	}
	public TreeNode build1 (int[] vals, int index) {
		if (index >= vals.length || vals[index] == 0) return null;
		TreeNode root = new TreeNode (vals[index]);
		root.left = build1(vals, 2 * index + 1);
		root.right = build1 (vals, 2 * index  + 2);
		return root;
	}
	public ArrayList<Integer> preorderTraversal1(TreeNode root) {
		 ArrayList<Integer> ans = new ArrayList<Integer> ();
		 if (root == null) return ans;
		 ArrayList<Integer> leftList = preorderTraversal1(root.left);
		 ArrayList<Integer> rightList = preorderTraversal1(root.right);
		 ans.add(root.val);
		 ans.addAll(leftList);
		 ans.addAll(rightList);
		 return ans;
	}
	ArrayList<Integer> ans1 = new ArrayList<Integer> ();
	public ArrayList<Integer> preorderTraversal2(TreeNode root) {
		 if (root == null) return ans1;
		 ans1.add(root.val);
		 preorderTraversal2(root.left);
		 preorderTraversal2(root.right);
		 return ans1;
	}
	
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) return ans;
        TreeNode p = root;
        stack.add(root);
        while (!stack.empty()) {
        		TreeNode t = stack.pop();
        		ans.add(t.val);
        		if (t.right != null) stack.add(t.right);
        		if (t.left != null) stack.add(t.left);
        }
        return ans;
    }
	public ArrayList<Integer> preorderTraversal4(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) return ans;
        TreeNode p = root;
        while (!stack.empty() || p != null) {
        		if (p != null) {
        			while (p != null) {
        				stack.add(p);
        				ans.add(p.val);
        				p = p.left;
        			}
        		} else {
        			p = stack.pop();
        			p = p.right;
        		}
        }
        return ans;
    }
}
