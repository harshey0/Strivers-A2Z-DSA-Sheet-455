class Solution {
    int print2largest(int arr[], int n) {
        // code here
         int l=arr[0],sl=-1;
    for (int i=1;i<n;i++)
    {
        if(arr[i]>l)
        {
            sl=l;
            l=arr[i];
        }
        else if(arr[i]<l && arr[i]>sl)
        {
            sl=arr[i];
        }
  
}
return sl;
    }
    
}