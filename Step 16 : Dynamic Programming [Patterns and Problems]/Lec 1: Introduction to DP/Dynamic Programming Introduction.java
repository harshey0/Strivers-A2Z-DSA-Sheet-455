class Solution {
    static int fib(int n , int[]dp)
    {
        if(n==0 || n==1)
        return n;
        if(dp[n]==0)
        dp[n]=(fib(n-1,dp)+fib(n-2,dp))%1000000007;
        return dp[n];
    }
    static long topDown(int n) {
        // code here
        int dp[]=new int[n+1];
        return fib(n,dp);
    }

    static long bottomUp(int n) {
        // code here
        int dp[]=new int[n+1];
        dp[0]=0;dp[1]=1;
        for(int x=2;x<=n;x++)
        dp[x]=(dp[x-1]+dp[x-2])%1000000007;
        return dp[n];
    }
}