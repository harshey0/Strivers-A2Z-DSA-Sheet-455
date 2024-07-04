class Solution {
    static int A[];
    Solution()
    {
        A= new int[1001];
    for(int x=0;x<1001;x++)
    A[x]=x;
    }
    static int find(int X)
        {
          //add code here.
          if(A[X]!=X)
          A[X]= find(A[X]);
          return A[X];
	}
	static void unionSet(int X,int Z)
        {
         //add code here.
         int a = find(X);
         int b = find(Z);
         A[a]=b;
	}
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        int ans=0;
        int c=0;
        ArrayList<ArrayList<Integer>> edges = new ArrayList();
        for(int x=0;x<adj.size();x++)
        {
            for(int y=0;y<adj.get(x).size();y++)
            {
                edges.add(new ArrayList(Arrays.asList(x,adj.get(x).get(y)[0],adj.get(x).get(y)[1])));
            }
        }
        Collections.sort(edges,(a,b)->a.get(2)-b.get(2));
        for(int x=0;c<V-1;x++)
        {
            int a = find(edges.get(x).get(0));
            int b = find(edges.get(x).get(1));
            if(a==b)
            continue;
            unionSet(a,b);
            ans+=edges.get(x).get(2);
            c++;
        }
        return ans;
    }
}