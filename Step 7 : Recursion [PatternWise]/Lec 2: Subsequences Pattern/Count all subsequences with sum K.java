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

// class Solution{

//     public:
//     int search(int n, int k, int a [], int index,  int sum){
//         if(sum==k){
//             return 1;
//         }
        
//         if(index>=n || sum>k){
//             return 0;
//         }
    
//         int p=search(n,k,a,index+1,sum+a[index]);
//         int q=search(n,k,a,index+1,sum);
//         return p+q;
//     }
    
//         public:
//         int perfectSum(int a[], int n, int k)
//         {
//             // Your code goes here
//             return search(n,k,a,0,0);
//         }
          
//     };