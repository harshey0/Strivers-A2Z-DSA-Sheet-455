class Solution {
    
    public static long pairWithMaxSum(long arr[], long n)
    {
        // Your code goes here'
        
        long ans =0;
        for(int x=1;x<n;x++)
        {
            ans=Math.max(arr[x]+arr[x-1],ans);
        }
        return ans;
    }
}