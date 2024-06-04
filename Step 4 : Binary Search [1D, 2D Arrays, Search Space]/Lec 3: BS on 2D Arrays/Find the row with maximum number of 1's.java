class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int left=0,right=m-1;
        while(right>=left)
        {
            int mid=(right+left)/2;
            int c=0;
            for(int x=0;x<n;x++)
            if(arr[x][mid]==1)
            c++;
            if(c==0)
            left=mid+1;
            else
            right=mid-1;
        }
        if(left<m)
        for(int x=0;x<n;x++)
        if(arr[x][left]==1)
        return x;
        return -1;
    }
}