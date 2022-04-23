class Solution {
    public int[] runningSum(int[] nums) {
        int flag = nums[0];
        for(int index=1;index<nums.length;index++){
            flag = flag + nums[index];
            nums[index] = flag;
        }
        return nums;
    }
}