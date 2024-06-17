class Solution {
    static int solve(int bt[] ) {
    // code here
    PriorityQueue<Integer> pq = new PriorityQueue();
    
for(int x=0;x<bt.length;x++)
pq.add(bt[x]);

                int w=0;int p=0;
                for(int x=1;x<bt.length;x++)
                {
                    p+=pq.remove();
                    w+=p;
                }
                return w/bt.length;
  }
}