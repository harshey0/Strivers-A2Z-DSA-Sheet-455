class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        if(n==1)
        return;
        for(int x=0;x<n-1;x++)
        if( arr[x]>arr[x+1])
        {
            int c = arr[x];
            arr[x]=arr[x+1];
            arr[x+1]=c;
        }
        bubbleSort(arr,n-1);
    }
}