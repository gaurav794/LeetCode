class Solution {
    
    //O(n^2)
    public static String longestPalindrome(String s) 
    {
        String max = "";
        int temp = 0;
        String str = "";
        int len = s.length();

        if(s.equals(new StringBuilder(s).reverse().toString()))
                return s;
        //O(n^2)
        for(int i=0;i<len/2;i++)//O(n)
        {                    
            char ch =s.charAt(i);
            str += ch;
            //palindrome check
            max = str.length() > max.length() && isPalindrome(str) ? str : max; //O(n)

            if(i == (s.length()-1))
            {
                temp++;
                i = temp -1;
                str="";
            }
            
        }
        //O(n^2)
        for(int i=len/2;i<len;i++)
        {                    
            char ch =s.charAt(i);
            str += ch;
            //palindrome check
             max = str.length() > max.length() && isPalindrome(str) ? str : max;

            if(i == (s.length()-1))
            {
                temp++;
                i = temp -1;
                str="";
            }
            
        }
        
        return max;
    }
    public static boolean isPalindrome(String str)
    {
        int l = 0;
        int r = str.length()-1;
        while(r > l)
        {
            if(str.charAt(l++) != str.charAt(r--))
                return false;
        }
        return true;
    }
}