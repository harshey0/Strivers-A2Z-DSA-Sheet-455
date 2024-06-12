class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node zero=null;
        Node one=null;
        Node two=null;
        Node temp=head;
         Node one1=null;
        Node two1=null;
        Node zero1=null;
        while(temp!=null)
        {
            if(one==null && temp.data==1)
            {one=temp;one1=temp;}
            else if(zero==null && temp.data==0)
            {zero=temp;zero1=temp;}
            else if(two==null && temp.data==2)
            {two=temp;two1=temp;}
            else if(temp.data==0)
            {
                zero1.next=temp;
                zero1=temp;
            }
             else if(temp.data==1)
            {
                one1.next=temp;
                one1=temp;
            }
             else if(temp.data==2)
            {
                two1.next=temp;
                two1=temp;
            }
            temp=temp.next;
        }
        if(one!=null)
        one1.next=two;
        if(zero!=null)
        zero1.next=one;
        if(two!=null)
        two1.next=null;
        if(zero== null && one==null)
        zero=two;
        else if(zero==null && two==null)
        zero=one;
        else if(zero==null)
        zero=one;
        else if(one== null)
        zero1.next=two;
        return zero;
    }
}