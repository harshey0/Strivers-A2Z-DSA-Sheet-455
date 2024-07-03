class Pair
{
    int p,d;
    Pair(int x, int y)
    {
        p=x;d=y;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean bfs(ArrayList<ArrayList<Integer>> adj, HashSet<Integer> set , Queue <Pair> q  ) {
        while(!q.isEmpty())
       { 
           int a = q.peek().p;
           int b = q.remove().d;
           for(int x=0;x<adj.get(a).size();x++)
        {
            if(adj.get(a).get(x)==b)
            continue;
            if(set.contains(adj.get(a).get(x)))
            return true;
            set.add(adj.get(a).get(x));
            q.add(new Pair(adj.get(a).get(x),a));
        }}
        
        return false;
        
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue <Pair> q = new LinkedList();
        for(int x=0;x<V;x++)
        {
        HashSet<Integer> set = new HashSet();
        set.add(x);
        q.add(new Pair(x,x));
        if(bfs(adj,set , q))
        return true;
        }
        return false;
    }
}