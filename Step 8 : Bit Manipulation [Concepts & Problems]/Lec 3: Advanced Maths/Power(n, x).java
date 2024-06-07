class Solution {
    public double myPow(double x, int n) {
        long m = n;
        if(m<0)
        {x=1/x;m=-m;}
        double ans=1;
        while(m>0)
        {
            if((m&1)>0)
            ans*=x;
            x*=x;
            m>>=1;
        }

       return ans;
    }
}