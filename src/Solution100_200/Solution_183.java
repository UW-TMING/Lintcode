package Solution100_200;

public class Solution_183 {
	public static void main (String[] args) {
		int[] L = {2147483644, 2147483645, 2147483646, 2147483647};
		int k = 4;
		Solution_183 test = new Solution_183 ();
		System.out.println (test.woodCut(L, k));
	}
	public int woodCut(int[] L, int k) {
		int ans = 0;
        if (L == null || L.length == 0) return ans;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < L.length; i ++) 
        		max = Math.max(max, L[i]);
        long left = 1;
        long right = max;
        while (left < right) {
        		long temp = (left + right);   
        		int mid = (int)(temp / 2);
        		if (count (L, mid) >= k) {
        			ans = mid;
        			left = mid + 1;
        		} else {
        			right = mid - 1;
        		}
        }
        return ans;
    }
	public int count (int[] l, int partit) {
		int sum = 0;
		for (int i = 0; i < l.length; i ++) 
			sum += (l[i] / partit);
		return sum;
	}
}
