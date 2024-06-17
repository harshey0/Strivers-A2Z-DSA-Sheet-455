class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> dq = new LinkedList<>();
        int ans[]=new int[nums.length-k+1];

        for(int x=0;x<nums.length;x++)
        {
            if(!dq.isEmpty() && dq.peek()==x-k)
            dq.remove();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[x])
            dq.removeLast();

            dq.add(x);

            if(x>=k-1)
            ans[x-k+1]=nums[dq.peek()];
        }
        return ans;
    }
}


// class Pair{
//     int a,b;
//     Pair(int a, int b)
//     {
//         this.a=a;
//         this.b=b;
//     }
// }

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
        
//         PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->y.a-x.a);
//         int ans[]=new int[nums.length-k+1];
//         int max = nums[0];
//         for(int x=0;x<k;x++)
//         {
//             pq.add(new Pair(nums[x],x));
//         }
//         ans[0]=pq.peek().a;
//         for(int x=k;x<nums.length;x++)
//         {
//             pq.add(new Pair(nums[x],x));
//             while(pq.peek().b<x-k+1)
//             {
//                 pq.remove();
//             }
//             ans[x-k+1]=pq.peek().a;
//         }
//         return ans;
//     }
// }