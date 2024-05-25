class Compute {
    
    public int largest(int arr[], int n)
    {
          int answ = arr[0];
    for (int i =1;i<n;i++)
    {
        if(arr[i]>answ)
        answ=arr[i];
    }
    return answ;
        
    }
}