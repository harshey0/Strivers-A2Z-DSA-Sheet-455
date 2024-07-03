class Solution {

    private void find(int[][] isConnected ,HashSet<Integer> set ,int a)
    {
        for(int x=0;x<isConnected[a].length;x++)
        {
           if(isConnected[a][x]==1 && !set.contains(x))
           { set.add(x);find(isConnected , set , x);}
        }
    }
    public int findCircleNum(int[][] isConnected) {
        HashSet<Integer> set = new HashSet();
        int c=0;
        for(int x=0;x<isConnected.length;x++)
        {
            if(!set.contains(x))
           { set.add(x);find(isConnected , set , x);c++;}
        }
        return c;
    }
}