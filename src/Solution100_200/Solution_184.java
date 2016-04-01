package Solution100_200;

import java.util.Arrays;
import java.util.Comparator;

class NumbersComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return (s2 + s1).compareTo(s1 + s2);
	}
}

public class Solution_184 {
	public String largestNumber(int[] num) {
        if (num == null || num.length == 0) return "";
        String[] strs = new String[num.length];
        for (int i = 0; i < num.length; i ++) {
        		strs[i] = Integer.toString(num[i]);
        }
        Arrays.sort(strs, new NumbersComparator());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i ++) {
        		sb.append(strs[i]);
        }
        String result = sb.toString();
        int index = 0;
        while(index < result.length() && result.charAt(index) == '0') {
        		index ++;
        }
        if(index == result.length()) {
        		return "0";
        }
        return result.substring(index);
    }
}
