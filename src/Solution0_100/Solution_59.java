package Solution0_100;

import java.util.Arrays;

public class Solution_59 {
	public static void main (String[] args) {
		Solution_59 test = new Solution_59();
		int[] numbers = {-2,-3,5,-1,-4,5,-11,7,1,2,3,4,-7,-1,-2,-3,-4,-5};
		int target = 45;
		System.out.println (test.threeSumClosest(numbers, target));
	}
	public int threeSumClosest(int[] numbers ,int target) {
		int ans = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
        if (numbers == null || numbers.length < 3) {
        		return ans;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; i ++) {
        		if (i != 0 && numbers[i] == numbers[i - 1]) {
        			continue;
        		}
        		int left = i + 1;
        		int right = numbers.length - 1;
        		while (left < right) {
        			int sum = numbers[i] + numbers[left] + numbers[right];
        			int cha = Math.abs(sum - target);
 System.out.println (sum + "   " + cha + " " + min);
        			if (cha < min) {
        				min = cha;
        				ans = sum;
        			}
        			if (sum == target) {
        				return sum;
        			} else if (sum < target) {
        				left ++;
        			} else {
        				right --;
        			}
        		}
        }
        return ans;
    }
}
