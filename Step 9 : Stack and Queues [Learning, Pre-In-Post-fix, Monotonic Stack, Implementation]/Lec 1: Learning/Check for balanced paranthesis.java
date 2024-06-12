class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> st = new Stack();
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='(' || s.charAt(x)=='{' || s.charAt(x)=='[')
            st.push(s.charAt(x));
            else if(s.charAt(x)==')')
            {
                if(st.isEmpty()||st.pop()!='(')
                return false;
            }
            else if(s.charAt(x)=='}')
            {
                if(st.isEmpty()||st.pop()!='{')
                return false;
            }
            else if(s.charAt(x)==']')
            {
                if(st.isEmpty()||st.pop()!='[')
                return false;
            }
        }
        return st.isEmpty();
    }
}