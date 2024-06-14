class Solution {
    public String count(int n, String s) {
        if(n==1)
        return s;
        String ans="";int c=1;
        for(int x=1;x<s.length();x++)
        {
            if(s.charAt(x)==s.charAt(x-1))
            c++;
            else{
                ans+=Integer.toString(c)+s.charAt(x-1);
                c=1;
            }
        }
        ans+=Integer.toString(c)+s.charAt(s.length()-1);
        return count(n-1,ans);
    }

    public String countAndSay(int n) {
        
        return count(n,"1");

    }
}