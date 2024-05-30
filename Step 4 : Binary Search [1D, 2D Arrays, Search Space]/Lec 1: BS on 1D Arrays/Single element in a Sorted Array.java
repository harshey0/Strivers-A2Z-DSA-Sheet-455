class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int left=0, right = nums.length-1;

        while(left<right)
        {
            int mid = (right +left)/2;
            if(nums[mid]==nums[mid+1])
            {
                if((mid+1)%2==1)
                left=mid+2;
                else
                right=mid-1;
            }
            else
            {
                if((mid)%2==1)
                left=mid+1;
                else
                right=mid;
            }
        }
            return nums[left];
        
    }
}