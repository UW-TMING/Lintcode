package solution400_500;

public class Solution_408 {
	public static void main (String[] args) {
		Solution_408 test = new Solution_408 ();
		String a = "11";
		String b = "1";
		System.out.println (test.addBinary1(a, b));
	}
	public String addBinary(String a, String b) {
		if (a == null || b == null) return "";
		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		int alen = a.length() - 1;
		int blen = b.length() - 1;
		int carries = 0;
		String ans = "";
		while (blen >= 0) {
			int sum = (int)(a.charAt(alen) - '0') + (int)(b.charAt(blen) - '0') + carries;
			ans = String.valueOf(sum % 2) + ans;
			carries = sum / 2;
			blen --;
			alen --;
		}
		while (alen >= 0) {
			int sum = (int)(a.charAt(alen) - '0') + carries;
			ans = String.valueOf(sum % 2) + ans;
			carries = sum / 2;
			alen --;
		}
		if (carries == 1) ans = "1" + ans;
		return ans;
	}
	public String addBinary1(String a, String b) {
        if (a == null || b == null) return "";
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        while (bInt != 0) {
        		int temp = aInt ^ bInt;
        		bInt = (aInt & bInt) << 1;
        		aInt = temp;
        }
        return aInt + "";
    }
}
