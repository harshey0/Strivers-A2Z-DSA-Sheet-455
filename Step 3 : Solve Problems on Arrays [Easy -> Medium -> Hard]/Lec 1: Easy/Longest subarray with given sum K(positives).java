class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int a=0,sum=0,ans=0;
        for(int x=0;x<N;x++)
        {
            sum+=A[x];
            if(sum==K)
            ans=Math.max(x-a+1,ans);
            if(sum>K)
            while(sum>K&&a<=x)
            {
                sum-=A[a];
                a++;
            }
        }
        return ans;
    }
}