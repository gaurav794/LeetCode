class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        //flag nums.length = 1
        if(nums.length == 1)
            return false;
        
        //bubble sort
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums.length-(i+1);j++)
//             {
//                 //swap
//                if(nums[j]>nums[j+1])
//                {
//                    int t = nums[j+1];//stores smaller value
//                    nums[j+1] = nums[j];//updates smaller with larger value
//                    nums[j] = t; // updates larger with small value
//                }
//             }
//         }
        
//         int prev = nums[0];
//         //check
//         for(int i=1;i<nums.length;i++)
//         {
//             if(prev==nums[i])
//                 return true;
//             //stores current value to prev variable for comparision
//             prev = nums[i];
//         }
        
        HashMap<Integer,Integer> kp = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(kp.getOrDefault(nums[i],0) == 0)
                kp.put(nums[i],1);
            else
            {
                return true;
            }
            
        }

        return false;
    }
}