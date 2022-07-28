class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
//         List<List<Integer>> list = new ArrayList<>();
//         int counter = 0;
        
//         for(int i=0;i <= rowIndex;i++)
//         {
//           List<Integer> row = new ArrayList<>();
//         // 1 
//           for(int j=0;j <= i;j++)
//             {
//                System.out.println(""+ ++counter);
              
//                 if(j == 0 || j == i) row.add(1);
//                 else
//                   {
//                       //last row values of current index and previous index(index-1)
//                       int value = list.get(i-1).get(j) + list.get(i-1).get(j-1);
//                       row.add(value);
//                   }
            
//             }
            
//             list.add(i,row);
    
//         }
//         return list.get(rowIndex);
        
        List<List<Integer>> result = new ArrayList<>();
    int counter = 0;
        for(int i = 0;i<=rowIndex;i++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = new ArrayList<>();
            int len = 0;
            if(result.size() > 0)
            {
                len = result.size();
                prevRow = result.get(i-1);
            }
                
            row.add(1);
            
            if(len > 0)
            {
                for(int j=1;j<len;j++)
                {
                    System.out.println(++counter);
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
                row.add(1);
            }

            result.add(row);
        }

        return result.get(rowIndex);
        
    }
}