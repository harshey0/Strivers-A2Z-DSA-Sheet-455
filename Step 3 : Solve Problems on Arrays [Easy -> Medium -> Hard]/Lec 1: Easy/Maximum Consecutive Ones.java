class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;int ans=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==1)
            c++;
            else
            {
                ans = Math.max(c,ans);
                c=0;
            }
        }
        ans = Math.max(c,ans);
        return ans;
    }
}