class Solution {
    public int findPeakElement(int[] nums) {

        int left=0,right=nums.length-1;
        if(right==0)
        return 0;
        while(left<=right)
        {
            int mid = (right+left)/2;
            if(( mid ==0||nums[mid]>nums[mid-1]) && (mid== nums.length-1||nums[mid+1]<nums[mid]))
            return mid;
            if(nums[mid]<nums[mid+1])
            left=mid+1;
            else
            right=mid-1;
        }
        return -1;
        
    }
}