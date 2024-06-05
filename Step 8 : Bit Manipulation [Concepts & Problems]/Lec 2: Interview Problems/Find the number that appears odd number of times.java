class Solution {
    public int singleNumber(int[] nums) {
         int c=nums[0];
         for(int x=1; x<nums.length; x++)
            c^=nums[x];
            return c;
    }
    
}