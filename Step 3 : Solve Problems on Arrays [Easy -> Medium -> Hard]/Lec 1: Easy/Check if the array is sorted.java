class Solution {
    public boolean check(int[] nums) {
        int p=0;
         for ( int i =1;i<nums.length;i++)
        {
            if(p==1)
            {
                if(nums[i-1]>nums[i])
            return false;}
            else
            {if(nums[i-1]>nums[i])
            {p=1;
            if(nums[nums.length-1]>nums[0])
            return false;}
            }
        }
        return true;
    }
    
}