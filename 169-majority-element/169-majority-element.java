class Solution {
    public int majorityElement(int[] nums) 
    {
        
        int key = 0;
        int maxCount = 0;
        HashMap<Integer,Integer> elm = new HashMap<>();
        // 3 2 3 3 2        
        for(int i=0;i<nums.length;i++)
        {
            if(elm.containsKey(nums[i]))
            {
                elm.replace(nums[i],elm.get(nums[i])+1);
                
                int temp = elm.get(nums[i]);
                if(temp > maxCount)
                {
                    maxCount = temp;
                    key = nums[i];
                }
            }
            else
            {
                elm.put(nums[i],1);
                int temp = elm.get(nums[i]);
                if(temp > maxCount)
                {
                    maxCount = temp;
                    key = nums[i];
                }
            }
        }
        
        return key;
    }
}