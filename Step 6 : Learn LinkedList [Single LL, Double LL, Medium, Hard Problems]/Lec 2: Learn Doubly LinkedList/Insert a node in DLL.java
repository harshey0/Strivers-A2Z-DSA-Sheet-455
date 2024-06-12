class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node temp, int pos, int data)
	{
		// Your code here
		Node d= new Node(data);
		for(int x=0;x<pos;x++)
		{
		    temp=temp.next;
		}
		Node temp2 =temp.next;
		temp.next=d;
		d.prev=temp;
		d.next=temp2;
		if(temp2!=null)
		temp2.prev=d;
	}
}