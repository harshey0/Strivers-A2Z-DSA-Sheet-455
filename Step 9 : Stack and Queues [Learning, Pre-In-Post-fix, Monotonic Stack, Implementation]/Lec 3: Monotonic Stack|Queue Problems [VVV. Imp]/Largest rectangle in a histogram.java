class Pair{
    int p1,p2;
    Pair(int x,int y)
    {
        p1=x;p2=y;
    }
}
class Solution {
    public ArrayList<Integer> prev(int[] n) {
      
        Stack<Pair> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList();
        list.add(-1);
        for(int x=1;x<n.length;x++)
       { 
        if(n[x]>n[x-1])
        {list.add(x-1);s.push(new Pair(n[x-1],x-1));}
        else
        {
            while(!s.isEmpty() && s.peek().p1>=n[x])
            {
                s.pop();
            }
            int c=-1;
            if(!s.isEmpty())
            c=s.peek().p2;
            list.add(c);
        }
       }
       return list;
    }
    public ArrayList<Integer> next(int[] n) {
      
        Stack<Pair> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList();
        list.add(-1);
        for(int x=n.length-2;x>=0;x--)
       { 
        if(n[x]>n[x+1])
        {list.add(0,x+1);s.push(new Pair(n[x+1],x+1));}
        else
        {
            while(!s.isEmpty() && s.peek().p1>=n[x])
            {
                s.pop();
            }
            int c=-1;
            if(!s.isEmpty())
            c=s.peek().p2;
            list.add(0,c);
        }
       }
       return list;
    }
    public int largestRectangleArea(int[] heights) {
        ArrayList<Integer> prev = prev(heights);
        ArrayList<Integer> next = next(heights);
        int max=0;

        for(int x=0;x<heights.length;x++)
        {
            int c=x-prev.get(x);
            int d=next.get(x)-x-1;
            if(next.get(x)<0)
            d=heights.length-next.get(x)-x-2;
            // System.out.println(c+" "+d);
            max=Math.max(max,(c+d)*heights[x]);
        }
        return max;
    }
}