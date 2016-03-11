package Solution0_100;

public class Solution_54 {
	public static void main (String[] args) {
		Solution_54 test = new Solution_54 ();
		String str = "-1.123123";
		System.out.println (test.atoi(str));
	}
	public int atoi(String str) {
		if (str == null || str.length() == 0)  return 0;
        str = str.trim();
        int sign = 1;
        int index = 0;
        long ans = 0;
        if (str.charAt(index) == '-') {
    		sign = -1;
    		index++;
        } else if (str.charAt(index) == '+') {
            index ++;
        }
        for (; index < str.length(); index ++) {
    		char c = str.charAt(index);
    		if (c < '0' || c > '9') {
    			if (c == '.') {
    				while (++index < str.length()) {
    					if (str.charAt(index) != '0') return 0;
    				}
    				if (index == str.length()) break;
    			} else {
    			    break;
    			}
    		}
    		ans = ans * 10 + (c - '0');
    		if (ans > Integer.MAX_VALUE) break; 
        }
        if (sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)(sign * ans);
    }
}
