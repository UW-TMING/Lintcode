package Solution0_100;

public class Solution_78 {
	public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int len = strs.length;
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i ++) {
        		if (strs[i].length() < min) {
        			min = strs[i].length();
        			minIndex = i;
        		}
        }
        String str = strs[minIndex];
        String ans = "";
        for (int i = 0; i < str.length(); i ++) {
        		char c = str.charAt(i);
        		for (int j = 0; j < len; j ++) {
        			char temp = strs[j].charAt(i);
        			if (c != temp) return ans;
        		}
        		ans += c;
        }
        return ans;
    }
}
