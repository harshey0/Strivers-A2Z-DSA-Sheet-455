class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int left=0;int right= n-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(x==arr[mid])
            return mid;
            else if(x<arr[mid])
            right=mid-1;
            else
            left=mid+1;
        }
        if(right==-1)
        return -1;
        else return right;
        
    }
    
}