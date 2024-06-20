class Solution {
    public int countPrimes(int n) {
        int a[]= new int[n];
        if(n<=2)
        return 0;
        int c=1;
        for(int x=3;x<n;x+=2)
        {
            if(a[x]==0)
            {
            c++;
            if(x>Math.sqrt(n))
            continue;
            for(int y=x*x;y<n;y=y+2*x)
            {
                a[y]=1;
            }
            }
        }
        return c;
    }
}