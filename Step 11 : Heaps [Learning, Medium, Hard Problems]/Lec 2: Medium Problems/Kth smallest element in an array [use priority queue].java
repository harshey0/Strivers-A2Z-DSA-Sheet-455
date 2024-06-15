class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
       PriorityQueue<Integer>pq = new PriorityQueue();
        for(int x=l;x<=r;x++)
        pq.add(arr[x]);
        for(int x=0;x<k-1;x++)
        pq.remove();
        return pq.remove();
    } 
}