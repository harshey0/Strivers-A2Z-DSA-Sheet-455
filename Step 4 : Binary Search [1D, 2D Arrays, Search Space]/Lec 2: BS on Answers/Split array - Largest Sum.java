class Solution {
    public int splitArray(int[] arr, int m) {
        int n= arr.length;
         int left=0,right=0;
        if(n<m)
        return -1;
           for(int x=0;x<n;x++)
            {
                right+=arr[x];
            }
        while(left<=right)
        {
            int mid= (right+left)/2;
            int c=1;int s=0;int a=0;
           
            for(int x=0;x<n;x++)
            {
                if(s+arr[x]>mid)
                {
                    s=arr[x];
                    c++;
                }
                else s+=arr[x];
                a=Math.max(a,s);
            }
            if(c>m || a>mid)
            left=mid+1;
            else
            right = mid-1;
        }
        return left;
    }
}