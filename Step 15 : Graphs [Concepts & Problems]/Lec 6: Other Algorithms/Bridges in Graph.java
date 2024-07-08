class Solution {

    void dfs(List<List<Integer>> adj ,int v[], int []d, int []ld , int a , int p , int time ,List<List<Integer>> ans)
    {
            v[a]=1;
            d[a]=time;
            ld[a]=time++;

        for(int x : adj.get(a))
        {
            if(x==p)
            continue;
            if(v[x]==0)
            {
                dfs(adj,v,d,ld,x,a,time,ans);
                ld[a]=Math.min(ld[a],ld[x]);
                if(d[a]<ld[x])
                ans.add(new ArrayList<>(){{add(a);add(x);}});
            }
            else
            ld[a]=Math.min(ld[a],d[x]);
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> edge) {
        
        int d[]= new int[n];
        int ld[]= new int[n];
        int v[]= new int[n];
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int x=0;x<n;x++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(List<Integer> x: edge)
        {
            adj.get(x.get(0)).add(x.get(1));
            adj.get(x.get(1)).add(x.get(0));
        }
        for(int x =0;x<n;x++)
        {
            if(v[x]==0)
          dfs(adj,v,d,ld,0,-1,0 , ans);
        }
        return ans;
    }
}