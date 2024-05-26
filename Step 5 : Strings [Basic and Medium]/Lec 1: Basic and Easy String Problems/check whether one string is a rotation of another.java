class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)==goal.charAt(0))
            {
                int y=1;
                while(y<s.length()-x)
                {
                    if(s.charAt(x+y)!=goal.charAt(y))
                    break;y++;
                }
                if(s.substring(0,x).equals(goal.substring(y,goal.length())))
                return true;
            }
        }
        return false;
    }
}