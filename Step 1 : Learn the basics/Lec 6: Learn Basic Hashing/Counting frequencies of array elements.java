class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int []f= new int[P+1];
        for(int x=0;x<N;x++)
        f[arr[x]]++;
        for(int x=0;x<N;x++)
        {if(x+1>P)
        arr[x]=0;
        else
        arr[x]=f[x+1];}
    }
}