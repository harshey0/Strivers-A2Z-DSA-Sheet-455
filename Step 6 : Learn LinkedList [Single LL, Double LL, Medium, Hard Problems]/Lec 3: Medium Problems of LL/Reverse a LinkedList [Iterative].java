class Solution {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null)
        return head;
        ListNode temp =head.next;
        head.next=null;
        while(temp != null)
        {
             ListNode temp2 =temp.next;
             temp.next=head;
             head=temp;
             temp=temp2;
        }
        return head;
    }
}