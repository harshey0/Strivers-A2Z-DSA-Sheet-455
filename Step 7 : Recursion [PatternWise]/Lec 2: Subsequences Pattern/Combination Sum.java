class Solution {
    public void check(int n, int k,int []a , int i ,List<Integer> list,List<List<Integer>> ans) {
    // Write your code her
    if(i==n)
    {
    if(k==0)
    ans.add(list);
    return;
    }
    List<Integer> temp = new ArrayList(list);
    int b=a[i];
    while(k>=b)
    {
    temp.add(a[i]);
    check(n,k-b,a,i+1,temp,ans);
    b+=a[i];}
    check(n,k,a,i+1,list,ans);
}

public List<List<Integer>> combinationSum(int[] a, int k) {

int n = a.length;
    List<List<Integer>> ans = new ArrayList();
    List<Integer> list = new ArrayList();
    check(n,k,a,0,list,ans);
    return ans;
}
}