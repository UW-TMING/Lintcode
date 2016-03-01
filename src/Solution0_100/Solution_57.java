package Solution0_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_57 {
	public static void main (String[] args) {
		Solution_57 test = new Solution_57();
		int[] numbers = {-1, 1, 0};
		test.threeSum(numbers);
	}
	
	public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (numbers == null || numbers.length == 0) {
        		return ans;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; i ++) {
        		if (i != 0 && numbers[i] == numbers[i - 1]) {
        			continue;
        		}
        		int target = 0 - numbers[i];
        		int left = i + 1;
        		int right = numbers.length - 1;
        		while (left < right) {
        			if (numbers[left] + numbers[right] == target) {
        				ArrayList<Integer> a = new ArrayList<Integer>();
        				int temp_left = numbers[left];
        				int temp_right = numbers[right];
        				a.add(numbers[i]);
        				a.add(numbers[left]);
        				a.add(numbers[right]);
        				ans.add(a);
        				left ++;
        				right --;
        				while (left < right && numbers[left] == temp_left) {
        					left ++;
        				}
        				while (left < right && numbers[right] == temp_right) {
        					right --;
        				}
        			} else if (numbers[left] + numbers[right] < target) {
        				left ++;
        			} else {
        				right --;
        			}
        		}
        }
        return ans;
    }
}
