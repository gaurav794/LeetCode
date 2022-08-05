class Solution {
    
    int maxlen = 0;
    public int lengthOfLongestSubstring(String s) 
    {
        for(int i=0;i < s.length();i++)
        {
            subArrayCheck(s.substring(i,s.length()));
        }
        
    return maxlen;        
    }
    
    public void subArrayCheck(String s)
    {
        String str = "";
        
        for(int i=0;i<s.length();i++)
        {
            String ch = Character.toString(s.charAt(i));
            int index = str.indexOf(ch);
            if(index < 0)
            {
                str += ch;
                maxlen = str.length() > maxlen ? str.length() : maxlen;
            }
            else
            {                
                return;
            }
            
        }
    }
}