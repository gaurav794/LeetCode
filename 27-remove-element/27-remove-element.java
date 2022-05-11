class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int k = 0;
        if(nums == null || nums.length < 1) return k;
        
        for(int index = 0; index < nums.length;index++)
        {
            if(nums[index] != val)
            {
               nums[k] = nums[index];
               k++;
            }
        }
       nums = Arrays.copyOfRange(nums,0,k);
        return k;
    }
}