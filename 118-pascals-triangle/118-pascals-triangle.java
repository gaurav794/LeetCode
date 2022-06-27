class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
      List<List<Integer>> result = new ArrayList<>();

        for(int i = 0;i<numRows;i++)
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
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}