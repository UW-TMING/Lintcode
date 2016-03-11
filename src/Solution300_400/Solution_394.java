package Solution300_400;

public class Solution_394 {
	public boolean firstWillWin(int n) {
        if (n == 1 || n == 2 ) return true;
        if (n == 3 || n == 0) return false;
        boolean temp1 = true;
        boolean temp2 = false;
        boolean current = false;
        for (int i = 4; i <= n; i ++) {
        		if (temp1 == false || temp2 == false) {
        			current = true;
        		} else {
        			current = false;
        		}
        		temp1 = temp2;
        		temp2 = current;
        }
        return current;
    }
}
