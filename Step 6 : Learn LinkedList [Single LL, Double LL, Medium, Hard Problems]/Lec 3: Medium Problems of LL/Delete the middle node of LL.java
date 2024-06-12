class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null)
        return null;
        
          ListNode one = head;
        ListNode two = head;
        while(two.next!=null && two.next.next!=null)
        {
            two = two.next.next;
            if(two.next != null)
            one= one.next;
        }
        one.next=one.next.next;
        return head;
    }
}