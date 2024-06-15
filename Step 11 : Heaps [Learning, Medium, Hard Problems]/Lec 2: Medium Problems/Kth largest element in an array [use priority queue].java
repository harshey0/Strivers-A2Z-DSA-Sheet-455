class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue(Comparator.reverseOrder());
        for(int x=0;x<nums.length;x++)
        pq.add(nums[x]);
        for(int x=0;x<k-1;x++)
        pq.remove();
        return pq.remove();
    }
}