package Solution100_200;

public class Solution_157 {
	public boolean isUnique(String str) {
		if (str == null || str.length() == 0) return true;
        boolean[] helper = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
        		int val = str.charAt(i);
        		if (helper[val]) return false;
        		else helper[val] = true;
        }
        return true;
    }
}
