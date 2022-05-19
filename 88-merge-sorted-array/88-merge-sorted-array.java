class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        for(int index=m;index<m+n;index++)
        {
            nums1[index] =nums2[index-m]; 
        }
        
        Arrays.sort(nums1);
    }
}