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
    public boolean isPalindrome(ListNode head) 
    {
        // String num = "";
        List<Integer> num = new ArrayList<>();
        
        while(head != null)
        {
            // num+=Integer.toString(head.val);
            num.add(head.val);
            head = head.next;
        }
        
        return check(num);
    }
    
    public boolean check(List<Integer> s)
    {
        int l = 0;
        int r = s.size() - 1;
        while(r > l)
        {
           if(s.get(r) != s.get(l))
               return false;
           l++;
           r--;
        }
        return true;
    }
}