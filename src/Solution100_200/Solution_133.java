package Solution100_200;

import java.util.ArrayList;

public class Solution_133 {
	ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> ans = new ArrayList<String> ();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dictionary.length; i ++) {
        		if (max == dictionary[i].length()) {
        			ans.add(dictionary[i]);
        		} else if (max > dictionary[i].length()) {
        			max = dictionary[i].length();
        			ans.removeAll(ans);
        			ans.add(dictionary[i]);
        		}
        }
        return ans;
    }
}
