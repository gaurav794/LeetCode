class Solution {
    public int[] buildArray(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[numsLength];
        
        for(int index =0; index< numsLength ; index++){
            
            ans[index] = nums[nums[index]];
        }
        
        return ans;
        
    }
}