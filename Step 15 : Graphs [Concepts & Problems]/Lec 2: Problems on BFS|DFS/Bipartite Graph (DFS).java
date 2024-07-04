class Solution {

    public boolean col(int[][] graph , int a , int []color)
    {
        for(int x=0;x<graph[a].length;x++)
        {
            if(color[graph[a][x]]==color[a])
            return true;
            if(color[graph[a][x]]==0)
            {
                color[graph[a][x]]=-color[a];
                if(col(graph, graph[a][x] , color))
            return true;
            }
        }
        return false;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color []= new int [n];
        for(int x=0;x<n;x++)
        {
            if(color[x]!=0)
            continue;
            color[x]=1;
            if(col(graph, x , color))
            return false;
        }
        return true;
    }
}