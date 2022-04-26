class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        for(int index =0;index< operations.length;index++)
        {
            switch(operations[index]){
                    case "--X" -> x -= 1;
                    case "X--" -> x -= 1;
                    case "++X" -> x += 1;
                    case "X++" -> x += 1;
                    default -> x += 0;
            }
        }
        return x;
    }
}