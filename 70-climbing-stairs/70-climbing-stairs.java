class Solution {
    public int climbStairs(int n) { 
        //guard clauses
        if(n<=3) return n;
        //fibonacci series
        int a = 2;
        int b = 3;
        int result = 0;
        //4
        for(int number = 4; number <=n;number++)
        {
           result =  b + a;//5
           a = b;//5
           b= result;//8
        }
        
        return result;
    }
}