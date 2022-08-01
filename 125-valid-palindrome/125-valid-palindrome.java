class Solution {
    public boolean isPalindrome(String s) 
    {
        String regex = "[^a-zA-Z0-9]";
        
        s = s.replaceAll(regex,"").toLowerCase();
        StringBuilder rev = new StringBuilder(s);
        String x = rev.reverse().toString().toLowerCase();
      
        return s.equals(x);  
    }
}