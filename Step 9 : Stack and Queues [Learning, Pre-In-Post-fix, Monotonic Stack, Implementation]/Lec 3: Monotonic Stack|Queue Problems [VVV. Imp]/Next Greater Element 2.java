class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int ans[]= new int [nums.length];
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>nums[c])
            c=x;
        }
        ans[c]=-1;s.push(nums[c]);c+=nums.length-1;
        for(int x=0;x<nums.length-1;x++,c--)
       { 
        if(nums[c%nums.length]<nums[(c+1)%nums.length])
        {ans[c%nums.length]=nums[(c+1)%nums.length];s.push(nums[(c+1)%nums.length]);}
        else
        {
            while(!s.isEmpty() && s.peek()<=nums[c%nums.length])
            {
                s.pop();
            }
            int e=-1;
            if(!s.isEmpty())
            e=s.peek();
            ans[c%nums.length]=e;
        }
       }
       return ans;

    }
}