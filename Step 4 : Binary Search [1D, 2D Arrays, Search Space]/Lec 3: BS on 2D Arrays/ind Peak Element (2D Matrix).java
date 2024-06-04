class Solution {
    public int[] findPeakGrid(int[][] mat) {
           int m = mat.length;
        int n = mat[0].length;
        int row=0;
        int col=0;
        int c=mat[0][0];
        for(;;)
        {
        int d=0, e=0;
            if(row<m-1 && c<mat[row+1][col])
                {d=1;c=mat[row+1][col];}
            if(row !=0 && c<mat[row-1][col])
                {d=-1;c=mat[row-1][col];}
            if(col<n-1 && c<mat[row][col+1])
                {e=1;d=0;c=mat[row][col+1];}
            if(col!=0 && c<mat[row][col-1])
                {e=-1;d=0;c=mat[row][col-1];}
                if(d==0 && e==0)
                return new int[]{row,col};
                row+=d;col+=e;
        }

    }
}