class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    public void dfs(ArrayList<ArrayList<Integer>> adj ,int k ,ArrayList<Integer> ans , HashSet<Integer> set )
    {
        for(int x = 0 ; x<adj.get(k).size() ; x++)
        {
            if(set.contains(adj.get(k).get(x)))
            continue;
            ans.add(adj.get(k).get(x));
            set.add(adj.get(k).get(x));
            dfs(adj , adj.get(k).get(x) , ans ,set);
        }
    }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList();
        HashSet<Integer> set = new HashSet();
        if(V==0)
        return ans;
        ans.add(0);
        set.add(0);
        dfs(adj , 0 , ans ,set);
        return ans;
    }
}