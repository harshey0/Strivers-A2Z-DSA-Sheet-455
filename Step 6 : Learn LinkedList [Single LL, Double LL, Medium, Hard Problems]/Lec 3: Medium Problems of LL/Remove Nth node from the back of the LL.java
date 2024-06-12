class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null|| n==0)
        return head;
        ListNode temp=head;
        ListNode temp2=head;
        int c=0;
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
            temp2=temp2.next;
            if(c==n)
            temp2=head;
        }
        if(temp==temp2)
        return head.next;
        if(temp2.next==null)
        temp=null;
        else
        temp=temp2.next.next;
        temp2.next=temp;
        return head;
    }
}