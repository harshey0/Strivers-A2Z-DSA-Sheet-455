class Solution
{
         void dfs(int p ,ArrayList<ArrayList<Integer>> adj ,Stack<Integer> s ,HashSet<Integer> set  )
    {
        set.add(p);
        for(int x=0;x<adj.get(p).size();x++)
        {
           if(!set.contains(adj.get(p).get(x)))
            {
                dfs(adj.get(p).get(x),adj,s,set);
            }
        }
        s.push(p);
    }
    //Function to return list containing vertices in Topological order. 
     Stack<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> s = new Stack();
        HashSet<Integer> set = new HashSet();
        for(int x=0;x<V;x++)
        {
            if(!set.contains(x))
            {
                dfs(x,adj,s,set);
            }
        }
        return s;
    }
    void d(ArrayList<ArrayList<Integer>> adj , int x, int []v)
    {
        for(int i=0;i<adj.get(x).size();i++)
        {
            if(v[adj.get(x).get(i)]==1)
            continue;
            v[adj.get(x).get(i)]=1;
            d(adj,adj.get(x).get(i),v);
        }
    }
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        Stack<Integer> s = topoSort(V,adj);
        ArrayList<ArrayList<Integer>> t = new ArrayList();
        for(int x=0;x<V;x++)
        {
            t.add(new ArrayList<Integer>());
        }
        for(int x=0;x<V;x++)
        {
            for(int i : adj.get(x))
            {
                t.get(i).add(x);
            }
        }
        int ans=0;
        int v[]= new int[V];
        for(int x=0;x<V;x++)
        {
            int d= s.pop();
            if(v[d]==1)
            continue;
            v[d]=1;
            d(t,d,v);
            ans++;
        }
        return ans;
    }
}
