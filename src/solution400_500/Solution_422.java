package solution400_500;

public class Solution_422 {
	public int lengthOfLastWord(String s) {
		int ans = 0;
        if (s == null || s.length() == 0) return ans;
        int index = s.length() - 1;
        int end = index;
        int start = index;
        while (index >= 0 && s.charAt(index) == ' ') {
        		index --;
        }
        end = index;
        while (index >= 0 && s.charAt(index) != ' ') {
        		index --;
        }
        start = index;
        return end - start + 1;
    }
}
