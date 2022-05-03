class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int numOfGoodPairs = 0;
        
        for(int i =0; i < nums.length; i++)
        {
            for(int j=0; j < nums.length; j++)
            {
                //To skip self-comparision
                // if((nums[i] == nums[j] && (i < j)))
                // {
                //     numOfGoodPairs++;
                // }
                numOfGoodPairs = ((nums[i] == nums[j] && (i < j))) ? (numOfGoodPairs+1): numOfGoodPairs;
                
            }
            
        }
        
        return numOfGoodPairs;
    }
}