package Solution100_200;

import java.math.BigInteger;

public class Solution_141 {
	public static void main (String[] args) {
		Solution_141 test = new Solution_141();
		System.out.println (31622 * 31622 + "  " + 31623 * 31623);
		System.out.println (test.sqrt(999999999));
		String str = "";
		str.toCharArray();
	}
	public int sqrt(int x) {
		String str = x + "";
		if (x <= 0) {
			return -1;
		}
		BigInteger big_x = new BigInteger(x + "");
		int ans = -1;
		int start = 1;
		int end = 0;
		int k = str.length() / 2  + 1;
		while (k > 0) {
			end = end * 10 + 9;
			k --;
		}
		while (start < end) {
			int mid = (start + end) / 2;
			int bigMid = mid + 1;
			BigInteger big_mid = new BigInteger(mid + "");
			BigInteger big_mid_1 = new BigInteger(bigMid + "");
			big_mid = big_mid.multiply(big_mid);
			big_mid_1 = big_mid_1.multiply(big_mid_1);
			if (big_mid.compareTo(big_x) != 1 && big_mid_1.compareTo(big_x) == 1) {
				return mid;
			}
			if (big_mid.compareTo(big_x) == -1) {
				start = mid;
			}
			if (big_mid_1.compareTo(big_x) == 1) {
				end = mid;
			}
		}
		return ans;
    }
}
