class Solution {
    public void sortColors(int[] nums) {

int left=0; int right= nums.length-1;
        for(int x=0;x<=right;x++)
        {
            if(nums[x]==0)
            {
                nums[x]=nums[left];
                nums[left]=0;
                left++;
            }
            else if(nums[x]==2)
            {
                nums[x]=nums[right];
                nums[right]=2;
                right--;
                x--;
            }
        }
        
    }
}