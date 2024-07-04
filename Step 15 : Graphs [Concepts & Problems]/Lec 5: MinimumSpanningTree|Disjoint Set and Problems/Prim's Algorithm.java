class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        int ans=0;
        int v[]= new int[V];
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
    @Override
    public int compare(int[] a, int[] b) {
        return a[1] - b[1];
    }
});
         pq.add(new int []{0,0});
        while(!pq.isEmpty())
        {
            int d[] = pq.remove();
            if(v[d[0]]==1)
            continue;
            ans+=d[1];
            v[d[0]]=1;
            for(int x=0;x<adj.get(d[0]).size();x++)
            {
                pq.add(new int []{adj.get(d[0]).get(x)[0],adj.get(d[0]).get(x)[1]});
            }
        }
        return ans;
    }
}