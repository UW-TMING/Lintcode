package Solution100_200;

public class Solution_187 {
	public static void main (String[] args) {
		int[] gas = {1, 2, 3, 3};
		int[] cost = {2, 1, 5, 1};
		System.out.println (canCompleteCircuit(gas, cost));
	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas == null || cost == null || gas.length != cost.length || gas.length == 0) return -1;
        int globalSum = gas[0] - cost[0];
        int localSum = globalSum;
        int ans = 0;
        int max = localSum;
        int start = 0;
        for (int i = 1; i < gas.length; i ++) {
        		int diff = gas[i] - cost[i];
        		globalSum += diff;
        		if (globalSum > max) {
        			ans = start;
        			max = globalSum;
        		}
        		if (localSum < 0) {
        			localSum = 0;
        			start = i;
        		}
        		localSum += diff;
        }
        if (globalSum < 0) return -1;
        if (localSum > max) ans = start;
        return ans;
	}
	public static int canCompleteCircuit1(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length != cost.length || gas.length == 0) return -1;
        int ans = -1;
        int sum  = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i ++) {
        		sum += gas[i] - cost[i];
        		total += gas[i] - cost[i];
        		if (sum < 0) {
        			ans = i;
        			sum = 0;
        		}
        }
        return total < 0 ? -1 : (ans + 1);
    }
}
