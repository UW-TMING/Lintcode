package Solution100_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution_171 {
	
	public long getHash (int[] count) {
		long hash = 0;
		int b = 378551;
		int a = 63689;
		for (int num : count) {
			hash = hash * a + num;
			a = a * b;
		}
		return hash;
	}
	
	public List<String> anagrams(String[] strs) {
        List<String> ans = new ArrayList<String> ();
        if (strs == null || strs.length == 0) return ans;
        HashMap<Long, ArrayList<String>> hm = new HashMap<Long, ArrayList<String>> ();
        for (String str : strs) {
        		int[] count = new int[26];
        		for (int i = 0; i < str.length(); i ++) {
        			count[str.charAt(i) - 'a'] ++;
        		}
        		long hash = getHash(count);
        		if (!hm.containsKey(hash)) hm.put(hash, new ArrayList<String> ());
        		hm.get(hash).add(str);
        }
        Iterator  iter = hm.keySet().iterator();
        while (iter.hasNext()) {
        		ArrayList<String> val = hm.get(iter.next());
        		if (val.size() > 1) {
        			ans.addAll(val);
        		}
        }
        	return ans;
    }
}
