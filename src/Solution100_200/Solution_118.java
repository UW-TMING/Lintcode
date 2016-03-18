package Solution100_200;

public class Solution_118 {
	public int numDistinct(String S, String T) {
        if (S == null || T == null || S.length() == 0 || T.length() == 0) return 0;
        int ans = 0;
        int len = S.length();
        int[] helper = new int[len + 1];
        for (int i = 0; i < S.length(); i ++) {
        		for (int j = 0; j < T.length(); j ++) {
        			if (T.charAt(j) == S.charAt(i)) {
        				helper[i + 1] = helper[i] + 1;
        				if (helper[i + 1] > ans) ans = helper[i + 1];
        			} else {
        				helper[i + 1] = 0;
        			}
        		}
        }
        return ans;
    }
}
