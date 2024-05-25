class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
 
 int sum=0,ans=0;
        HashMap <Integer,Integer> map= new HashMap();
        for(int x=0;x<N;x++)
        {
          sum+=A[x];
          int rem = sum-K;
          if( sum==K)
          ans = Math.max(ans,x+1);
          if(map.containsKey(rem))
          ans=Math.max(ans,x-map.get(rem));
          if(!map.containsKey(sum))
          map.put(sum,x);
        }
        return ans;
    }
}