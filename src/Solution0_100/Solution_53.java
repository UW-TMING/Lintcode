package Solution0_100;

public class Solution_53 {
	public static void main (String[] args) {
		String s = " hello        world  uw";
		Solution_53 test = new Solution_53 ();
		System.out.println (test.reverseWords1(s));
	}
	
	public String reverseWords(String s) {
		if (s == null || s.length() == 0)  return "";
		String[] array = s.split(" ");
		StringBuffer sb = new StringBuffer ();
		for (int i = array.length - 1; i >= 0; i --) {
			if (array[i].equals("")) {
				sb.append(" ");
			} else {
				sb.append(array[i]).append(" ");
			}
		}
		return sb.toString();
    }
	public String reverseWords1(String s) {
		if (s == null || s.length() == 0)  return "";
		char[] array = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		swap (array, i, j);
		for (char c : array) {
			System.out.print(c);
		}
		int start = 0;
		int end = 0;
		while (start < array.length) {
			while (start < array.length && array[start] == ' ') start ++;
			end = start;
			while (end < array.length && array[end] != ' ') end ++;
			swap(array, start, end - 1);
			start = end;
		}
		String str= "";
		boolean flag = true;
		for (char c : array) {
			if (c != ' ') {
				str += c;
				flag = false;
			} else {
				if (!flag) {
					str += ' ';
					flag = true;
				}
			}
		}
		return str;
    }
	public void swap (char[] array, int i, int j) {
		if (i >= array.length || j >= array.length) return; 
		while (i < j) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i ++;
			j --;
		}
	}
}
