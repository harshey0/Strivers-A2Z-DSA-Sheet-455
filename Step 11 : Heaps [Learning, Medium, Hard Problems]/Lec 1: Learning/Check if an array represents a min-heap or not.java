class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(int x=0;x<n/2;x++)
        {
            if(arr[x]<arr[2*x+1] || (2*x+2<n && arr[x]<arr[2*x+2]) )
            return false;
        }
        return true;
    }
}