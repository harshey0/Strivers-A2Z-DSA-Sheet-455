class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length-1;
        int i=0;
        while(n>i)
        {
            for(int y=i;y<n;y++)
               { int c = matrix[i][y];
                matrix[i][y]=matrix[n-y+i][i];
                matrix[n-y+i][i]=matrix[n][n-y+i];
                matrix[n][n-y+i]=matrix[y][n];
                matrix[y][n]=c;} n--;i++;
        }
    }
}