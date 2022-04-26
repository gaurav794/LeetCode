class Solution {
    public int maximumWealth(int[][] accounts) {
        int sumOfWealth = 0;
        int maxWealth = 0;
        for(int i = 0; i < accounts.length ; i++)
        {
            for(int j = 0; j < accounts[i].length; j++)
            {
                
                sumOfWealth += accounts[i][j];
            }
            
            if(sumOfWealth > maxWealth)
            {
                maxWealth = sumOfWealth;
            }
            //assign to zero
            sumOfWealth = 0;
        }
        
        return maxWealth;
        
    }
}