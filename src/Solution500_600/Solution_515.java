package Solution500_600;

public class Solution_515 {
	public static void main (String[] args) {
		int[][] costs = {{14, 2, 11}, {11, 14, 5}, {14, 3, 10}};
		Solution_515 test = new Solution_515 ();
		System.out.println (test.minCost(costs));
	}
	public int[][] dp;
	public int[][] visit;
	public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) return 0; 
        int len = costs.length;
        dp = new int[len][3];
        visit = new int[len][3];
        int temp0 = search(0, costs, 0);
        int temp1 = search(0, costs, 1);
        int temp2 = search(0, costs, 2);
        int temp = Math.min(temp0, temp1);
        return Math.min(temp, temp2);
    }
	public int search (int i, int[][] costs, int position) {
		if (i >= costs.length) return 0;
		if (visit[i][position] == 1) return dp[i][position];
		if (position == 0) {
			dp[i][position] = Math.min(search(i + 1, costs, 1),  search(i + 1, costs, 2)) + costs[i][position];
		}
		if (position == 1) {
			dp[i][position] = Math.min(search(i + 1, costs, 0),  search(i + 1, costs, 2)) + costs[i][position];
		}
		if (position == 2) {
			dp[i][position] = Math.min(search(i + 1, costs, 0),  search(i + 1, costs, 1)) + costs[i][position];
		}
		visit[i][position] = 1;
		return dp[i][position];
	}
}
