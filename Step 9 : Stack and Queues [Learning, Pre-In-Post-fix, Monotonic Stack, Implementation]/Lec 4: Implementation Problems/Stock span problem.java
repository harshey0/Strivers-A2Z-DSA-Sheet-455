class Pair{
    int x;int y;
    public Pair(int a , int b)
    {
        x=a;y=b;
    }
}
class StockSpanner {
    
    Stack<Pair> s ;
    int val;
    public StockSpanner() {
        s= new Stack();
    }
    
    public int next(int price) {
        if(s.isEmpty() || s.peek().x>price)
        {
            s.push(new Pair(price,1));
            return 1;
        }
            int c=1;
            while(!s.isEmpty() && s.peek().x<=price)
            {c+=s.pop().y;}
        s.push(new Pair(price,c));
        return c;
    }
}
