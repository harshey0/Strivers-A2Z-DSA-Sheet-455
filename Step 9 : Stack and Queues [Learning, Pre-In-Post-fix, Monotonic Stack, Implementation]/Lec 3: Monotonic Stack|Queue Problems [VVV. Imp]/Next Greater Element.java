class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int ans[]= new int [nums1.length];
        map.put(nums2[nums2.length-1],-1);
        for(int x=nums2.length-2;x>=0;x--)
       { 
        if(nums2[x]<nums2[x+1])
        {map.put(nums2[x],nums2[x+1]);s.push(nums2[x+1]);}
        else
        {
            while(!s.isEmpty() && s.peek()<=nums2[x])
            {
                s.pop();
            }
            int c=-1;
            if(!s.isEmpty())
            c=s.peek();
            map.put(nums2[x],c);
        }
       }
       for(int x=0;x<nums1.length;x++)
        ans[x]=map.get(nums1[x]);
        return ans;
    }
}