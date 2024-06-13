class Solution {

    public void col(int[][] matrix , int y) {
         
         int n= matrix.length;
         for(int x=0;x<n;x++)
         {
             if(matrix[x][y]==0)
             {matrix[x][y]=Integer.MAX_VALUE-5;
             row(matrix,x);}
             else
            matrix[x][y]=Integer.MAX_VALUE-5;
         }
 
     }
    public void row(int[][] matrix , int y) {
         
         int m= matrix[0].length;
          for(int x=0;x<m;x++)
         {
              if(matrix[y][x]==0)
              {matrix[y][x]=Integer.MAX_VALUE-5;
             col(matrix,x);}
             else
            matrix[y][x]=Integer.MAX_VALUE-5;
         }
 
     }
     public void setZeroes(int[][] matrix) {
         int n= matrix.length;
         int m= matrix[0].length;
 
         for(int x=0;x<n;x++)
         {
             for(int y=0;y<m;y++)
             if(matrix[x][y]==0)
             {
                  row(matrix,x);
                  col(matrix,y);
                  break;
             }
         }
         for(int x=0;x<n;x++)
         {
             for(int y=0;y<m;y++)
             if(matrix[x][y]==Integer.MAX_VALUE-5)
             {
                  matrix[x][y]=0;
             }
         }
 
     }
 }