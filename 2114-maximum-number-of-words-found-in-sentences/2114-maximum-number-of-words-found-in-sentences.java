class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int noOfWords = 0;
        
        for(int index=0;index < sentences.length;index++)
        {
            // split works as an array so use length
           if((sentences[index].split(" ").length) > noOfWords)
           {
               noOfWords = (sentences[index].split(" ").length);
           }
           
        }
        
        return noOfWords;
        
    }
}