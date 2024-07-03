class Solution {

    public void dfs(int[][] grid, int x, int y, int color )
    {
        int p = grid[x][y];
        if(p==color)
        return;
        grid[x][y] = color;
        int n = grid.length;
        int m = grid[0].length;
        if (x != 0 && grid[x - 1][y] == p)
        {dfs(grid,x-1,y,color);}

        if(y != 0 && grid[x][y - 1] == p)
        {dfs(grid,x,y-1,color);}

        if(x != n - 1 && grid[x + 1][y] == p)
        {dfs(grid,x+1,y,color);}

        if(y != m - 1 && grid[x][y + 1] == p)
        {dfs(grid,x,y+1,color);}

    }
    public int[][] floodFill(int[][] grid, int x, int y, int color) {
        int n = grid.length;
        int m = grid[0].length;
        dfs(grid,x,y,color);
        return grid;
    }
}