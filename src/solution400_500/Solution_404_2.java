package solution400_500;

import java.util.Arrays;

public class Solution_404_2 {
	public static void main (String[] args) {
		Solution_404_2 test = new Solution_404_2 ();
		int[] A = {1, 2, 3, 4};
		int start = 1;
		int end = 3;
		System.out.println (test.subarraySumII(A, start, end));
	}
	int find(int[] A, int len, int value) {
        if (A[len-1] < value )
            return len;
        
        int l = 0, r = len-1, ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (value <= A[mid]) {
                ans = mid;
                r = mid - 1;
            }  else
                l = mid + 1;
        }
        return ans;
    }

    public int subarraySumII(int[] A, int start, int end) {
        // Write your code here
        int len = A.length;
        for (int i = 1; i <len; ++i)
            A[i] += A[i-1];

        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i <len; ++i) {
            if (A[i] >= start && A[i] <= end)
                cnt ++;
            int l = A[i] - end;
            int r = A[i] - start;
//System.out.println ("r + 1 : " + (r + 1) +"  -->" + find(A, len, r+1)  + " left :"+  l + "--->" + find(A, len, l));
            cnt += find(A, len, r+1) - find(A, len, l); 
        }
        return cnt;
    }
}
