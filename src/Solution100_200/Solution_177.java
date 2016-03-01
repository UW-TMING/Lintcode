package Solution100_200;

public class Solution_177 {
	public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
		return helper (A, 0, A.length - 1);
    }
	public TreeNode helper (int[] A, int start, int end) {
		if (start > end) return null;
		if (end >= A.length) return null;
		if (start < 0) return null;
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(A[mid]);
		root.left = helper (A, start, mid - 1);
		root.right = helper (A, mid + 1, end);
		return root;
	}
}
