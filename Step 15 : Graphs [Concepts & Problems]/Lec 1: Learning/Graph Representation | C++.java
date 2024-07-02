//User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        List<List<Integer>> ans = new ArrayList();
        for(int x=0;x<V;x++)
        {
        List<Integer> list = new ArrayList();
        ans.add(list);
        }
        
        for(int x=0;x<edges.length;x++)
        {
            ans.get(edges[x][0]).add(edges[x][1]);
            ans.get(edges[x][1]).add(edges[x][0]);
        }
        return ans;
    }
}