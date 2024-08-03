class Solution {
    public boolean canPartition(int[] nums) {
        int w=0;
        int n = nums.length;
        for(int x=0;x<n;x++)
        {
            w+=nums[x];
        }
        int wt=w/2;
        if(2*wt != w)
        return false;
        int dp[][]=new int [n+1][wt+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=wt;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-nums[i-1]]+nums[i-1]);
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][wt]==wt;
    }
}