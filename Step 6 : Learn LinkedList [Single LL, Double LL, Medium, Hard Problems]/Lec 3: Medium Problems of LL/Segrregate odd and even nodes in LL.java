class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null)
        return head;
        ListNode even = head;
        ListNode head2 = head.next;
        ListNode odd = head;

        while(even.next!=null && odd.next.next!=null)
        {
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
            odd.next=even.next;
        }
        even.next=head2;
        return head;
        
    }
}