class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList();
                ans.add(new ArrayList(List.of(1)));
        for(int x=1;x<n;x++)
        {

        List<Integer> list = new ArrayList();
                list.add(1);
            for(int y=1;y<ans.get(x-1).size();y++)
            {
                list.add(ans.get(x-1).get(y)+ans.get(x-1).get(y-1));
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }
}