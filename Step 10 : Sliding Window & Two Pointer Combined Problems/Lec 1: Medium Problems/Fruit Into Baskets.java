class Solution {
    public static int totalFruits(int n, int[] arr) {
        
        int max=0,s=0;int left=0;
        HashSet <Integer> set = new HashSet();
        for(int x=0;x<n;x++)
        {
            if(set.contains(arr[x]) || set.size()<2)
            {s++;set.add(arr[x]);}
            else
            {
             set.remove(arr[left-1]);
             set.add(arr[x]);
             s=x+1-left;
            }
            if(x>0 && arr[x]!=arr[x-1])
            left=x;
            
            max=Math.max(s,max);
        }
        return max;
    }
}