package Solution300_400;

public class Solution_365 {
	public int countOnes(int num) {
        int count = 0;
        while (num != 0) {
        		num = num & (num - 1);
        		count ++;
        }
        return count;
    }
}
