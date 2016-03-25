package Solution100_200;

public class Solution_141_2 {
	public static void main (String[] args) {
		int x = 144;
		System.out.println (sqrt(x));
	}
	public static int sqrt(int x) { 
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
