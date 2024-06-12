class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int n)
    {
	// Your code here
	Node temp=head;
	for(int x=2;x<=n;x++)
	{
	    temp=temp.next;
	}
	Node prev = temp.prev;
	Node next = temp.next;
	if(prev != null)
	prev.next=next;
	if(next !=null)
	next.prev=prev;
	if(prev==null)
	return next;
	return head;
    }
}