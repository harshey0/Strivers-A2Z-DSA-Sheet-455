class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj , int p ,int v[],int c[]) {
        if(v[p]==1)
        return true;
        if(c[p]==1)
        return false;
        c[p]=1;
        v[p]=1;
        for(int x=0;x<adj.get(p).size();x++)
        {
            if(dfs(adj,adj.get(p).get(x),v,c))
            return true;
        }
        v[p]=0;
        return false;
        
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int c[]=new int [V];
        int v[]=new int [V];
        for(int x=0;x<V;x++)
        {
        if(dfs(adj,x ,v,c))
        return true;
        }
        return false;
    }
}