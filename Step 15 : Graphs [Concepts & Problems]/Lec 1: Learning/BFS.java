class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue <Integer> q = new LinkedList();
        ArrayList<Integer> list = new ArrayList();
        HashSet<Integer>set= new HashSet();
        q.add(0);
        set.add(0);
        while(!q.isEmpty())
        {
            int c=q.remove();
         list.add(c);
                for(int y=0;y<adj.get(c).size();y++)
                {
                    if(!set.contains(adj.get(c).get(y)))
                    q.add(adj.get(c).get(y));
                        set.add(adj.get(c).get(y));
                }
            }
        return list;
    }
}