class Solution {

    long good( long x,long n) 
    {
        if(n==0)
        return 1;
        x=x%1000000007;
        long d=(x*x)%1000000007;
        if(n%2==0)
        return good(d,n/2)%1000000007;
        else return (x*(good(d,n/2)%1000000007))%1000000007;
    }
    
        public int countGoodNumbers(long n) {
            if(n%2==0)
            return (int)good(20,n/2);
            else return (int)((good(20,n/2)*5)%1000000007);
        }
    }