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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        //guard clause
        if(list1 == null && list2 == null)
        {
            return null;
        }
        //To make sure it doesn't contain 0 in the list
        ListNode sortedList = null;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(list1 != null)
        {
            list.add(list1.val);
            list1 = list1.next;
        }
         while(list2 != null)
        {
            list.add(list2.val);
            list2 = list2.next;
        }
       
       Collections.sort(list,Collections.reverseOrder());  
        
        for(Integer x: list)
        {
            sortedList = new ListNode(x, sortedList);
        }
       return sortedList; 
    }
}