class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode c= new QueueNode(a);
        if(rear!=null)
        rear.next=c;
        rear=c;
        if(front==null)
        front=c;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null)
        return -1;
        int c= front.data;
        front=front.next;
        return c;
        
	}
}