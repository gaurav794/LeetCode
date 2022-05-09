class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        //iterate on each element
        String result = strs[0];
        //guard clause
        if(strs.length == 1) return strs[0];
        
        for(int index=1;index < strs.length;index++)
        {
            String[] currentElement = strs[index].split("");
            String[] temp = result.split("");
            int len = currentElement.length < temp.length ?  currentElement.length :temp.length;
           for(int inner=0;inner < (len);inner++)
            {
                if(currentElement[inner].equals(temp[inner]) && !strs[index].isEmpty())
                {
                    result = strs[index].substring(0,inner+1);                    
                }
                   else
                   {
                       if(strs[index].startsWith(result)) break;
                       return "";
                   }
            }
            
            
        }
        return result;
    }
}