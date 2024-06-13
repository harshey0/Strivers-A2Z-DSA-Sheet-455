class Solution {
    static String postToPre(String p) {
        // code here
                  String a="",b="",ans="";
        Stack <String> s = new Stack();
        for(int x=0;x<p.length();x++)
        {
            if((p.charAt(x)>='A' && p.charAt(x)<='Z') || (p.charAt(x)>='a' && p.charAt(x)<='z') )
            s.push(Character.toString(p.charAt(x)));
            else
            {
                b=s.pop();a=s.pop();
                String c=p.charAt(x)+a+b;
                s.push(c);
            }
        }
        return s.pop();
    }
}