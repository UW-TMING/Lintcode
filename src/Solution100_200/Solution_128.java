package Solution100_200;

public class Solution_128 {
	public static void main(String[] args) {
		char[] key = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int HASH_SIZE = 2607;
		System.out.println (new Solution_128().hashCode(key, HASH_SIZE));
	}
	public int hashCode(char[] key,int HASH_SIZE) {
		long sum = 0;
		for (int i = 0; i < key.length; i ++) {
			int temp = (int)key[i];
			int power = 1;
			int index = key.length - 1 - i;
			while (index > 0) {
				power = power * 33 % HASH_SIZE;
				index --;
			}
			sum += temp * power;
		}
		return (int) (sum % HASH_SIZE);
    }
}
