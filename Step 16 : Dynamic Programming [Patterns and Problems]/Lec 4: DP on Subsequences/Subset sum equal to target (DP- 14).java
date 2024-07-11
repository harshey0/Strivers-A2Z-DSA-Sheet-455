class Solution{


    static Boolean isSubsetSum(int n, int arr[], int sum){
        // code here
        Boolean dp[][]= new Boolean[n+1][sum+1];
        Arrays.fill(dp[0],false);
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true; 
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j )
                {
                    if( dp[i-1][j]==true||dp[i-1][j-arr[i-1]]==true)
                    dp[i][j]=true;
                    else
                    dp[i][j]=false;
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}