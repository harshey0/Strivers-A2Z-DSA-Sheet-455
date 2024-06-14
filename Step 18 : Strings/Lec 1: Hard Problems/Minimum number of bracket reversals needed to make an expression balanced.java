class Solution {
    public int minAddToMakeValid(String s) {
        
        int c=0,ans=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='(')
            c++;
            if(s.charAt(x)==')')
            {
               if(c>0)
               c--;
               else ans++; 
            }
        }
        return(ans+c);
    }
}