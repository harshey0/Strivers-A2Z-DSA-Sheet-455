class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int value(char x)
    {
        switch(x)
        {
            case '+':return 1;
            case '-':return 1;
            case '/':return 2;
            case '*':return 2;
            case '^':return 3;
            default :return 0;
        }
    }
    
    public static String infixToPostfix(String p) {
        // Your code here
        Stack <Character> s = new Stack ();
        String ans="";
        for(int x=0;x<p.length();x++)
        {
            char c=p.charAt(x);
            if(c=='(')
            s.push(c);
            else if((c>='A' && c<='Z' )||( c>='a' && c<='z') ||(c>='0' && c<='9'))
            ans+=c;
            else if(c==')')
            {
                while(s.peek()!='(')
                ans+=s.pop();
                s.pop();
            }
            else
            {
                if(!s.isEmpty() && value(c)<=value(s.peek()))
                while(!s.isEmpty() && value(s.peek())>=value(c))
                ans+=s.pop();
                s.push(c);
            }
        }
        while(!s.isEmpty())
        ans+=s.pop();
        return ans;
    }
}