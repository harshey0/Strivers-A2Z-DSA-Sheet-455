class Solution {
    public void check(int n, int k,int []a , int i ,List<Integer> list,List<List<Integer>> ans) {
    // Write your code her
    if(k<=0)
    {
        if(k==0)
        ans.add(new ArrayList(list));
    return;
    }
    int c=k;
    for (int x = i; x < n; x++) {
     if (x > i && a[x] == a[x - 1]) continue;
    list.add(a[x]);
    check(n,k-a[x],a,x+1,list,ans);
    list.remove(list.size()-1);
    }
}

public List<List<Integer>> combinationSum2(int[] a, int k) {

int n = a.length;
Arrays.sort(a);
    List<List<Integer>> ans = new ArrayList();
    List<Integer> list = new ArrayList();
    check(n,k,a,0,list,ans);
    return ans;
}
}