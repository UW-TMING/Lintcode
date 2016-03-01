package Solution100_200;

public class Solution_144_2 {
	public void rerange(int[] A) {
        if (A == null || A.length < 3) {
        		return;
        }
        int left = 0;
        int right = A.length - 1;
        int temp = A[left];
        while (left < right) {
        		while (left < right && A[right] > 0) {
        			right --;
        		}
        		A[left] = A[right];
        		while (left < right && A[left] <= 0) {
        			left ++;
        		}
        		A[right] = A[left];
        }
        A[left] = temp;
        int negative_count = 0;
        int positive_count = 0;
        if (temp <= 0) {
        		negative_count = left + 1;
        } else {
        		negative_count = left;
        }
        positive_count = A.length - negative_count;
        if (positive_count == negative_count) {
        		left = 1;
        		right = A.length - 2;
        } else if (positive_count < negative_count) {
        		left = 1;
        		right = A.length - 1;
        } else {
        		left = 0;
        		right = A.length - 2;
        }
        while (left < right) {
        		int t = A[left];
        		A[left] = A[right];
        		A[right] = t;
        		left += 1;
        		right -= 1;
        }
    }
}
