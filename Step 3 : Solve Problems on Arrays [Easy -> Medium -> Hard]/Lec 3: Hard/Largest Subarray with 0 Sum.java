class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
 int sum=0,ans=0;
        HashMap <Integer,Integer> map= new HashMap();
        for(int x=0;x<n;x++)
        {
          sum+=arr[x];
          if( sum==0)
          ans = Math.max(ans,x+1);
          if(map.containsKey(sum))
          ans=Math.max(ans,x-map.get(sum));
          if(!map.containsKey(sum))
          map.put(sum,x);
        }
        return ans;
    }
}