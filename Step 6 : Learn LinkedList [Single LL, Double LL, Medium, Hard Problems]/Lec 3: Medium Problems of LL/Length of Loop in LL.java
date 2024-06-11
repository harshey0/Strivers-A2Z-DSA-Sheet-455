class Solution
{
    static Node find(Node head) {
        
        if(head==null)
        return null;
        Node one = head;
        Node two = head;

        while( two != null && two.next!=null)
        {
            one = one.next;
            two = two.next.next;
            if(one == two)
            return one;
        }
        return null;
    }
    
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node temp= find(head);
        if(temp==null)
        return 0;
        Node temp2= temp.next;
        int c=1;
        while(temp!=temp2)
        {
            c++;
            temp2=temp2.next;
        }
        return c;
        
    }
}