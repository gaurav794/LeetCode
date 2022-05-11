class Solution {
    public boolean isValid(String s) 
    {
        //guard clause
        if(s == null || s.length() == 0)
        {
            return false;
        }
        //Create Stack
        Stack<Character> parentheses = new Stack<>();
        
        int pivot = 0;        
        int strLength = s.length();
        boolean condition = true;
          
        while(pivot < strLength)
        {
            char currentChar = s.charAt(pivot);    
            switch(currentChar)
            {
                case '(','[','{' -> parentheses.push(currentChar);
                //If stack is already empty means "]" example then put conditionfalse
                case ')' -> {if(!parentheses.empty() && parentheses.peek() == '(') parentheses.pop();
                             else condition = false;}
                case ']' -> {if(!parentheses.empty() && parentheses.peek() == '[') parentheses.pop();
                             else condition = false;}
                case '}' -> {if(!parentheses.empty() && parentheses.peek() == '{') parentheses.pop();
                             else condition = false;}
                default -> pivot = pivot;
                
            }            
            pivot++;
        }
        
        
        return parentheses.empty() && condition;
        
    }
}