class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
        
        int e[]=new int [0];
        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        for(int x=0;x<V;x++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int x=0;x<prerequisites.length;x++)
        {
            adj.get(prerequisites[x][0]).add(prerequisites[x][1]);
        }
      int degree[] = new int [V];
      int ans[] = new int [V];
      for(int x=0;x<V;x++)
      {
          for(int y=0;y<adj.get(x).size();y++)
          {
              degree[adj.get(x).get(y)]++;
          }
      }
      Queue<Integer> q = new LinkedList();
    for(int x=0;x<V;x++)
      {
          if(degree[x]==0)
          q.add(x);
      }
      for(int l=V-1;l>=0;l--)
      {
        if(q.isEmpty())
        return e;
          int c =q.remove();
          for(int y=0;y<adj.get(c).size();y++)
          {
          degree[adj.get(c).get(y)]--;
          if(degree[adj.get(c).get(y)]==0)
          q.add(adj.get(c).get(y));
          }
          ans[l]=c;
      }
      return ans;
    }
}