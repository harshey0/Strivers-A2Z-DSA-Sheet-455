class Solution
{
    static void dfs(int p ,ArrayList<ArrayList<Integer>> adj ,Stack<Integer> s ,HashSet<Integer> set  )
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
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
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
        int ans[] = new int[V];
        for(int x=0;x<V;x++)
        {
            ans[x]=s.pop();
        }
        return ans;
    }
}