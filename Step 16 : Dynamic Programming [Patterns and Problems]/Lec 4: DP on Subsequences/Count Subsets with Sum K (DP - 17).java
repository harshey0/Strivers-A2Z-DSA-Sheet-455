class Solution{
    private static int mod =1000000007;
        public int perfectSum(int arr[],int n, int sum) 
        { 
            // Your code goes here
             int dp[][]= new int [n+1][sum+1];
            for(int x=0;x<=n;x++)
            dp[x][0]=1;
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<=sum;j++)
                {
                    if(arr[i-1]<=j)
                        dp[i][j]=(dp[i-1][j]+dp[i-1][j-arr[i-1]])%mod;
                    else
                    dp[i][j]=dp[i-1][j]%mod;
                }
            }
            return dp[n][sum];
            
        } 
    }