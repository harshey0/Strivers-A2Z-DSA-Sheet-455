class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
       while(temp.data==x)
       {
           temp=temp.next;
       }
       temp.prev=null;
       head=temp;
       Node store = head;
       while(temp.next!=null)
       {
           temp=temp.next;
           if(temp.data==x)
           continue;
           store.next=temp;
           temp.prev=store;
           store=temp;
       }
       store.next=null;
       return head;
    }
}