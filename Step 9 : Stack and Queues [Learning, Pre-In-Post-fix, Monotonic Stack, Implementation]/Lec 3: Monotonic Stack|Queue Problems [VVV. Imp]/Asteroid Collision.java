class Solution {
    public int[] asteroidCollision(int[] a) {
        
        Stack<Integer> s =new Stack();
        for(int x=0;x<a.length;x++)
        {
            if(!s.isEmpty() && (a[x]<0 && s.peek()>0))
            {
                while(!s.isEmpty() && s.peek()>0 && s.peek()<-a[x])
                {s.pop();}
                if(s.isEmpty() || s.peek()<0)
                s.push(a[x]);
                else if(s.peek()==-a[x])
                s.pop();
            }
            else
            s.push(a[x]);

        }
        int ans[] =new int[s.size()];
        for(int x=s.size()-1;x>=0;x--)
            ans[x]=s.pop();
            return ans;
    }
}