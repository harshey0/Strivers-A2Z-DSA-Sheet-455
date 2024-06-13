class GfG {
    
    public Stack<Integer> s(Stack<Integer> s , int x) {
    // add code here.
    if(s.size()==0)
   {s.push(x); return s;}
    int c= s.pop();
    if(x<c)
    {
        s(s,x);
        s.push(c);
    }
    else
   { 
    s.push(c);
    s.push(x);
   }
    return s;
}

public Stack<Integer> sort(Stack<Integer> s) {
    // add code here.
    if(s.size()==1)
    return s;
   int c= s.pop();
   sort(s);
   s(s,c);
   return s;
}
}