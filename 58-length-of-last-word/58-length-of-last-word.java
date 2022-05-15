class Solution {
    public int lengthOfLastWord(String s) 
    {
        //guard clause
        if(s.length() == 1)
        {
            return 1;
        }
        s = s.trim();
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}