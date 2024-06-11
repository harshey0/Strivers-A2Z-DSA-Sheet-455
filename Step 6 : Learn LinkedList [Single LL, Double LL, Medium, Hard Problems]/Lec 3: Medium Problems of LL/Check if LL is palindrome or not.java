class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
        return false;
        ListNode one = head;
        ListNode two = head; 
         while(two.next!=null && two.next.next!=null)
        {
            one= one.next;
            two = two.next.next;
        }
        one=one.next;
       if(one!=null && one.next!=null)
       {
        ListNode temp =one.next;
        one.next=null;
        while(temp != null)
        {
             ListNode temp2 =temp.next;
             temp.next=one;
             one=temp;
             temp=temp2;
        }
       }
       while(one!=null)
       {
        if(one.val!=head.val)
        return false;
        one=one.next;
        head=head.next;
       }
       return true;
    }
}