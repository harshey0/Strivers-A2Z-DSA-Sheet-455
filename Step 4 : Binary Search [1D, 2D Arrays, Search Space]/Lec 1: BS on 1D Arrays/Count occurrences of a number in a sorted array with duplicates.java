class Solution {
    int count(int[] arr, int n, int x) {
        // code here
                int left=0;int right=n-1;int c=-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(x==arr[mid])
            { c=mid;right=mid-1;
                }
             else if(x<arr[mid])
            right=mid-1;
            else 
            left=mid+1;
        }
        if(c==-1)
        return 0;
        left=0;right= n-1;int d=-1;
         while(left<=right)
        {
            int mid=(right+left)/2;
            if(x==arr[mid])
            { d=mid;left=mid+1;
                }
             else if(x<arr[mid])
            right=mid-1;
            else
            left=mid+1;
        }
        return d-c+1;
    }
}