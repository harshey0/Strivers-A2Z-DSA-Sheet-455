public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> n) {
      
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList();
        list.add(-1);
        for(int x=1;x<n.size();x++)
       { 
        if(n.get(x)>n.get(x-1))
        {list.add(n.get(x-1));s.push(n.get(x-1));}
        else
        {
            while(!s.isEmpty() && s.peek()>=n.get(x))
            {
                s.pop();
            }
            int c=-1;
            if(!s.isEmpty())
            c=s.peek();
            list.add(c);
        }
       }
       return list;
    }
}