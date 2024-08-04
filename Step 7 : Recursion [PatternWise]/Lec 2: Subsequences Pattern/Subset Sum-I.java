class Solution {
    public void check(int n,ArrayList<Integer>a , int i ,int sum, ArrayList<Integer>ans) {
    // Write your code her
    if(i==n)
    {ans.add(sum);return;}
    check(n,a,i+1,sum+a.get(i),ans);
    check(n,a,i+1,sum,ans);
}
ArrayList<Integer> subsetSums(ArrayList<Integer> a, int n) {
// code here
    ArrayList<Integer>ans = new ArrayList();
    check(n,a,0,0,ans);
    return ans;
}
}