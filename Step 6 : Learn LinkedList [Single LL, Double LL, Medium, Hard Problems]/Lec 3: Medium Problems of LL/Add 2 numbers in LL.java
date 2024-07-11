class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int c=0;
        ListNode ans = new ListNode();
        ListNode n = ans;
        while(l1!=null && l2!=null)
        {
            int d=l1.val+l2.val+c;
            c=d/10;
            ListNode temp =new ListNode(d%10);
            n.next=temp;
            n=temp;
            l1=l1.next;
            l2=l2.next;
        }
        if(l2!=null)
        l1=l2;
        while(l1!=null)
        {
            int d=l1.val+c;
            c=d/10;
            ListNode temp =new ListNode(d%10);
            n.next=temp;
            n=temp;
            l1=l1.next;
        }
        if(c==1)
         {ListNode temp =new ListNode(1);n.next=temp;}
         return ans.next;

    }
}