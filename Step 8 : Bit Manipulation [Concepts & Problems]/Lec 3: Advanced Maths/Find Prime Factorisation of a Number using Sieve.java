class Solution {
    // You must implement this function
    
    static void sieve()
    {
        
    }
    static void sieve(int n , int a[] ) {
         for(int x=0;x<=n;x++)
         {
             a[x]=x;
         }
        for(int x=2;x<=n;x++)
        {
           if(a[x]==x && x<=Math.sqrt(n))
            for(int y=x*x;y<=n;y+=x)
            {
                if(a[y]==y)
                a[y]=x;
            }
            }
        }
    static List<Integer> findPrimeFactors(int N) {
        // code here
         int a[]= new int [N+1];
        sieve(N , a);
        List<Integer> ans = new ArrayList();
        while(N!=1)
        {
            ans.add(a[N]);
            N/=a[N];
        }
        return ans;
    }
}