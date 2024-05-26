class Solution {
    public String removeOuterParentheses(String s) {
        int o=0;String ans="";

        for(int x=0;x<s.length();x++)
        {

            if(s.charAt(x)==')')
            {if(o!=1) ans+=s.charAt(x);
            o--;}
            if(s.charAt(x)=='(')
            {if(o!=0) ans+=s.charAt(x); o++;}
        }

        return ans;
    }
}