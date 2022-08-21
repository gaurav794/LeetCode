class Solution 
{
  public static int minSetSize(int[] arr) 
  {
     
    /*
    Explaination
    9 -> 14
    38-> 12
    19-> 10
    77-> 9
    63-> 8
    5 times
    {22,92,14,54,8,18,68,58}   
    */
      int arrLen = arr.length;
      int len = (arr.length)/2;
      int set = 0;
      //add elements to freq hashmap
      Map<Integer,Integer> map = new HashMap<>();      
      for(int e:arr)
          map.put(e,map.getOrDefault(e,0)+1);  
      //list containing freq values
      List<Integer> freq = new ArrayList<>(map.values());
      //sort freq hashmap in descending order
      Collections.sort(freq,Collections.reverseOrder());
      
      for(int i=0;i<freq.size();i++)
      {
            //remove the max freq occurences from the total length of the array
            //until it becomes atleast half size or less
            if(arrLen > len)
            {
                //increment the set count
                set++;
                arrLen = arrLen - freq.get(i);
            }     
            else
              break;
      }
      return set;
    }
}