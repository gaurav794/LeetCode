class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        
        for(int index=0;index<candies.length;index++)
        {
            if((candies[index]+extraCandies) >= maxCandies)
            {
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        
        return result;
        
        
    }
}