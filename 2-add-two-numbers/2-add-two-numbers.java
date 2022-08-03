import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        //function to return all list node values
        //add the values of both list nodes
        //
        //using modulo add the remainder in the list node
        //return the ListNode;
        BigInteger sum = getNodeValues(l1).add(getNodeValues(l2));
        // StringBuilder rev = new StringBuilder(Integer.toString(sum));        
       
        String revVal = sum.toString();   
        
        // System.out.println(revVal);
        ListNode list = null;
        
        for(int i = 0; i < revVal.length();i++ )
        {
            String str = Character.toString(revVal.charAt(i));
            int val = Integer.parseInt(str);
            // System.out.println(val);
            list = new ListNode(val,list);
        }                

      return list;  
    }
    
    public BigInteger getNodeValues(ListNode l)
    {
        String number = "";
        
        while(l != null)
        {
           number += Integer.toString(l.val); 
           l = l.next;
        }
        //reverse and return
        StringBuilder rev = new StringBuilder(number);
        return new BigInteger(rev.reverse().toString());
    }
}