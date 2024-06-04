class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int s = Math.min(m,n);
        int right= n-1;
        int down= m-1;
        for(int x=0;x<s;x++)
        {
            int left=x;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(target==matrix[x][mid])
            return true;
            if(target<matrix[x][mid])
            right=mid-1;
            else
            left=mid+1;
        }
        int up=x;
        while(up<=down)
        {

            int mid=(down+up)/2;
            if(target==matrix[mid][x])
            return true;
            if(target<matrix[mid][x])
            down=mid-1;
            else
            up=mid+1;
        }

        }
            return false;
    }
}