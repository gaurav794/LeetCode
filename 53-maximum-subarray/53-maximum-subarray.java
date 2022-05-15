class Solution {
    public int maxSubArray(int[] nums) 
    {
        int currentMaxSum = nums[0];
        int maxSum = nums[0];
        for(int index=1;index<nums.length;index++)
        {
           currentMaxSum = Math.max(currentMaxSum+nums[index],nums[index]); 
           maxSum = Math.max(maxSum,currentMaxSum);
        }
        return maxSum;
    }

}