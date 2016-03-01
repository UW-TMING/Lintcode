package Solution200_300;



public class Solution_207 {
	
	public static void main (String []args) {
		int[] A = {1,2,7,8,5};
		Solution_207 test = new Solution_207();
		test.Solution(A);
		System.out.println(test.query(0, 4));
	}
	
	public SegmentTree root;
	public void Solution(int[] A) {
		root = build(0, A.length - 1, A);
    }
    public long query(int start, int end) {
    		return queryTree(root, start, end);
    }
    
    public long queryTree (SegmentTree root, int start, int end) {
    		if (root.start == start && root.end == end) {
    			return root.sum;
    		}
    		int mid = (root.start + root.end) / 2;
    		if (end <= mid) {
    			return queryTree (root.left, start, end);
    		}
    		if (start > mid) {
    			return queryTree (root.right, start, end);
    		}
    		return queryTree (root.left, start, mid) + queryTree (root.right, mid + 1, end);
    }
    
    public void modify(int index, int value) {
        long oldValue = query(index, index);
    }
    
    public void modifyTree (SegmentTree root, int index, int value, int oldValue) {
    		if (root.start <= index && index <= root.end) {
				root.sum += value - oldValue;
    			if (root.start == index && root.end == index) {
    				return;
    			}
    			int mid = (root.start + root.end) / 2;
    			if (index <= mid) {
    				modifyTree (root.left, index, value, oldValue);
    			} else {
    				modifyTree (root.right, index, value, oldValue);
    			}
    		}
    }
    
    public SegmentTree build (int start, int end, int[] A) {
    		SegmentTree root = new SegmentTree (start, end);
    		if (start == end) {
    			root.sum = A[start];
    			return root;
    		}
    		int mid = (start + end) / 2;
    		root.left = build (start, mid, A);
    		root.right = build (mid + 1, end, A);
    		root.sum = root.left.sum + root.right.sum;
    		return root;
    }
    
}
