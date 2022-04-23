class Solution {
    public int[] runningSum(int[] nums) {
        int flag = 0;
        for(int index=0;index<nums.length;index++){
            flag = flag + nums[index];
            nums[index] = flag;
        }
        return nums;
    }
}