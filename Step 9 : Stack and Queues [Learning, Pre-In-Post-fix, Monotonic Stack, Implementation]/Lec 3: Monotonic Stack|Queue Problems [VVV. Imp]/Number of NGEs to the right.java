class Solution {
    public static int[] count_NGEs(int N, int arr[], int q, int i[]) {
      // code here
      int a[]=new int[q];
      
      for(int x=0;x<q;x++)
      {
          int c=0;
          for(int y=i[x]+1;y<arr.length;y++)
          if(arr[y]>arr[i[x]])
          c++;
          a[x]=c;
      }
      return a;
    }
  }