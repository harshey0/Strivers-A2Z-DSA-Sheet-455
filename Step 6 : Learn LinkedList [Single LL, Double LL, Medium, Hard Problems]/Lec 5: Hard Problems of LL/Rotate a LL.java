class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return head;
        ListNode temp=head;
        ListNode tail=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;c++;
        }
        temp=head;k=k%c;
        while(temp.next!=null)
        {
            if(k==0)
            tail=head;
            if(k<=0)
           { 
            tail=tail.next;}
            temp=temp.next;
            k--;
        }
        temp.next=head;
        temp=tail.next;
        tail.next=null;
        return temp;
    }
}