class Solution {
    static private void find(ArrayList<ArrayList<Integer>> isConnected ,HashSet<Integer> set ,int a)
{
    for(int x=0;x<isConnected.get(a).size();x++)
    {
       if(isConnected.get(a).get(x)==1 && !set.contains(x))
       { set.add(x);find(isConnected , set , x);}
    }
}
static int numProvinces(ArrayList<ArrayList<Integer>> isConnected, int V) {
    // code here
     HashSet<Integer> set = new HashSet();
    int c=0;
    for(int x=0;x<isConnected.size();x++)
    {
        if(!set.contains(x))
       { set.add(x);find(isConnected , set , x);c++;}
    }
    return c;
}
};