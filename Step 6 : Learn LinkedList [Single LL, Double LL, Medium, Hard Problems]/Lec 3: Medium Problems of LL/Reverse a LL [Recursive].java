class Solution {

    public ListNode reverse(ListNode head, ListNode temp) {

        ListNode temp2 =temp.next;
        temp.next=head;
        if(temp2==null)
        return temp;
        else
        return reverse(temp,temp2);
    }
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null)
        return head;
        ListNode temp =head.next;
        head.next=null;
       return reverse(head, temp);
    }
}