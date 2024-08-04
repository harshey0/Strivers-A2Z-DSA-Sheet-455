class Solution {

    public boolean check(String s, List<String> a) {
        for(int x=0;x<a.size();x++)
        {
        if(a.get(x).equals(s))
        return true;
        }
        return false;
    }
    public boolean solve(String s, List<String> a , int i , int n) {
        
        if(i==n)
        return true;
        for(int x=i;x<=n;x++)
        {if (check(s.substring(i,x),a) && solve(s,a,x,n))
        return true;}
        return false;
    }

    public boolean wordBreak(String s, List<String> a) {
        return solve(s,a,0,s.length());
    }
}