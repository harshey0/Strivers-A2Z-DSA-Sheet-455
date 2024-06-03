class Solution
{
    void merge(int arr[], int a, int b, int c, int d)
    {
        int temp []= new int[d-a+1];
        int p=a;
        for(int x=p;x<=d;x++)
        {
            if(c<=d && (a>b||arr[c]<arr[a]))
            {temp[x-p]=arr[c];c++;}
            else
            {temp[x-p]=arr[a];a++;}
            
        }
        for(int x=p;x<=d;x++)
        {
            arr[x]=temp[x-p];
        }
        return;
    }

    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(r<=l)
        return;
        mergeSort(arr,l,(l+r)/2);
        mergeSort(arr,(l+r)/2+1,r);
        merge(arr,l,(l+r)/2,(l+r)/2+1,r);
    }
}