class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long a=0,b=x;
		while(b>=a)
		{
		    long mid= (a+b)/2;
		    if(mid*mid==x)
		    return mid;
		    if(mid*mid>x)
		    b=mid-1;
		    else
		    a=mid+1;
		}
		return b;
	 }
}