package Solution300_400;

import java.util.Scanner;
import java.util.Stack;

class BinTree {
	public String data;
	public BinTree left;
	public BinTree right;
	public String flag = "init";
	public BinTree (String data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	public static BinTree root;
	public static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {
		root = createBinTree();
//		preOrder2 (root);
		postOrder (root);
	}
	
	public static void preOrder (BinTree bt) {
		if (bt != null) {
			visit (bt);
			preOrder (bt.left);
			preOrder (bt.right);
		}
	}
	
	public static void postOrder (BinTree bt) {
		Stack<BinTree> stack = new Stack<BinTree> ();
		BinTree p = bt;
		stack.add(p);
		p = p.left;
		while (!stack.isEmpty()) {
			while (p != null && p.flag.equals("init")) {
				p.flag = "left";
				stack.push(p);
				p = p.left;
			}
			while (!stack.isEmpty() && stack.lastElement().flag.equals("right")) {
				p = stack.lastElement();
				stack.pop();
				System.out.print (p.data);
			}
			if (!stack.isEmpty()) {
				p = stack.lastElement();
				p.flag = "right";
				p = p.right;
			}
		}
	}
	
	public static void inOrder (BinTree bt) {
		Stack<BinTree> stack = new Stack<BinTree> ();
		BinTree p = bt;
		while (p != null || !stack.isEmpty()) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				p = stack.lastElement();
				stack.pop();
				System.out.print (p.data);
				p = p.right;
			}
		}
	}
	
	public static void preOrder2 (BinTree bt) {
		Stack<BinTree> stack = new Stack<BinTree> ();
		BinTree p = bt;
		while (p != null || !stack.isEmpty()) {
			if (p != null) {
				stack.push(p);
				System.out.print (p.data);
				p = p.left;
			} else {
				p = stack.lastElement();
				stack.pop();
				p = p.right;
			}
		}
	}
	
	public static void visit (BinTree bt) {
		if (bt != null) {
			System.out.print (bt.data);
		}
	}
	public static BinTree createBinTree () {
		BinTree t = null;
		String data = scanner.next();
		if (data.equals("#")) {
			return t;
		}
		t = new BinTree(data);
		t.left = createBinTree();
		t.right = createBinTree();
		return t;
	}
}
