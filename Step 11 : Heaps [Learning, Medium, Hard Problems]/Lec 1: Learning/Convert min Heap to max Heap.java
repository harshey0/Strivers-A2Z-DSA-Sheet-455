class Solution {
    
        static void heapify(int k, int arr[], int n) {
    // code here
        int l = 2*k +1;
        int r = 2*k +2;
        int p=k;
        if(l<n && arr[p]<arr[l])
        p=l;
        if(r<n && arr[p]<arr[r])
        p=r;
        if(p==k)
        return;
        int c=arr[p];
        arr[p]=arr[k];
        arr[k]=c;
        heapify(p,arr,n);
  }
    
    static void convertMinToMaxHeap(int n, int arr[]) {
    // code here
        
        for(int x=n/2;x>=0;x--)
        heapify(x,arr,n);
  }
}