class GfG {
    
    public Stack<Integer> s(Stack<Integer> s , int max) {
    // add code here.
    if(s.size()==0)
   {s.push(max); return s;}
    int c= s.pop();
    if(max<c)
    {
        s(s,max);
        s.push(c);
    }
    else
   { s(s,c);
    s.push(max);}
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