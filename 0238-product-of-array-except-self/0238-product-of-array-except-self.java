class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        //flag
        if(nums == null || nums.length == 0)
        {
            return new int[0];
        }
        
        int[] arr = new int[nums.length];
        int len = nums.length;
        
        // Product of values before 0 index
        int runningProduct = 1;

        // Left Pass
        
        for(int i=0;i<len;i++)
        {            
            arr[i] = runningProduct;
            runningProduct = runningProduct*nums[i];
        }
        
        //Reset
        // Product of values after length-1 index
        runningProduct = 1;
        
        // Right Pass
        
        for(int i=len-1;i>=0;i--)
        {            
            //left Pass value * running Product
            arr[i] = arr[i]*runningProduct;
            runningProduct = runningProduct*nums[i];
        }
        
        
        return arr;
    }
    
       
}