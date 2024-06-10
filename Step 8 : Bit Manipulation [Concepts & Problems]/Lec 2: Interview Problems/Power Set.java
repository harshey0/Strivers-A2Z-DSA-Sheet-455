class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        for(int x=0;x<(1<<n);x++)
        {
              List<Integer> temp = new ArrayList<>();  

              for(int y=0;y<n;y++)
              {
                if((x&(1<<y))>0)
                temp.add(nums[y]);
              }
              result.add(temp);
        }
        return result;
    }
}