class Solution {
    public int maxDepth(String s) {
        int c=0,ans=0;
        for(int x=0;x<s.length();x++)
    {
        if(s.charAt(x)=='(')
        c++;
        else if(s.charAt(x)==')')
        c--;
        ans=Math.max(c,ans);
    }
    return ans;
    }
}