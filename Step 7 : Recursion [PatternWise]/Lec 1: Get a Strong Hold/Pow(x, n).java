class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0)
        {x=1/x;N=-N;}

       return p(x,N);
    }
    double p(double x, long n)
    
    {
        if(n==0)
        return 1.0;
        if(n%2==0)
        return p(x*x,n/2);
        else
        return x*p(x*x,n/2);
    }
}