class Pair{
    int a1 , a2;
    Pair(int x , int y)
    {
        a1=x;
        a2=y;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b) ->{
                return b.a2 - a.a2;
        });
        HashMap<Integer,Integer> s = new HashMap();
        int ans []=new int [k];
        for(int x=0;x<nums.length;x++)
        {
            s.put(nums[x],1+s.getOrDefault(nums[x],0));
        }
        for(Map.Entry<Integer, Integer> entry : s.entrySet())
        {
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        for(int x=0;x<k;x++)
        {
            ans[x]=pq.remove().a1;
        }
        return ans;
    }
}

// class Solution {

//     public int[] topKFrequent(int[] nums, int k) {

//         PriorityQueue<Map.Entry<Integer, Integer>>pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
//         HashMap<Integer,Integer> s = new HashMap();
//         int ans []=new int [k];
//         for(int x=0;x<nums.length;x++)
//         {
//             s.put(nums[x],1+s.getOrDefault(nums[x],0));
//         }
//         for(Map.Entry<Integer, Integer> entry : s.entrySet())
//         {
//             pq.add(entry);
//         }
//         for(int x=0;x<k;x++)
//         {
//             Map.Entry<Integer, Integer> entry=pq.remove();
//             ans[x]=entry.getKey();
//         }
//         return ans;
//     }
// }