class KthLargest {

    int c;
    PriorityQueue<Integer>pq;
public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue();
        c=k;
        for(int x=0;x<nums.length;x++)
        {
            pq.add(nums[x]);
            if(pq.size()>c)
            pq.remove();
            }
}

public int add(int val) {
    
    pq.add(val);
     if(pq.size()>c)
      pq.remove();
    return pq.peek();
}
}