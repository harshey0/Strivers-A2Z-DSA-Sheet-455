class Solution{

	public int perfectSum(int a[],int n, int k) 
	{ 
	    // Your code goes here
	    int ans=0;
	    for(long x=0;x<(1<<n);x++)
        {
            int s=0;long p=x;int c=n-1;
            while(p>0)
            {
                s+=a[c]*(p&1);
                c--;p=p>>1;
            }
            if(s==k)
            ans++;
        }
        return ans;
	} 
}


class Solution{
    private static int mod =1000000007;
        public void check(int n, int k,int []a , int i , int ans[]) {
            // Write your code her
            if(i==n)
            {if(k==0)ans[0]=(1+ans[0])%mod;return;}
            check(n,k-a[i],a,i+1,ans);
            check(n,k,a,i+1,ans);
        }
        public int perfectSum(int a[],int n, int k) 
        { 
            int ans[]={0};
            check(n,k,a,0,ans);
            return ans[0];
        } 
    }