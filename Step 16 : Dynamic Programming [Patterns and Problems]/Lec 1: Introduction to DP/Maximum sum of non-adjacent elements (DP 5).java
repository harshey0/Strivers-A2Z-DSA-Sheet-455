class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        int dp[]=new int [n];
        dp[0]=nums[0];
        for(int x=1;x<n&&x<2;x++)
        {
            dp[x]=Math.max(dp[x-1],nums[x]);
        }
        for(int x=2;x<n;x++)
        {
            dp[x]=Math.max(dp[x-2]+nums[x],dp[x-1]);
        }
        return dp[n-1];
    }
}