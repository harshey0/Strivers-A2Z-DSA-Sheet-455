class Solution {

    public void check(int n,int []a , int i ,List<Integer> list,List<List<Integer>> ans) {
// Write your code her
ans.add(new ArrayList(list));
for (int x = i; x < n; x++) {
 if (x > i && a[x] == a[x - 1]) continue;
list.add(a[x]);
check(n,a,x+1,list,ans);
list.remove(list.size()-1);
}
}

public List<List<Integer>> subsetsWithDup(int[] a) {
int n = a.length;
Arrays.sort(a);
List<List<Integer>> ans = new ArrayList();
List<Integer> list = new ArrayList();
check(n,a,0,list,ans);
return ans;
}
}