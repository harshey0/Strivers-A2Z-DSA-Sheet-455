class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int c=0,sum=0;
        HashMap <Integer,Integer> map = new HashMap();
        for(int x=0;x<nums.length;x++)
        {
            sum+=nums[x];
            if (sum==k)
            c++;
            int rem=sum-k;
            if(map.containsKey(rem))
            c+=map.get(rem);
            map.put(sum,1+map.getOrDefault(sum,0));
        }
        return c;
    }
}