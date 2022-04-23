class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int arrayLength = nums.length;
        boolean isEqualToTarget = false;
        for(int outerIndex=0;outerIndex<arrayLength;outerIndex++)
        {
            for(int innerIndex = 0; innerIndex < arrayLength;innerIndex++)
            {
                if(outerIndex != innerIndex ){
                isEqualToTarget = (nums[outerIndex] + nums[innerIndex]) == target;
                if(isEqualToTarget){
                    if(outerIndex > innerIndex){
                    indices[0] = innerIndex;
                    indices[1] = outerIndex;
                    }
                    else{
                      indices[0] = outerIndex;
                    indices[1] = innerIndex;  
                    }
                    break;
                }
            }
            }
        }
        return indices;
        
    }
}