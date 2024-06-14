class Solution {
    public void sort(int[] nums , int k)
    {
        for(int x=k;x<nums.length-1;x++)
        {
            for(int y=nums.length-1;y>x;y--)
            {
                if(nums[y]<nums[y-1])
                {
                    int c=nums[y];
                    nums[y]=nums[y-1];
                    nums[y-1]=c;
                }
            }
        }
    }
    public int next(int k , int[] nums )
    {
        int ans = nums.length-1;
        for(int x=nums.length-2;x>k;x--)
        {
           if(nums[x]<=nums[ans] && nums[x]>nums[k])
           ans=x;
        }
        return ans;
    }
    public void nextPermutation(int[] nums) {
        
        int x=nums.length-1;
        for(;x>0;x--)
        {
            if(nums[x]>nums[x-1])
            break;
        }
        sort(nums,x);
        if(x!=0)
        {
            int c= next(x-1,nums);
            int p = nums[c];
            nums[c]=nums[x-1];
            nums[x-1]=p;
        }
    }
}