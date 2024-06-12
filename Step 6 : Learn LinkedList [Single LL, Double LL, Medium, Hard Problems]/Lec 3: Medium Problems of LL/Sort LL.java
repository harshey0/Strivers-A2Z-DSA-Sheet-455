class Solution {

    public ListNode merge(ListNode head1,ListNode head2) {
        ListNode temp=null;
        if(head1.val<head2.val)
        {temp = head1;head1=head1.next;}
        else
        {temp = head2;head2=head2.next;}
        ListNode head=temp;
        while(head1!=null || head2 != null)
        {
            if(head2!=null && (head1==null || head2.val<head1.val))
            {
                temp.next=head2;
                temp=head2;
                head2=head2.next;
            }
            else
            {
                temp.next=head1;
                temp=head1;
                head1=head1.next;
            }
        }
            temp.next=null;
            return head;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
           ListNode one = head;
        ListNode two = head;
        while(two.next!=null && two.next.next!=null)
        {
            one= one.next;
            two = two.next.next;
        }
        ListNode temp= one.next;
        one.next=null;
        return merge(sortList(head),sortList(temp));
    }
}