class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int x=1;x<n;x++)
      {
          for(int y=x;y>0;y--)
          {
              if(arr[y]<arr[y-1])
             {
                 int c=arr[y];
                 arr[y]=arr[y-1];
                 arr[y-1]=c;
                 
             }
             else 
             break;
            
          }
      }
  }
}