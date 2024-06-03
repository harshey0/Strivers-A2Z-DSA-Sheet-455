class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(high<=low)
        return;
        int pivot= high;
        int l=low;
        int h=high;
        while(high>low)
        {
           
           if(arr[high]>=arr[pivot])
           high--;
           else if(arr[low]<=arr[pivot])
           low++;
           else
           {
               int f= arr[high];
               arr[high] = arr[low];
               arr[low] = f;
               high--;
               low++;
           }
        }
        if(arr[low]>=arr[pivot])
        {
            int f= arr[low];
               arr[low] = arr[pivot];
               arr[pivot] = f;
               pivot=low;
        }
        else
        {
           int f= arr[low+1];
               arr[low+1] = arr[pivot];
               arr[pivot] = f;
               pivot=low+1;
        }
        quickSort(arr,l,pivot-1);
        quickSort(arr,pivot+1,h);

    }
}