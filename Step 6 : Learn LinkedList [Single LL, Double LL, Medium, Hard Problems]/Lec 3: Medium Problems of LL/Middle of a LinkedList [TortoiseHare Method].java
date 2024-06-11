class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode one = head;
        ListNode two = head;
        while(two.next!=null)
        {
            if(two.next.next==null)
            return one.next;
            one= one.next;
            two = two.next.next;
        }
        return one;
    }
}