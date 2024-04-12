// LEETCODE
class Solution {
    public int missingNumber(int[] nums) {
        int s=nums.length;
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            c+=nums[x];
            s+=x;
        }
        return s-c;
    }
}