class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int p=0;int n=1;
        int ans []=new int[nums.length];
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>0)
            {ans[p]=nums[x];p=p+2;}
            else
            {ans[n]=nums[x];n=n+2;}
        }
        return ans;
    }
}