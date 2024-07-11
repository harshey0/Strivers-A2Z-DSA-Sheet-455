class Solution{
    int longestCommonSubstr(String text1, String text2, int n, int m){
        // code here
        int dp[][]=new int [n+1][m+1];
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                int a =Math.max(dp[i-1][j],dp[i][j-1]);
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {dp[i][j]=dp[i-1][j-1]+1;ans=Math.max(ans,dp[i][j]);}
            }
        }
        return ans;
    }
}