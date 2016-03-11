package Solution0_100;

public class Solution_79 {
	public int longestCommonSubstring(String A, String B) {
		if (A == null || B == null || B.length() == 0) return 0;
        int[][] ans = new int[2][A.length() + 1];
        int max = 0;
        for (int i = 1; i <= B.length(); i ++) {
        		for (int j = 1; j <= A.length(); j ++) {
        			char a = A.charAt(j - 1);
        			char b = B.charAt(i - 1);
        			if (a == b) {
        				ans[i % 2][j] = ans[(i - 1) % 2][j - 1] + 1;
        				if (ans[i % 2][j] > max) {
        					max = ans[i % 2][j];
        				}
        			} else {
        				ans[i % 2][j] = 0;
        			}
        		}
        }
        return max;
    }
}
