class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        for(int x=0;x<matrix.length;x++)
        {
            for(int i =0;i<matrix.length;i++)
            {
                if(i==x)
                continue;
                for(int j=0;j<matrix.length;j++)
                {
                    if(j==x || matrix[i][x]==-1 || matrix [x][j]==-1 || (matrix[i][j]!=-1 && matrix[i][x]+matrix [x][j]>matrix[i][j]) )
                    continue;
                    matrix[i][j]=matrix[i][x]+matrix[x][j];
                }
            }
        }
    }
}