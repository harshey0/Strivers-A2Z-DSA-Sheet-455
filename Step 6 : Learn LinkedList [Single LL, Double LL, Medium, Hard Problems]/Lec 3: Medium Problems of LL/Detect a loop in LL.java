public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
        return false;
        ListNode one = head;
        ListNode two = head;

        while( two != null && two.next!=null)
        {
            one = one.next;
            two = two.next.next;
            if(one == two)
            return true;
        }
        return false;
    }
}