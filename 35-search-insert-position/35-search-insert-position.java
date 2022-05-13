class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int index=1;
        int insPos = 0;
        //guard clause
        if(target <= nums[0]) return 0;
        if(target == nums[nums.length-1]) return nums.length-1;
        if(target > nums[nums.length-1]) return nums.length;
        
            
        while(index < nums.length)
        {
            
            if(target==nums[index-1]) {insPos = index -1;break;}
            else if(target==nums[index] || (target > nums[index-1] && target < nums[index]))
                {insPos = index;}
            
            index++;
        }
        return insPos;
    }
}