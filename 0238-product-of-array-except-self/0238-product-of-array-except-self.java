class Solution {
    
    /*TIME COMPLEXIY ---> O(N)
    
        O(N)+O(N) = O(2N) WHICH EQUALS TO O(N)
       
    SPACE COMPLEXITY ---> O(1)
    
        SINGLE ARRAY IS USED FOR OPERATIONS
    */
    
    public int[] productExceptSelf(int[] nums) 
    {
        //flag
        if(nums == null || nums.length == 0)
        {
            return new int[0];
        }
        
        int[] result = new int[nums.length];
        int[] leftPass = new int[nums.length];
        int[] rightPass = new int[nums.length];
        int len = nums.length;
                
        // Left Pass operation which stores product of number from 0 to n-1 index
        // O(N)
        // leftPass[0] = nums[0];
        int prod = 1;
        for(int i=0;i<len;i++)
        {  
           prod*=nums[i];
           leftPass[i] = prod;           
        }
        
        // Right Pass operation which stores product of number from n-1 to 0 index
        //O(N)
        prod = 1;
        for(int i=len-1;i>=0;i--)
        {
            prod*=nums[i];
            rightPass[i] = prod;
        }
        result[0]=rightPass[1];
        for(int i=1;i<len-1;i++)
        {
            result[i] = leftPass[i-1]*rightPass[i+1];
        }  
        result[len-1]=leftPass[len-2];
        return result;
    }
    
       
}