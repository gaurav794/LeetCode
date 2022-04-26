class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] results = new int[2*n];
        int xdiv = 0;
        int div = n;
        for(int index=0; index < nums.length;index++)
        {
            //x values
            results[index] = nums[xdiv];
            xdiv+=1;            
            //y values
            results[index+1] = nums[div]; 
            div+=1;

            index+=1;
        }
        return results;
    }
}