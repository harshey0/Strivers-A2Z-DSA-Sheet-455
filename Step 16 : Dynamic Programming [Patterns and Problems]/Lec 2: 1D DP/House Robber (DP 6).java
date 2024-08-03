class Solution {

    public int robhelp(int[] nums , int n, int start) {
    int dp[]=new int [n];
    dp[0+start]=nums[start+0];
    for(int x=1+start;x<n&&x<2+start;x++)
    {
        dp[x]=Math.max(dp[x-1],nums[x]);
    }
    for(int x=2+start;x<n;x++)
    {
        dp[x]=Math.max(dp[x-2]+nums[x],dp[x-1]);
    }
    return dp[n-2+start];
}


public int rob(int[] nums) {
    if(nums.length==1)
    return nums[0];
    return Math.max(robhelp(nums,nums.length,0),robhelp(nums,nums.length,1));
}
}