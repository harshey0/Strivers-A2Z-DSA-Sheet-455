class Solution {
    public void check(int n, int k, int i ,int sum,List<Integer> list,List<List<Integer>> ans) {
    // Write your code her
    if(i==10)
    {
    if(k==0 && sum==n)
    ans.add(list);
    return;
    }
    List<Integer> temp = new ArrayList(list);
    temp.add(i);
    check(n,k-1,i+1,sum+i,temp,ans);
    check(n,k,i+1,sum,list,ans);
}

    public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> ans = new ArrayList();
    List<Integer> list = new ArrayList();
    check(n,k,1,0,list,ans);
    return ans;
    }
}