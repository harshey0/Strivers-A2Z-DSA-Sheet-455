class Solution {

    public boolean check(String s) {
        for(int x=0;x<s.length()/2;x++)
        {
        if(s.charAt(x)!=s.charAt(s.length()-1-x))
        return false;
        }
        return true;
    }

    public void solve(String s, int i , int n , List<List<String>> ans , List<String> list) {
        
        if(i==n)
        {
        ans.add(new ArrayList(list));
        return;
        }
        for(int x=1+i;x<=n;x++)
        {
            if (check(s.substring(i,x)))
        {
            list.add(s.substring(i,x));
            solve(s,x,n,ans,list);
            list.remove(list.size()-1);
            }
            }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList();
     solve(s,0,s.length(),ans,new ArrayList());
        return ans;
    }
}