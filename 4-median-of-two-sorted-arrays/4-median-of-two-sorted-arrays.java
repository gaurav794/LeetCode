class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //add arrays
        int[] nums = addArrays(nums1,nums2);
        int numsLength = nums.length; 
        double median = 0;
        //sort the array
        Arrays.sort(nums);
        if(numsLength % 2 == 0){
        median = (double)((nums[numsLength/2] + nums[(numsLength/2) -1]))/ (double)2;
        }
        else{
        median = nums[numsLength/2];
        }
        return median;
    }
    
    public int[] addArrays(int[] nums1, int[] nums2){
        
        int length = nums1.length + nums2.length;
        int[] array = new int[length];
        for(int index=0;index<length;index++){            
            //Until length of nums1 array
            if(index < nums1.length){
                array[index] = nums1[index];
            }
            else{
                //Access nums2 elements fron zero index
                array[index] = nums2[index-nums1.length];
            }
        }
        // sorted the array
        return array;
    }
}