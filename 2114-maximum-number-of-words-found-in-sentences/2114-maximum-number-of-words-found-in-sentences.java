class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int noOfWords = 0;
        
        for(int index=0;index < sentences.length;index++)
        {
            // split works as an array so use length
           int tempNoOfWords = sentences[index].split(" ").length;
           if(tempNoOfWords > noOfWords)
           {
               noOfWords = tempNoOfWords;
           }
           
        }
        
        return noOfWords;
        
    }
}