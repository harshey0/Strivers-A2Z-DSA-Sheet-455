class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        int p=s.length();
        for(int c=s.length()-1;c>=0;c--)
        {
            if(s.charAt(c)==' ')
            {
                ans=ans.trim();
                ans+=" "+s.substring(c+1,p);
                p=c;
            }
        }
        ans=ans.trim();
        ans+=" "+s.substring(0,p);
        return ans.trim();
    }
}