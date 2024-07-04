class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean dfs(ArrayList<ArrayList<Integer>> adj , int p , HashSet<Integer> set , int y ) {
        if(set.contains(p))
        return false;
        set.add(p);
        for(int x=0;x<adj.get(p).size();x++)
        {
            if(adj.get(p).get(x)==y)
            continue;
            if(set.contains(adj.get(p).get(x)))
            return true;
            if(dfs(adj,adj.get(p).get(x),set ,p))
            return true;
        }
        return false;
        
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        HashSet<Integer> set = new HashSet();
        for(int x=0;x<V;x++)
        {
        if(dfs(adj,x ,set,x))
        return true;
        }
        return false;
    }
}