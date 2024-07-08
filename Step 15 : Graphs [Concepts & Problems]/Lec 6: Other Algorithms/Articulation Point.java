class Solution
{
        void dfs(ArrayList<ArrayList<Integer>> adj ,int v[], int []d, int []ld , int a , int p , int time ,ArrayList<Integer> ans ,int []ap )
    {
            v[a]=1;
            d[a]=time;
            ld[a]=time++;
            int child=0;
        for(int x : adj.get(a))
        {
            if(x==p)
            continue;
            if(v[x]==0)
            {
                dfs(adj,v,d,ld,x,a,time,ans,ap);
                ld[a]=Math.min(ld[a],ld[x]);
                child++;
                if((ap[a]!=1)&&((p!=-1 && d[a]<=ld[x])||(p==-1 && child>1)))
                {ap[a]=1;ans.add(a);}
            }
            else
            ld[a]=Math.min(ld[a],d[x]);
        }
    }
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> articulationPoints(int n,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
         int d[]= new int[n];
        int ld[]= new int[n];
        int v[]= new int[n];
        int ap[]= new int[n];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x =0;x<n;x++)
        {
            if(v[x]==0)
          dfs(adj,v,d,ld,0,-1,0 , ans ,ap);
        }
        Collections.sort(ans);
        if(ans.size()==0)
        ans.add(-1);
        return ans;
    }
}