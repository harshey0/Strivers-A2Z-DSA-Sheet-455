class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int c=0,ans=0,left=0,p=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]%2==1)
            c++;
            if(c>=k)
            {
                while(left<x && c>=k)
                {
                    if(nums[left]%2==0)
                        p++;
                        else if(nums[left]%2==1 && c>k)
                        {p=0;c--;}
                        else
                        {break;}
                        left++;
                }
            }
            if(c==k)
            ans+=1+p;
        }
        return ans;
    }
}