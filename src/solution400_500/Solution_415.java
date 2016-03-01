package solution400_500;

public class Solution_415 {
	public static void main (String[] args) {
		Solution_415 test = new Solution_415();
		String s = "race a car";
		System.out.println (test.isPalindrome(s));
	}
	public boolean isCharacter (char c) {
		if (c <= 'z' && c >='a') {
			return true;
		}
		return false;
	}
	public boolean isPalindrome(String s) {
		if (s == "") {
			return true;
		}
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp_i = s.charAt(i);
			while (i < j && !isCharacter (temp_i)) {
				temp_i = s.charAt(++i);
			}
			char temp_j = s.charAt(j);
			while (i < j && !isCharacter (temp_j)) {
				temp_j = s.charAt(--j);
			}
			if (temp_i != temp_j) {
				return false;
			}
			i ++;
			j --;
		}
        return true;
    }
}
