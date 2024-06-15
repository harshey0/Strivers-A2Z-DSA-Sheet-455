class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList();
        PriorityQueue<Integer>pq = new PriorityQueue();
        
        for(int x=0;x<K;x++)
        {
            for(int y=0;y<K;y++)
            {
                pq.add(arr[x][y]);
            }
        }
        
        for(int x=0;x<K*K;x++)
        list.add(pq.remove());
        return list;
    }
}