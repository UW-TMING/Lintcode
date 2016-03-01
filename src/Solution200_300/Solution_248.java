//package Solution200_300;
//
//import java.util.ArrayList;
//
//class SegmentTree {
//	public int start;
//	public int end;
//	public SegmentTree left;
//	public SegmentTree right;
//	public int count;
//	public SegmentTree (int start, int end, int count) {
//		this.start = start;
//		this.end = end;
//		this.count = count;
//		left = null;
//		right = null;
//	}
//}
//
//public class Solution_248 {
//	
//	public static void main (String []args) {
//		int[] A = {1, 2, 3, 4, 5, 6};
//		int[] queries = {1, 2, 3, 4};
//		ArrayList<Integer> ls = new Solution_248().countOfSmallerNumber(A, queries);
//		for (int k : ls) {
//			System.out.print (k + " ");
//		}
//	}
//	
//	public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
//        ArrayList<Integer> al = new ArrayList<Integer> ();
//        SegmentTree root = build (0, 10000);
//        for (int i = 0; i < A.length; i ++) {
//        		modifyTree (root, A[i]);
//        }
//        for (int i : queries) {
//        		al.add(query(root, 0, i - 1));
//        }
//		return al;
//    }
//	
//	public int query (SegmentTree root, int start, int end) {
//		if (root == null) {
//			return 0;
//		}
//		if (root.end == end && root.start == start) {
//			return root.count;
//		}
//		int mid = (root.start + root.end ) / 2;
//		if (end <= mid) {
//			return query (root.left, root.start, end);
//		} else {
//			return query(root.left, root.start, mid) + query (root.right, mid + 1, end);
//		}
//	}
//	
//	public void modifyTree (SegmentTree root, int temp) {
//		if (root == null) {
//			return;
//		}
//		if (root.start <= temp && temp <= root.end) {
//			root.count += 1;
//			if (root.start == temp && temp == root.end) {
//				return ;
//			}
//			int mid = (root.start + root.end) / 2;
//			if (temp <= mid) {
//				modifyTree (root.left, temp);
//			} else {
//				modifyTree (root.right, temp);
//			}
//		}
//	}
//	
//	public SegmentTree build (int start, int end) {
//		SegmentTree root = new SegmentTree(start, end, 0);
//		if (start == end) {
//			return root;
//		}
//		int mid = (start + end) / 2;
//		root.left = build (start, mid);
//		root.right = build (mid + 1, end);
//		return root;
//	}
//}
