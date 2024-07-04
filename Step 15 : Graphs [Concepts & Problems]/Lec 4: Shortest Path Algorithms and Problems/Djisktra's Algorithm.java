class Pair
{
    int a, b;
    Pair(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int dist[]= new int[V];
        int v[]= new int[V];
        for(int x=0;x<V;x++)
        {
            dist[x]=Integer.MAX_VALUE;
        }
        dist[S]=0;      
        PriorityQueue<Pair> q = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair x, Pair y) {
                return x.b - y.b;
            }
        });
        q.add(new Pair(S,0));
        while(!q.isEmpty())
        {      
            Pair p=q.remove();
                v[p.a]=1;             
                
            for(int x=0;x<adj.get(p.a).size();x++)
            {
                if(v[adj.get(p.a).get(x).get(0)]==1)
                continue;
                if(dist[adj.get(p.a).get(x).get(0)]<=adj.get(p.a).get(x).get(1)+p.b)
                continue;
                dist[adj.get(p.a).get(x).get(0)]=adj.get(p.a).get(x).get(1)+p.b;
                q.add(new Pair(adj.get(p.a).get(x).get(0),dist[adj.get(p.a).get(x).get(0)]));
            }
        }
        return dist;
    }
}