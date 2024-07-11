class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> set = new TreeSet();
        for(int a : nums)
        set.add(a);
        int m=set.size();
        int nums2[] = new int [m];
        int p=0;
        for(int a : set)
        {nums2[p++]=a;}
        int dp[][]=new int [n+1][m+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                int a =Math.max(dp[i-1][j],dp[i][j-1]);
                if(nums[i-1]==nums2[j-1])
                dp[i][j]=dp[i-1][j-1]+1;
                else
                dp[i][j]=a;
            }
        }
        return dp[n][m];
    }
}