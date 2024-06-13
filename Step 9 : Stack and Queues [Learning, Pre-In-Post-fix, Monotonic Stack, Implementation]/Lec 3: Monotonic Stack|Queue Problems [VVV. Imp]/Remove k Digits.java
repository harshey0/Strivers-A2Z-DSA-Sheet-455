class Solution {
    public String removeKdigits(String num, int k) {
        
        if(num.length()<=k)
        return "0";
        Stack <Character> q= new Stack();
        for(int x=0;x<num.length();x++)
        {
            if(!q.isEmpty() && q.peek()>num.charAt(x) && k>0)
            {
                q.pop();k--; x--;
            }
            else if(!q.isEmpty() || num.charAt(x)!='0')
            q.add(num.charAt(x));
        }
        num="";
        int c=q.size();
        for(int x=0;x<c;x++)
        {
            char d= q.pop();
            if(k>0)
                k--;
            else
            num=d+num;
        }
        if(num=="")
        return "0";
        return num;
    }
}