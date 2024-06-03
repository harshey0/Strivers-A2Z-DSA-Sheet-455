class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      if(n==1)
      return;
         insertionSort(arr,n-1);
         int y=n-1;
      int last=arr[y];
       while(y>0 && last<arr[y-1] )
             {
                 arr[y]=arr[y-1];
                 y--;
             }
             arr[y]=last;
  }
}