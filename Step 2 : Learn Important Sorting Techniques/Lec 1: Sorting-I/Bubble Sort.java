class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int x=n;x>0;x--)
        {
            for(int y=1;y<x;y++)
            {
                if(arr[y]<arr[y-1])
                {
                    int c= arr[y-1];
                    arr[y-1]=arr[y];
                    arr[y]=c;
                }
            }
        }
    }
}