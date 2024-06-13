// javac -Xlint:unchecked GFG.java
// java GFG
 
    class Solution {
        // Function to convert an infix expression to a prefix expression.
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
        
        public static String infixToPrefix(String p) {
            // Your code here
            Stack <Character> s = new Stack ();
            String ans="";
            for(int x=p.length()-1;x>=0;x--)
            {
                char c=p.charAt(x);
                if(c==')')
                s.push(c);
                else if((c>='A' && c<='Z' )||( c>='a' && c<='z') ||(c>='0' && c<='9'))
                ans=c+ans;
                else if(c=='(')
                {
                    while(s.peek()!=')')
                    ans=s.pop()+ans;
                    s.pop();
                }
                else
                {
                    if(!s.isEmpty() && value(c)<value(s.peek()))
                    while(!s.isEmpty() && value(s.peek())>value(c))
                    ans=s.pop()+ans;
                    s.push(c);
                }
            }
            while(!s.isEmpty())
            ans=s.pop()+ans;
            return ans;
        }
    }