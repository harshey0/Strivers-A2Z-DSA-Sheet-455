class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    arr[rear++]=x;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(rear==0)
		return -1;
		int c=arr[0];
		for(int x=0;x<rear;x++)
		arr[x]=arr[x+1];
		rear--;
		return c;
	} 
}