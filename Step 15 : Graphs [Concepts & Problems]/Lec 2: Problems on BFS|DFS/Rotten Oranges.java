class Solution {
    public int orangesRotting(int[][] grid) {
        int c=-1;
        int p=0;
        int n = grid.length;
        int m = grid[0].length;
        while(p==0)
        {
            p=1;c++;
                ArrayList<ArrayList<Integer>> a = new ArrayList();
                 for(int x=0;x<n;x++)
            {
                    ArrayList<Integer> list = new ArrayList();
                    a.add(list);
            }

            for(int x=0;x<n;x++)
            {
                for(int y=0;y<m;y++)
                {
                    if(a.get(x).contains(y))
                    continue;
                    if(grid[x][y]==2)
                    {
                        if(x!=0 && grid[x-1][y]==1)
                        {
                            p=0;grid[x-1][y]=2;
                        }
                        if(y!=0 && grid[x][y-1]==1)
                        {
                            p=0;grid[x][y-1]=2;
                        }
                        if(x!=n-1 && grid[x+1][y]==1)
                        {
                            p=0;a.get(x+1).add(y);grid[x+1][y]=2;
                        }
                        if(y!=m-1 && grid[x][y+1]==1)
                        {
                            p=0;a.get(x).add(y+1);grid[x][y+1]=2;
                        }
                    }
                }
            }
        }
         for(int x=0;x<n;x++)
            {
                for(int y=0;y<m;y++)
                {
                    if(grid[x][y]==1)
                    return -1;
                }
            }
        return c;
    }
}