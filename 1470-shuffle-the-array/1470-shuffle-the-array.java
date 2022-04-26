class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] results = new int[nums.length];
        int div = 0;
        for(int index=0; index < nums.length;index+=2)
        {
            //x values
            results[index] = nums[div];                       
            //y values
            results[index+1] = nums[div+n]; 
            div+=1; 
        }
        return results;
    }
}