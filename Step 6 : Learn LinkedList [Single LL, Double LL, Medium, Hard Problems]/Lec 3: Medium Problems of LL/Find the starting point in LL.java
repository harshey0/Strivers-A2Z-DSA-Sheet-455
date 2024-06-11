public class Solution {

    public ListNode find(ListNode head) {
     
     if(head==null)
     return null;
     ListNode one = head;
     ListNode two = head;

     while( two != null && two.next!=null)
     {
         one = one.next;
         two = two.next.next;
         if(one== two)
         return one;
     }
     return null;
 }

 public ListNode detectCycle(ListNode head) {
     
     ListNode temp = find(head);
     if(temp==null)
     return temp;
     while(head!=temp)
     {
         head=head.next;
         temp=temp.next;
     }
     return head;
 }
}