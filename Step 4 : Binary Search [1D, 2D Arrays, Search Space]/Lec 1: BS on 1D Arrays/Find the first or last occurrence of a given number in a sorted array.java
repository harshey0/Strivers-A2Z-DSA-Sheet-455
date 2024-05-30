class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int a[]={-1,-1};
                int left=0;int right= nums.length-1;int c=-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(target==nums[mid])
            { c=mid;right=mid-1;
                }
             else if(target<nums[mid])
            right=mid-1;
            else 
            left=mid+1;
        }
        a[0]=c;
        left=0;right= nums.length-1;c=-1;
         while(left<=right)
        {
            int mid=(right+left)/2;
            if(target==nums[mid])
            { c=mid;left=mid+1;
                }
             else if(target<nums[mid])
            right=mid-1;
            else
            left=mid+1;
        }
        a[1]=c;
        return a;
    }
}