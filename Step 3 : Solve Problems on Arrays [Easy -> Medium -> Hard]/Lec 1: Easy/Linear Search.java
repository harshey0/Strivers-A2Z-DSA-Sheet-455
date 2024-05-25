class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
         for(int x=0;x<N;x++)
        {
            if(arr[x]==K)
            return 1;
            if(arr[x]>K)
            return -1;
        }
            return -1;
    }
}