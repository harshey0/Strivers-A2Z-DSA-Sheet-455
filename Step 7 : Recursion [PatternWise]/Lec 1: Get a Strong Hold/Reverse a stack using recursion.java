class Solution
{ 
        static void insert(Stack<Integer> s , int c)
    {
        // add your code here
        if(s.size()==0)
       {s.push(c); return;}
        int d= s.pop();
        insert(s,c);
        s.push(d);
    }
    
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size()==1)
        return;
        int c=s.pop();
        reverse(s);
        insert(s,c);
    }
}