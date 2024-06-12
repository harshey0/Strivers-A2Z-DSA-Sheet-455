class MyStack {

    Queue<Integer> q;

public MyStack() {
    q = new LinkedList();
}

public void push(int e) {
        q.add(e);
        for(int x=0;x<q.size()-1;x++)
        q.add(q.remove());
    
}

public int pop() {
    if(!q.isEmpty())
    return q.remove();
    else return -1;
    
}

public int top() {
    if(!q.isEmpty())
    return q.peek();
    else return -1;
}

public boolean empty() {
    return q.isEmpty();
}
}