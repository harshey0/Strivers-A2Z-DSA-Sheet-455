class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
            int dist[]= new int[V];
            int no[]= {-1};
        Arrays.fill(dist,100000000);
        dist[S]=0;      
        
        for(int x=0;x<V-1;x++)
        {
            for(int i=0;i<edges.size();i++)
            {
                if(dist[edges.get(i).get(0)] == 100000000 )
                continue;
                dist[edges.get(i).get(1)]=Math.min(dist[edges.get(i).get(1)],dist[edges.get(i).get(0)]+edges.get(i).get(2));
            }
        }
          for(int i=0;i<edges.size();i++)
            { 
                if(dist[edges.get(i).get(0)] == 100000000 )
                continue;
                if(dist[edges.get(i).get(1)]>dist[edges.get(i).get(0)]+edges.get(i).get(2))
                return no;
            }
        return dist;
    }
}