package Solution300_400;

import java.util.ArrayList;
import java.util.List;

public class Solution_390 {
	public static void main(String[] args) {
		Solution_390 test = new Solution_390();
		int[] A1 = {1 , 2 , 3 , 6 , 5};
		int[] A2 = {16, 19, 23, 20, 6};
		int[] A3 = {15, 20, 22, 21, 7};
		int[] A4 = {14, 18, 19, 22, 10};
		int[] A5 = {13, 14, 11, 10, 9};
		int[][] A = {A1, A2, A3, A4, A5};
		System.out.println (test.findPeakII_temp(A));
	}
	public List<Integer> findPeakII_temp(int[][] A) {
		List<Integer> ans = new ArrayList<Integer> ();
        if (A == null) {
        		return ans;
        }
        int rows = A.length;
        int cols = A[0].length;
        int start = 0;
        int end = rows - 1;
        int col_start = 0;
        int col_end = cols - 1;
        while (start <= end) {
        		int row_mid = (start + end) / 2;
        		int row_index = getMax_temp (row_mid, col_start, col_end, A);
        		if (row_mid > 0 && A[row_mid][row_index] < A[row_mid - 1][row_index]) {
        			end = row_mid - 1;
        		} else if (row_mid < A.length - 1 && A[row_mid][row_index] < A[row_mid + 1][row_index]) {
        			start = row_mid + 1;
        		} else {
        			ans.add(row_mid);
        			ans.add(row_index);
        			return ans;
        		}
        		
        		int col_mid = (col_start + col_end) / 2;
        		int col_row_index = getMax_temp_col(col_mid, start, end, A);
        		if (col_mid > 0 && A[col_row_index][col_mid] < A[col_row_index][col_mid - 1]) {
        			col_end = col_mid - 1;
        		} else if (row_mid < A[0].length - 1 && A[col_row_index][col_mid] < A[col_row_index][col_mid + 1]) {
        			col_start = col_mid + 1;
        		} else {
        			ans.add(col_mid);
        			ans.add(col_row_index);
        			return ans;
        		}
        }
        return ans;
	}
	public int getMax_temp_col (int col, int i, int j, int[][] A) {
		int max = Integer.MIN_VALUE;
		int index = i;
		for (int k = i; k <= j; k ++) {
			if (A[k][col] > max) {
				max = A[k][col];
				index = k;
			}
		}
		return index;
	}
	
	
	public int getMax_temp (int row, int i, int j, int[][] A) {
		int max = Integer.MIN_VALUE;
		int index = i;
		for (int k = i; k <= j; k ++) {
			if (A[row][k] > max) {
				max = A[row][k];
				index = k;
			}
		}
		return index;
	}
	
	public List<Integer> findPeakII(int[][] A) {
        List<Integer> ans = new ArrayList<Integer> ();
        if (A == null) {
        		return ans;
        }
        int rows = A.length;
        int cols = A[0].length;
        int start = 0;
        int end = rows - 1;
        while (start <= end) {
        		int mid = (start + end) / 2;
        		int mid_col = getMax (mid, A);
        		if (mid > 0 && A[mid][mid_col] < A[mid - 1][mid_col]) {
        			end = mid - 1;
        		} else if (mid < rows - 1 && A[mid][mid_col] < A[mid + 1][mid_col]) {
        			start = mid + 1;
        		} else {
        			ans.add(mid);
        			ans.add(mid_col);
        			break;
        		}
        		
        }
        return ans;
    }
	public int getMax (int row, int[][] A) {
		int max = Integer.MIN_VALUE;
		int ans = 0;
		for (int i = 0; i < A[0].length; i ++) {
			if (A[row][i] > max) {
				max = A[row][i];
				ans = i;
			}
		}
		return ans;
	}
}
