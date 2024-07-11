public class Solution {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        int dp[][]=new int [n+1][k+1];
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=k;j++)
        {
          if(a[i-1]<=j)
          {
              dp[i][j]=Math.max(a[i-1]+dp[i-1][j-a[i-1]],dp[i-1][j]);
          }
          else
          dp[i][j]=dp[i-1][j];
        }
        }
        return dp[n][k]==k;
    }
}