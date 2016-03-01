package Solution300_400;

public class Solution_366 {
	
	public int fibonacci(int n) {
        if (n == 1) {
        		return 0;
        }
        if (n == 2) {
        		return 1;
        }
        int sum = 0;
        int[] array = new int[2];
        array[0] = 0;
        array[1] = 1;
        for (int i = 3; i <= n; i ++) {
        		sum += array[0] + array[1];
        		array[0] = array[1];
        		array[1] = sum;
        }
        return sum;
    }
}
