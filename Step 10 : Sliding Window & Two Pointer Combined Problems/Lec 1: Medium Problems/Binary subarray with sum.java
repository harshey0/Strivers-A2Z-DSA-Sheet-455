class Solution {
    public int numSubarraysWithSum(int[] arr, int k) {
        int left=0,right=arr.length; int s=0,ans=0,start=1;
        ArrayList <Integer> list = new ArrayList();
        int x=0;
        while(x<arr.length && arr[x]==0)
        {
            if(s==k)
            ans+=1+left;
            left++;x++;
        }
        for(;x<arr.length;x++)
        {
            s+=arr[x];
            if(arr[x]==1)
            {
                list.add(x);
            }
            if(s>k)
            {
                if(k==0)
                left=x-list.get(start-1)-1;
                else
                left=list.get(start)-list.get(start-1)-1;
                start++;
                s--;
            }
            if(s==k)
            {
                ans+=1+left;
                if(k==0)
                left++;
            }
        }
        return ans;
    }
}