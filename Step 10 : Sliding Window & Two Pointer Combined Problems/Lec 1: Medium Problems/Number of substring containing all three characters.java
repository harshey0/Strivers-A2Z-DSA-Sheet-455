class Solution {
    public int find(int b,String s) {
        char a = s.charAt(b);
        for(int x=b+1;x<s.length();x++)
        if(s.charAt(x)==a)
        return x;
        return s.length();
    }
    public int numberOfSubstrings(String s) {
        
        int a=-1,b=-1,c=-1;
        for(int x=0;x<s.length();x++)
        {
            if(a!=-1 && b!=-1 && c!=-1)
            break;
            if(a==-1 && s.charAt(x)=='a')
            a=x;
            if(b==-1 && s.charAt(x)=='b')
            b=x;
            if(c==-1 && s.charAt(x)=='c')
            c=x;
        }
        int ans=0;
        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));
        if(min==-1)
        return 0;
        ans+=s.length()-max;
        while(min<s.length())
        {
        if(s.charAt(min)=='a')
        a=find(a,s);
        if(s.charAt(min)=='b')
        b=find(b,s);
        if(s.charAt(min)=='c')
        c=find(c,s);
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        ans+=s.length()-max;
        }
        return ans;
    }
}