class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> st = new Stack();
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='(' || s.charAt(x)=='{' || s.charAt(x)=='[')
            st.push(s.charAt(x));
            else if(st.isEmpty())
            return false;
            else 
            { char c= st.pop();
                if((s.charAt(x)==')' && c!='(') || (s.charAt(x)=='}' && c!='{') || (c!='[' && s.charAt(x)==']'))
                return false;
                }
        }
        return st.isEmpty();
    }
}