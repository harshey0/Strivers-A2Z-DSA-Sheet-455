class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
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
      for(int l=0;l<V;l++)
      {
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