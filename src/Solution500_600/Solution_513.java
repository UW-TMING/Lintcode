package Solution500_600;

public class Solution_513 {
	public static void main (String[] args) {
		int n = 100000;
		Solution_513 test = new Solution_513 ();
		System.out.println (test.numSquares(n));
	}
	int[] visit;
	int[] dp;
	public int numSquares(int n) {
        visit = new int[n + 1];
        dp = new int[n + 1];
        for(int i = 0; i * i <= n; i++){
            dp[i * i] = 1;
            visit[i * i] = 1;
        }
        return search(n);
    }
	public int search (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (visit[n] == 1) return dp[n];
		int maxSqrt = sqrt(n);
		int min = Integer.MAX_VALUE;
		for (int i = maxSqrt; i >= 1; i --) {
			int temp = n - i * i;
			int dpi = search (temp);
			if (dpi < min) min = dpi;
		}
		dp[n] = min + 1;
		visit[n] = 1;
		return dp[n];
	}
	public int sqrt (int x) {
//System.out.println ("sqrt ----> " + x);
		long left = 1;
		long right = x;
		long ans = 0;
		while (left <= right) {
			long mid = (left + right) / 2;
			if (mid * mid == x) {
				return (int)mid;
			} else if (mid * mid < x) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return (int)ans;
	}
}
