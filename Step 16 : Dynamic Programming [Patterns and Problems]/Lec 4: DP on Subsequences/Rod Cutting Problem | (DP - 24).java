class Solution{
    public int cutRod(int price[], int l) {
        //code here
        int n = price.length;
       int dp [][]=new int [n+1][l+1];
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(i<=j)
                {
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][l];
    }
}