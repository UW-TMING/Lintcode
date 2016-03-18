package solution400_500;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution_425 {
	public static void main (String[] args) {
		Solution_425 test = new Solution_425 ();
		String digits = "23";
		ArrayList<String> res = test.letterCombinations(digits);
		for (String temp : res) {
			System.out.println (temp);
		}
	}
	HashMap<Character, char[]> hm = new HashMap<Character, char[]> ();
	public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<String> ();
        if (digits == null || digits.length() == 0) return ans;
        hm.put('0', new char[]{});
        hm.put('1', new char[]{});
        hm.put('2', new char[]{'a', 'b', 'c'});
        hm.put('3', new char[]{'d', 'e', 'f'});
        hm.put('4', new char[]{'g', 'h', 'i'});
        hm.put('5', new char[]{'j', 'k', 'l'});
        hm.put('6', new char[]{'m', 'n', 'o'});
        hm.put('7', new char[]{'p', 'q', 'r', 's'});
        hm.put('8', new char[]{'t', 'u', 'v'});
        hm.put('9', new char[]{'w', 'x', 'y', 'z'});
        StringBuffer sb = new StringBuffer ();
        helper (ans, 0, digits, sb);
        return ans;
    }
	public void helper (ArrayList<String> ans, int len, String digits, StringBuffer sb){
		if (len == digits.length()) {
			ans.add(sb.toString());
			return;
		}
		for (char c : hm.get(digits.charAt(len))) {
			sb.append(c);
			helper (ans, len + 1, digits, sb);
			sb.deleteCharAt(len);
		}
	}
}
