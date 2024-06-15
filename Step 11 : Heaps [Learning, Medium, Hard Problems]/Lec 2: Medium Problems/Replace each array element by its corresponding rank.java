class Solution {
    static int[] replaceWithRank(int arr[], int n) {
     // code here
     PriorityQueue<Integer>pq = new PriorityQueue();
     HashMap<Integer,Integer> map = new HashMap();
     for(int x=0;x<n;x++)
     pq.add(arr[x]);
     int k=1;
     while(!pq.isEmpty())
     {
            int c= pq.remove();
            if(map.containsKey(c) || (!pq.isEmpty() && c==pq.peek()) )
            continue;
            map.put(c,k);
            k++;
     }
     
     for(int x=0;x<n;x++)
     {
         arr[x]=map.get(arr[x]);
     }
     return arr;
  }
}