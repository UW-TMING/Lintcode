package Solution0_100;

public class Solution_13 {
	public static void main (String[] args) {
		String source = "abbbdefd";
		String target = "bbd";
		Solution_13 test = new Solution_13 ();
		System.out.println (test.strStr(source, target));
	}
	public int strStr(String source, String target) {
		if(source == null || target == null || source.length() < target.length()) 
            return -1;
        
        //["abc", ""] return 0?    
        if(target.length() == 0)
            return 0;
            
        int j = 0;    
        for(int i = 0; i <= source.length() - 1; i ++)
        {
            if(source.charAt(i) == target.charAt(j) && j == target.length() -1)
                return i - j;
                
            if(source.charAt(i) == target.charAt(j))
                j++;
            else 
                j = 0;
        }
        return -1;
    }
}
