import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int max =0,c=1;
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