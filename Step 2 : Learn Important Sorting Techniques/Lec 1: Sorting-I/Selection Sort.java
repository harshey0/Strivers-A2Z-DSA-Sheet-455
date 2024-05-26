class Solution
{
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    for(int x=0;x<n;x++)
	    {
	        int min=arr[x];int p=0;
	        for(int y=x;y<n;y++)
	        {
	            if(arr[y]<min)
	            {min=arr[y];p=y;}
	        }
	        int c=arr[x];
	        arr[x]=arr[p];
	        arr[p]=c;
	    }
	}
}