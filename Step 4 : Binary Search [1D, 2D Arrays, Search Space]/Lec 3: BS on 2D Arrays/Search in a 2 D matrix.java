class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left=0;
        int right= m-1;
        if(matrix[0][0]>target || matrix[m-1][n-1]<target)
        return false;
        while(right>=left)
        {
            int mid = (right+left)/2;
            if(matrix[mid][0]<=target)
            left=mid+1;
            else
            right=mid-1;
        }
        int c=right;
        left=0;
        right= n-1;
        while(right>=left)
        {
            int mid = (right+left)/2;
            if(matrix[c][mid]==target)
            return true;
            if(matrix[c][mid]>target)
            right=mid-1;
            else
            left=mid+1;
        }
        return false;
    }
}