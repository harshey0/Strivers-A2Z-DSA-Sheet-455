class Pair {
    int x;int y;
    public Pair(int a, int b) {
        x=a;y=b;
    }
}
class MinStack {

    Stack <Pair> s;

    public MinStack() {
        
        s= new Stack();
    }
    
    public void push(int val) {
       if(s.isEmpty())
       s.push(new Pair(val,val));
       else
       s.push(new Pair(val,Math.min(val,s.peek().y)));
    }
    
    public void pop() {
       s.pop();
    }
    
    public int top() {
        return s.peek().x;
    }
    
    public int getMin() {
        return s.peek().y;
    }
}