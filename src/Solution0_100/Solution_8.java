package Solution0_100;

public class Solution_8 {
	public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0 || offset == 0) return;
        if (offset % str.length == 0) return;
        int count = offset % str.length;
        int index = str.length - count;
        int i = 0;
        int j = index - 1;
        swap (str, i, j);
        i = index;
        j = str.length - 1;
        swap (str, i, j);
        i = 0;
        j = str.length - 1;
        swap (str, i, j);
    }
	public void swap (char[] str, int i, int j) {
		while (i < j) {
	    		char temp = str[i];
	    		str[i] = str[j];
	    		str[j] = temp;
	    		i ++;
	    		j --;
		}
	}
}
