class Solution {
    public int maxSubArray(int[] nums) 
    {
        //edge case
        if(nums == null || nums.length == 0)
            return -99999;
        if(nums.length == 1)
            return nums[0];
        
        int len = nums.length, sum = nums[0], maxSum = nums[0];
        
        for(int i=1;i<len;i++)
        {
            sum+=nums[i];
            
            if(nums[i] > sum) // current number is greater than maxsum
                sum = nums[i];
            if(sum>maxSum)
                maxSum = sum;
        }
        
        return maxSum;
    }
}