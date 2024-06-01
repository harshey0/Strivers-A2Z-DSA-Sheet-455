class Solution {
    public int myAtoi(String s) {
        String p=s.trim();
        double ans = 0;
        if(p.length()>0 && p.charAt(0)=='-')
        ans = -a(0,p.substring(1,p.length()));
        else if(p.length()>0 && p.charAt(0)=='+')
        ans = a(0,p.substring(1,p.length()));
        else
        ans = a(0,p);
        if(ans>Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        if(ans<Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
        return (int)ans;
    }

    double a(double ans ,String s)
    {
       if(s.length()==0 || (int)s.charAt(0)<48||(int)s.charAt(0)>59)
       
        return ans;
        
         return a(ans*10+(int)s.charAt(0)-48,s.substring(1,s.length()));

    }
}