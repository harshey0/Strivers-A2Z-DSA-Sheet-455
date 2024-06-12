public static Node reverseDLL(Node temp)
{
    //Your code here
    if(temp==null || temp.next==null)
    return temp;
    Node temp2= null;
    while(temp!=null)
    {
        temp2= temp.prev;
        temp.prev=temp.next;
        temp.next=temp2;
        temp=temp.prev;
    }
    return temp2.prev;
}