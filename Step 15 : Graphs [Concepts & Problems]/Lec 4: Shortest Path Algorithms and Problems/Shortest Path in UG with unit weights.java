class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int S) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        for(int x=0;x<n;x++)
        {
            ArrayList<Integer> list = new ArrayList();
            adj.add(list);
        }
        for(int x=0;x<m;x++)
        {
            adj.get(edges[x][0]).add(edges[x][1]);
            adj.get(edges[x][1]).add(edges[x][0]);
        }
        
        int ans[]= new int [n];
        Arrays.fill(ans,-1);
        ans[S]=0;
        Queue<Integer> q = new LinkedList();
        q.add(S);
        int c=1;
        while(!q.isEmpty())
        {
            int p = q.size();
            for(int i=0;i<p;i++)
            {
            int a = q.remove();
            for(int x=0;x<adj.get(a).size();x++)
            {
                if(ans[adj.get(a).get(x)]!=-1)
                continue;
                ans[adj.get(a).get(x)]=c;
                q.add(adj.get(a).get(x));
            }
            }
            c++;
        }
        return ans;
    }
}