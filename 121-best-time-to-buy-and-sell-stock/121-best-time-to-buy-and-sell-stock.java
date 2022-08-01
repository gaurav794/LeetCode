class Solution {
    public int maxProfit(int[] prices) 
    {
        /*sort the array into temp and find the minimum stock price
         find the index of the stock price in the price array
         from minimum stock price index onwards find the maximum value
         and return the difference of minimum and maximum stock price
        */
        if(prices.length < 2) return 0;

        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i=0;i<prices.length;i++)
        {    
         if(prices[i] < min) min = prices[i];
         else
          max = prices[i]-min > max ? prices[i]-min : max;                   

        }
        
        return max;
    }
}