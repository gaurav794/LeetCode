class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        
        HashMap<String,Integer> roman = new HashMap<>();
        roman.put("I",1);
        roman.put("II",2);
        roman.put("III",3);
        roman.put("IV",4);
        roman.put("V",5);
        roman.put("VI",6);
        roman.put("VII",7);
        roman.put("VIII",8);
        roman.put("IX",9);
        roman.put("X",10);
        roman.put("XL",40);
        roman.put("L",50);
         roman.put("XC",90);
         roman.put("C",100);
         roman.put("CD",400);
         roman.put("D",500);
         roman.put("CM",900);
         roman.put("M",1000);
        
        
        int index = 0;
                
        while(index < s.length())
        {
           String currentPos = Character.toString(s.charAt(index));
            String nextPos="";
            if((index + 1) < s.length())
            {
              nextPos = Character.toString(s.charAt(index+1));   
            }
            if((nextPos.isEmpty() == false) && roman.containsKey((currentPos.concat(nextPos))))
            {
              sum += roman.get(((currentPos.concat(nextPos))));  
              index++;
            }
            else
            {
                sum += roman.get(currentPos);  
            }
                               
            index++;
        }
      return sum;  
    }
}