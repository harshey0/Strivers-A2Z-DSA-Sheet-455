class Solution{
    public int minimumEnergy(int arr[],int n){
        //code here
        if(n<2)
        return 0;
        int dp[]=new int[n];
        dp[0]=0;dp[1]=Math.abs(arr[n-2]-arr[n-1]);
        for(int x=2;x<n;x++)
        dp[x]=Math.min(Math.abs(arr[n-1-x]-arr[n-x+1])+dp[x-2],Math.abs(arr[n-1-x]-arr[n-x])+dp[x-1]);
        return dp[n-1];
    }
}