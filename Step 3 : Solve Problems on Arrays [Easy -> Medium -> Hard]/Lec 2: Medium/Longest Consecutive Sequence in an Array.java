class Solution {
    public int longestConsecutive(int[] a) {
             int max =1,c=1;
             if(a.length==0)
             return 0;
        Arrays.sort(a);
        for (int x =1;x<a.length;x++)
        {
            if(a[x-1]==a[x])
            continue;
          if(a[x-1]+1==a[x])
          c++;
          else
          c=1;
          max = Math.max(max,c);
        }
        return max;
    }
}