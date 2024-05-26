class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int f1=Integer.MIN_VALUE,f2=Integer.MIN_VALUE,c1=0,c2=0;
        List <Integer> list = new ArrayList();
        for(int x=0;x<nums.length;x++)
        {
            if(c2==0 && f1!=nums[x])
            f2=nums[x];
            else if(c1==0 && f2!=nums[x])
            f1=nums[x];
            if(nums[x]==f1)
            c1++;
            else if (nums[x]==f2)
            c2++;
            else {c1--;c2--;}
        }   c1=0;c2=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==f1)
            c1++;
            if (nums[x]==f2)
            c2++;
        }
        if(c1>nums.length/3)
        list.add(f1) ;
        if(c2>nums.length/3)
        list.add(f2) ;
        return list;
    }
}