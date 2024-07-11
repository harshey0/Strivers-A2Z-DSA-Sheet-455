class Solution {
    public int minimizeCost(int arr[], int n, int K) {
        // code here
        if(n<2)
        return 0;
        int dp[]=new int[n];
        dp[0]=0;dp[1]=Math.abs(arr[0]-arr[1]);
        for(int x=2;x<n;x++)
        {
            int min=Integer.MAX_VALUE;
            for(int y=1;y<=K;y++)
        {    
            if(x-y<0)
            continue;
        min=Math.min(Math.abs(arr[x]-arr[x-y])+dp[x-y],min);
       }
       dp[x]=min;
        }
        return dp[n-1];
    }
}