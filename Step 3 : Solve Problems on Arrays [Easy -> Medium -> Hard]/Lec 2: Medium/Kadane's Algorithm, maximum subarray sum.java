class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=nums[0],max=nums[0];
        for(int x=1;x<nums.length;x++)
        {
            if(sum<0)
            sum=0;
            sum+=nums[x];
            max=Math.max(sum,max);
        }
        return max;
    }
}
