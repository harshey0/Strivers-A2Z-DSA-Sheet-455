class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
           
           int right=0,left=1;
           for(int x=0;x<nums.length;x++)
           {
               if(nums[x]>right)
               right=nums[x];
           }
           while(left<=right)
           {
               int mid = (left+right)/2;
                int c=0;
     for(int x=0;x<nums.length;x++ )
               {
                   c+=nums[x]/mid;
                   if(nums[x]%mid >0)
                   c++;
               }
               if(c<=threshold)
               right= mid-1;
               else
               left=mid+1;
           }
           return left;
       }
   }