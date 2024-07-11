class Solution {
    public int lca(String text1, String text2) {
    int n = text1.length();
    int m = text2.length();
    int dp[][]=new int [n+1][m+1];

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=m;j++)
        {
            int a =Math.max(dp[i-1][j],dp[i][j-1]);
            if(text1.charAt(i-1)==text2.charAt(j-1))
            dp[i][j]=dp[i-1][j-1]+1;
            else
            dp[i][j]=a;
        }
    }
    return dp[n][m];
}

public int minDistance(String word1, String word2) {
    int lca = lca (word1,word2);
    return (word2.length()-lca)+(word1.length()-lca);
}
}