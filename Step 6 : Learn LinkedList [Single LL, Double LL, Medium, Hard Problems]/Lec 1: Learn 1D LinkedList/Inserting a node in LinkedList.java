class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        if(head==null)
        return new Node(x);
        Node temp = head;
        while(temp.next != null)
        {
            temp=temp.next;
        }
        Node temp2=new Node(x);
        temp.next=temp2;
        return head;
        
    }
}