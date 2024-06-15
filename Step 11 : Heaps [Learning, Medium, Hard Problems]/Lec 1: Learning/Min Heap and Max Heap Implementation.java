class MinHeap {
    int[] arr;
    int capacity;
    int s;
    MinHeap(int cap) {
        s = 0;
        capacity = cap;
        arr = new int[cap];
    }
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }

    //Function to extract minimum value in heap and then to store 
    //next minimum value at first index.
    int extractMin()
    {
        // Your code here.
        if(s==0)
        return -1;
        int k= arr[0];
        arr[0]=arr[s-1];
        arr[s-1]=k;
        s--;
        MinHeapify(0);
        return k;
    }

    //Function to insert a value in Heap.
    void insertKey(int k) 
    {
        // Your code here.
          if (s == capacity)
        return; 
        arr[s++]=k;
        int i=s-1;
        while(i>0 && arr[parent(i)]>k)
        {
            arr[i]=arr[parent(i)];
            arr[parent(i)]=k;
            i=parent(i);
        }
    }

    //Function to delete a key at ith index.
    void deleteKey(int i) 
    {
        // Your code here.
    if (i >= s)
        return;
    decreaseKey(i, Integer.MIN_VALUE);
    extractMin();
    }
    //Function to change value at ith index and store that value at first index.
    void decreaseKey(int i, int new_val) 
    {
        arr[i] = new_val;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    /* You may call below MinHeapify function in
      above codes. Please do not delete this code
      if you are not writing your own MinHeapify */
    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < s && arr[l] < arr[i]) smallest = l;
        if (r < s && arr[r] < arr[smallest]) smallest = r;
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            MinHeapify(smallest);
        }
    }
}