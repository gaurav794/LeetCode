class Solution {
    public String intToRoman(int num) 
    {
     //iteration method
       String romanResult = "";
     while(num > 0){
        // MCMXCIV
        if(num >=1000){
           romanResult +="M";
            num -=1000;
            continue;
        }
         else if(num >= 900)
         {
            romanResult +="CM";
             num -=900;
             continue;
         }
         else if(num >= 500)
         {
            romanResult +="D";
             num -=500;
             continue;
         }
         else if(num >= 400)
         {
            romanResult +="CD";
             num -=400;
             continue;
         }
         else if(num >= 100)
         {
            romanResult +="C";
             num -=100;continue;
         }
         else if(num >= 90)
         {
            romanResult +="XC";
              num -=90;continue;
         }
         else if(num >= 50)
         {
            romanResult +="L";
              num -=50;continue;
         }
         else if(num >= 40)
         {
            romanResult +="XL";
              num -=40;continue;
         }
         else if(num >= 10)
         {
            romanResult +="X";
              num -=10;continue;
         }
         else if(num == 9)
         {
            romanResult +="IX";
             num -=9;continue;
         }
         else if(num >= 5)
         {
            romanResult +="V";
              num -=5;continue;
         }
         else if(num == 4)
         {
            romanResult +="IV";
              num -=4;continue;
         }
         else if(num == 3)
         {
            romanResult +="III";
              num -=3;continue;
         }
         else if(num == 2)
         {
            romanResult +="II";
              num -=2;continue;
         }
         else if(num == 1)
         {
            romanResult +="I";
              num -=1;continue;
         }
               
     }
      return romanResult;   
        
    }
}