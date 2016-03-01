package Solution200_300;

public class Solution_212 {
	public int replaceBlank(char[] string, int length) {
        int count = 0;
        for (int i = 0; i < length; i ++) {
        		if (string[i] == ' ') {
        			count += 2;
        		}
        }
        int lastIndex = length + count - 1;
        for (int i = length; i >= 0; i --) {
        		if (string[i] == ' ') {
        			string[lastIndex --] = '0';
        			string[lastIndex --] = '2';
        			string[lastIndex --] = '%';
        		} else {
        			string[lastIndex --] = string[i];
        		}
        }
        return lastIndex - 1;
    }
}
