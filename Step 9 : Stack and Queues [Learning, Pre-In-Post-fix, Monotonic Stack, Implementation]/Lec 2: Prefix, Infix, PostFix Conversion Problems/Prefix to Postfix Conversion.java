class Solution {
    static String preToPost(String p) {
        // code here
        String a="",b="",ans="";
        Stack <String> s = new Stack();
        for(int x=p.length()-1;x>-1;x--)
        {
            if((p.charAt(x)>='A' && p.charAt(x)<='Z') || (p.charAt(x)>='a' && p.charAt(x)<='z') )
            s.push(Character.toString(p.charAt(x)));
            else
            {
                a=s.pop();b=s.pop();
                String c=a+b+p.charAt(x);
                s.push(c);
            }
        }
        return s.pop();
    }
}