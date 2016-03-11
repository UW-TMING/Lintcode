package Solution200_300;

public class Solution_200 {
	public static void main (String[] args) {
		Solution_200 test = new Solution_200 ();
		String s = "abcdzdcab";
		System.out.println (test.longestPalindrome(s));
	}
	public String longestPalindrome(String s) {
		String ans = "";
		if (s == null || s.length() == 0) return ans;
		int count = 1;
		int max = 0;
		int len = s.length();
		for (int i = 1; i <= 2 * len; i ++) {
			count = 1;
			while (i - count >= 0 && i + count <= 2 * len && getChar(s, i - count) == getChar(s, i + count)) {
				count ++;
			}
			count --;
			if (count > max) {
				max = count;
				ans = s.substring((i - count)/2, (i + count)/2);
			}
		}
		return ans;
	}
	public char getChar (String s, int index) {
		if (index % 2 == 0) return '#';
		else return s.charAt(index / 2);
	}
}
