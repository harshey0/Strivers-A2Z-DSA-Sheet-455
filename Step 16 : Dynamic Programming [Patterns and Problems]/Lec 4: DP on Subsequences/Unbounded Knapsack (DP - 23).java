class Solution{
    static int knapSack(int n, int w, int val[], int wt[])
    {
        // code here
        int dp [][]=new int [n+1][w+1];
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][w];
    }
}