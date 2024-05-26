class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap();
        int []a= new int[2];
        map.put(nums[0],0);
        for(int x=1;x<nums.length;x++)
        {
        if(map.containsKey(target-nums[x]))
        {
            a[0]=map.get(target-nums[x]);
            a[1]=x;
            return a;
        }
        else
        map.put(nums[x],x);
        }
        return a;
    }
}