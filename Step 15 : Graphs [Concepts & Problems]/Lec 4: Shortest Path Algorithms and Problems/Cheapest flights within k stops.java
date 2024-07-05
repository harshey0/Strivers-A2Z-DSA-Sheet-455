class Solution {
    public int findCheapestPrice(int n, int[][] edges, int S, int D, int k) {
        
        int dist[]= new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S]=0;      
        
        for(int x=0;x<=k;x++)
        {
            int temp [] = Arrays.copyOf(dist,n);
            for(int i=0;i<edges.length;i++)
            {
                if(temp[edges[i][0]] == Integer.MAX_VALUE)
                continue;
                dist[edges[i][1]]=Math.min(dist[edges[i][1]],temp[edges[i][0]]+edges[i][2]);
            }
        }
        return dist[D] == Integer.MAX_VALUE ? -1 : dist[D];
    }
}