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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode distinct = null;
        ArrayList<Integer> values = new ArrayList<>();
        int current = 0;
        int previous =-101;
        //first value will be unique
        while(head != null)
        {
            current = head.val;
            if(current != previous)
            {
                values.add(current);
                previous = current;
            }
            head = head.next;
        }
        //add elements to listnode
        for(int index = values.size()-1;index>=0;index--)
        {
           distinct = new ListNode(values.get(index),distinct); 
        }
        return distinct;
    }
    
}