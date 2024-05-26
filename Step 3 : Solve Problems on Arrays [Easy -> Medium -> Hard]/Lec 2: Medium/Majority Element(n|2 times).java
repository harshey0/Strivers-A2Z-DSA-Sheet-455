class Solution {
    public int majorityElement(int[] nums) {
        
        int c=0,d=1;
        for(int x=1;x<nums.length;x++)
        {
            if(d==0)
            c=x;
            if(nums[x]==nums[c])
            d++;
            else d--;
        }
        return nums[c];
    }
}