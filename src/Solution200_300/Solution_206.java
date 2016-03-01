//package Solution200_300;
//
//import java.util.ArrayList;
//
//class Interval {
//	int start, end;
//	Interval(int start, int end) {
//		this.start = start;
//		this.end = end;
//	}
//}
//
//class SegmentTree {
//	public SegmentTree root;
//	public int start;
//	public int end;
//	public long sum;
//	public SegmentTree left;
//	public SegmentTree right;
//	public SegmentTree (int start, int end) {
//		this.start = start;
//		this.end = end;
//		this.left = null;
//		this.right = null;
//	}
//}
//
//public class Solution_206 {
//	public ArrayList<Long> intervalSum(int[] A, ArrayList<Interval> queries) {
//		ArrayList<Long> al = new ArrayList<Long>();
//		SegmentTree root = build (0, A.length - 1, A);
//		for (int i = 0; i < queries.size(); i ++) {
//			Interval interval = queries.get(i);
//			al.add(query (root, interval.start, interval.end));
//		}
//		return al;
//	}
//	public long getSum (int start, int end, int[] A) {
//		long sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum += A[i];
//		}
//		return sum;
//	}
//	
//	public SegmentTree build(int start, int end, int[] A) {
//		SegmentTree root = new SegmentTree (start, end);
//		if (start == end) {
//			root.sum = A[start];
//			return root;
//		}
//		int mid = (start + end) / 2;
//		root.left = build (start, mid, A);
//		root.right = build (mid + 1, end, A);
//		root.sum = root.left.sum + root.right.sum;
//		return root;
//	}
//	public long query (SegmentTree root, int start, int end) {
//		if (root == null) {
//			return 0;
//		}
//		if (root.start == start && root.end == end) {
//			return root.sum;
//		}
//		int mid = (root.start + root.end) / 2;
//		if (end <= mid) {
//			return query (root.left, start, end);
//		} 
//		if (start > mid) {
//			return query (root.right, start, end);
//		}
//		return query(root.left, start, mid) + query(root.right, mid + 1, end);
//	}
//}
