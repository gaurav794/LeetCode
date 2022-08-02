class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        // 1 1 2 2 4
        for(int i=0;i<nums.length;i=i+2)
        {
            if(i == nums.length -1)
               return nums[i];
            
            if(nums[i] != nums[i+1])
               return nums[i];
        }
        return 0;
    }
}