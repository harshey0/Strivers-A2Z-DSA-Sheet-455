class Solution {
    public boolean search(int[] nums, int target) {
        
        int left=0;int right= nums.length-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(nums[mid]==target)
            return true;
            if(nums[left]==nums[right]&& nums[mid]==nums[right])
            {right--;left++;}
            else if(nums[mid]<nums[left])
            {
                if(nums[mid]<=target && target <= nums[right])
            left=mid+1;
            else 
            right=mid-1;
            }
            else
            {
                if(nums[left]<=target && target <= nums[mid])
            right=mid-1;  
            else 
            left=mid+1;
            }
        }
        return false;
        
    }
}