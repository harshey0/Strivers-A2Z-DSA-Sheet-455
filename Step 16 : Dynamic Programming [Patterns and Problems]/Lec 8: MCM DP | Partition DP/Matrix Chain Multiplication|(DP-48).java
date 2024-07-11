class Solution{
    
    static int solve(int a, int b, int arr[] , int dp[][])
    {
        if(a==b)
        return 0;
        if(dp[a][b]==-1)
        {
            int min=Integer.MAX_VALUE;
        for(int k=a; k<b;k++)
        {
            int s1=solve(a,k,arr,dp);
            int s2=solve(k+1,b,arr,dp);
            int s=arr[a-1]*arr[k]*arr[b];
            min=Math.min(min,s1+s2+s);
        }
        dp[a][b]=min;
        }
        return dp[a][b];
    }
    
    static int matrixMultiplication(int n, int arr[])
    {
        // code here
       int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
           Arrays.fill(dp[i], -1);
                }
        return solve(1,n-1,arr,dp);
    }
}