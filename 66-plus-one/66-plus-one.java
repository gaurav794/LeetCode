class Solution {
    public int[] plusOne(int[] test) 
    {
        //Iterating over elements from last index
        //check each element by adding 1 is < 9 or 9
        //check remainder
        //if yes then add one to next element if not break the loop and return the array
        boolean remainder = false;
        
        for(int index = test.length-1;index >=0;index--)
        {
          if(remainder)
          {              
              if(test[index] < 9)
              {
                  test[index] += 1;
                  break;
              }
              if(index == 0 && test[index] == 9)
              {
                test[index] = 0;
                return copyArray(test); 
              }
              
          }
        if(test[index] < 9)
        {
          test[index] +=1;
          break;
        }
        else
        {
           if(index == 0 && test[index] == 9)
          {
            test[index] = 0; 
            return copyArray(test); 
          }
           test[index] = 0; 
           remainder = true;
        }
           
            
        }
       return test;     
    }
    
    public int [] copyArray(int[] test)
    {
       int[] array = new int[test.length+1];
        array[0] = 1;
       for(int index=1;index<array.length;index++)
       {
         array[index] = test[index-1];
       } 
        return array;
    }
}