class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[]= new int[2];
     long s1=0,s2=0;
     long f1=(long)n*(n+1)/2;
     long f2=(long)n*(n+1)*(2*n+1)/6;
     for(int x=0;x<n;x++)
     {
         s1+=arr[x];
         s2+=(long)arr[x]*arr[x];
     }
     long m =s2-f2;
     long no = s1-f1;
     long s=m/no;
     long p=(s+no)/2;
     long q=(s-no)/2;
     ans[0]=(int)p;
     ans[1]=(int)q;
    
    return ans;
}
}