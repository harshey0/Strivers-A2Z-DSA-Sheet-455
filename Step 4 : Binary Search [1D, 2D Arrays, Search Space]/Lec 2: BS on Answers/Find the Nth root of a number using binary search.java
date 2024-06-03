class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int a=0,b=m;
		while(b>=a)
		{
		    int mid= (a+b)/2;
		    int p=(int)Math.pow(mid,n);
		    if(p==m)
		    return mid;
		    if(p>m)
		    b=mid-1;
		    else
		    a=mid+1;
		}
		return -1;
    }
}