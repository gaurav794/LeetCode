class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i <= rowIndex;i++)
        {
          List<Integer> row = new ArrayList<>();
        // 1 
          for(int j=0;j <= i;j++)
            {
                if(j == 0 || j == i) row.add(1);
                else
                  {
                      //last row values of current index and previous index(index-1)
                      System.out.println(list);
                      int value = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                      System.out.println(value);
                      row.add(value);
                  }
            
            }
            
            list.add(i,row);
    
        }
        return list.get(rowIndex);
    }
}